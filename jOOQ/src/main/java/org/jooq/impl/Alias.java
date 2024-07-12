/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package org.jooq.impl;

import static java.lang.Boolean.TRUE;
import static org.jooq.Clause.FIELD;
import static org.jooq.Clause.FIELD_ALIAS;
import static org.jooq.Clause.FIELD_REFERENCE;
import static org.jooq.Clause.TABLE;
import static org.jooq.Clause.TABLE_ALIAS;
import static org.jooq.Clause.TABLE_REFERENCE;
// ...
// ...
// ...
// ...
// ...
import static org.jooq.SQLDialect.CUBRID;
import static org.jooq.SQLDialect.DERBY;
import static org.jooq.SQLDialect.FIREBIRD;
import static org.jooq.SQLDialect.H2;
// ...
import static org.jooq.SQLDialect.HSQLDB;
// ...
// ...
import static org.jooq.SQLDialect.MARIADB;
// ...
import static org.jooq.SQLDialect.MYSQL;
// ...
// ...
import static org.jooq.SQLDialect.POSTGRES;
// ...
import static org.jooq.SQLDialect.SQLITE;
// ...
// ...
// ...
import static org.jooq.impl.DSL.asterisk;
import static org.jooq.impl.DSL.falseCondition;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.select;
import static org.jooq.impl.Keywords.K_AS;
import static org.jooq.impl.QueryPartListView.wrap;
import static org.jooq.impl.Tools.fieldNames;
import static org.jooq.impl.Tools.visitSubquery;
import static org.jooq.impl.Tools.BooleanDataKey.DATA_AS_REQUIRED;
import static org.jooq.impl.Tools.BooleanDataKey.DATA_UNALIAS_ALIASED_EXPRESSIONS;
import static org.jooq.impl.Tools.DataKey.DATA_SELECT_ALIASES;
import static org.jooq.impl.Values.NO_SUPPORT_VALUES;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jooq.Clause;
import org.jooq.Context;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.Table;
import org.jooq.conf.RenderOptionalKeyword;

/**
 * @author Lukas Eder
 */
final class Alias<Q extends QueryPart> extends AbstractQueryPart {

    private static final long            serialVersionUID                      = -2456848365524191614L;
    private static final Clause[]        CLAUSES_TABLE_REFERENCE               = { TABLE, TABLE_REFERENCE };
    private static final Clause[]        CLAUSES_TABLE_ALIAS                   = { TABLE, TABLE_ALIAS };
    private static final Clause[]        CLAUSES_FIELD_REFERENCE               = { FIELD, FIELD_REFERENCE };
    private static final Clause[]        CLAUSES_FIELD_ALIAS                   = { FIELD, FIELD_ALIAS };
    private static final Set<SQLDialect> SUPPORT_AS_REQUIRED                   = SQLDialect.supportedBy(DERBY, HSQLDB, MARIADB, MYSQL, POSTGRES, SQLITE);
    private static final Set<SQLDialect> SUPPORT_DERIVED_COLUMN_NAMES_SPECIAL1 = SQLDialect.supportedBy(CUBRID, FIREBIRD, MYSQL);
    private static final Set<SQLDialect> SUPPORT_DERIVED_COLUMN_NAMES_SPECIAL2 = SQLDialect.supportedBy(MARIADB, MYSQL, SQLITE);
    private static final Set<SQLDialect> SUPPORT_DERIVED_COLUMN_NAMES_SPECIAL3 = SQLDialect.supportedBy(H2);

    final Q                              wrapped;
    final Q                              wrapping;
    final Name                           alias;
    final Name[]                         fieldAliases;
    final boolean                        wrapInParentheses;

    Alias(Q wrapped, Q wrapping, Name alias) {
        this(wrapped, wrapping, alias, null, false);
    }

    Alias(Q wrapped, Q wrapping, Name alias, boolean wrapInParentheses) {
        this(wrapped, wrapping, alias, null, wrapInParentheses);
    }

    Alias(Q wrapped, Q wrapping, Name alias, Name[] fieldAliases) {
        this(wrapped, wrapping, alias, fieldAliases, false);
    }

    Alias(Q wrapped, Q wrapping, Name alias, Name[] fieldAliases, boolean wrapInParentheses) {
        this.wrapped = wrapped;
        this.wrapping = wrapping;
        this.alias = alias;
        this.fieldAliases = fieldAliases;
        this.wrapInParentheses = wrapInParentheses;
    }

    final Q wrapped() {
        return wrapped;
    }

    @Override
    public final void accept(Context<?> context) {
        boolean qualify = context.qualify();









        if (context.declareAliases() && (context.declareFields() || context.declareTables())) {
            context.declareAliases(false);

            if (wrapped instanceof TableImpl)
                context.scopeMarkStart(wrapping);

            SQLDialect dialect = context.dialect();
            SQLDialect family = context.family();
            boolean emulatedDerivedColumnList = false;

            // [#454] [#1801] Some databases don't allow "derived column names" in
            // "simple class specifications", or "common table expression references".
            // Hence, wrap the table reference in a subselect
            if (fieldAliases != null
                    && SUPPORT_DERIVED_COLUMN_NAMES_SPECIAL1.contains(dialect)
                    && (wrapped instanceof TableImpl || wrapped instanceof CommonTableExpressionImpl)) {

                visitSubquery(context, select(asterisk()).from(((Table<?>) wrapped).as(alias)), true);
            }

            // [#1801] Some databases do not support "derived column names".
            // They can be emulated by concatenating a dummy SELECT with no
            // results using UNION ALL
            else if (fieldAliases != null && (
                    SUPPORT_DERIVED_COLUMN_NAMES_SPECIAL2.contains(dialect)
                 || SUPPORT_DERIVED_COLUMN_NAMES_SPECIAL3.contains(dialect))) {

                emulatedDerivedColumnList = true;

                if (wrapped instanceof Values && NO_SUPPORT_VALUES.contains(dialect)) {
                    Object previous = context.data(DATA_SELECT_ALIASES, fieldAliases);
                    toSQLWrapped(context);
                    context.data(DATA_SELECT_ALIASES, previous);
                }
                else {

                    // [#3156] Do not SELECT * from derived tables to prevent ambiguously defined columns
                    // in those derived tables
                    Select<? extends Record> wrappedAsSelect =
                        wrapped instanceof Select
                      ? (Select<?>) wrapped
                      : wrapped instanceof DerivedTable
                      ? ((DerivedTable<?>) wrapped).query()
                      : select(asterisk()).from(((Table<?>) wrapped).as(alias));

                    List<Field<?>> select = wrappedAsSelect.getSelect();

                    // [#9486] H2 cannot handle duplicate column names in derived tables, despite derived column lists
                    //         See: https://github.com/h2database/h2database/issues/2532
                    if (SUPPORT_DERIVED_COLUMN_NAMES_SPECIAL3.contains(dialect)) {
                        List<Name> names = fieldNames(select);

                        if (names.size() > 0 && names.size() == new HashSet<>(names).size()) {
                            toSQLWrapped(context);
                            emulatedDerivedColumnList = false;
                        }
                    }

                    if (emulatedDerivedColumnList) {
                        SelectFieldList<Field<?>> fields = new SelectFieldList<>();
                        for (int i = 0; i < fieldAliases.length; i++) {
                            switch (family) {


















                                default:
                                    fields.add(field("null").as(fieldAliases[i]));
                                    break;
                            }
                        }

                        visitSubquery(context, select(fields).where(falseCondition()).unionAll(wrappedAsSelect), true);
                    }
                }
            }

            // The default behaviour
            else {
                toSQLWrapped(context);
            }

            // [#291] some aliases cause trouble, if they are not explicitly marked using "as"
            toSQLAs(context);

            context.sql(' ')
                   .qualify(false)
                   .visit(alias)
                   .qualify(qualify);

            // [#1801] Add field aliases to the table alias, if applicable
            if (fieldAliases != null && !emulatedDerivedColumnList) {
                toSQLDerivedColumnList(context);
            }

            else {
                // [#756] If the aliased object is an anonymous table (usually an
                // unnested array), then field names must be part of the alias
                // declaration. For example:
                //
                // SELECT t.column_value FROM UNNEST(ARRAY[1, 2]) AS t(column_value)

                // TODO: Is this still needed?
                switch (family) {




                    case HSQLDB:
                    case POSTGRES: {
                        // The javac compiler doesn't like casting of generics
                        Object o = wrapped;

                        if (context.declareTables() && o instanceof ArrayTable)
                            context.sql('(')
                                   .visit(wrap(((ArrayTable) o).fields()).qualify(false).indentSize(0))
                                   .sql(')');

                        break;
                    }
                }
            }

            if (wrapped instanceof TableImpl)
                context.scopeMarkEnd(wrapping);

            context.declareAliases(true);
        }
        else {
            context.qualify(false)
                   .visit(alias)
                   .qualify(qualify);
        }
    }

    final void toSQLAs(Context<?> ctx) {

        // [#9925] In some cases, AS is always required, regardless
        //         of the dialect or settings (e.g. XMLATTRIBUTES).
        if (TRUE.equals(ctx.data(DATA_AS_REQUIRED))) {
            ctx.sql(' ').visit(K_AS);
        }
        else if (wrapped instanceof Field) {
            if (ctx.settings().getRenderOptionalAsKeywordForFieldAliases() == RenderOptionalKeyword.DEFAULT && SUPPORT_AS_REQUIRED.contains(ctx.dialect()))
                ctx.sql(' ').visit(K_AS);
            else if (ctx.settings().getRenderOptionalAsKeywordForFieldAliases() == RenderOptionalKeyword.ON)
                ctx.sql(' ').visit(K_AS);
        }
        else {
            if (ctx.settings().getRenderOptionalAsKeywordForTableAliases() == RenderOptionalKeyword.DEFAULT && SUPPORT_AS_REQUIRED.contains(ctx.dialect()))
                ctx.sql(' ').visit(K_AS);







            else if (ctx.settings().getRenderOptionalAsKeywordForTableAliases() == RenderOptionalKeyword.ON)
                ctx.sql(' ').visit(K_AS);
        }
    }

    private final void toSQLWrapped(Context<?> ctx) {
        ctx.sql(wrapInParentheses ? "(" : "")
           .visit(wrapped)
           .sql(wrapInParentheses ? ")" : "");
    }

    private final void toSQLDerivedColumnList(Context<?> ctx) {
        ctx.sql(" (").visit(wrap(fieldAliases).indentSize(0)).sql(')');
    }

    @Override
    public final Clause[] clauses(Context<?> ctx) {
        if (ctx.declareFields() || ctx.declareTables()) {
            if (wrapped instanceof Table)
                return CLAUSES_TABLE_ALIAS;
            else
                return CLAUSES_FIELD_ALIAS;
        }
        else {
            if (wrapped instanceof Table)
                return CLAUSES_TABLE_REFERENCE;
            else
                return CLAUSES_FIELD_REFERENCE;
        }
    }

    @Override
    public final boolean declaresFields() {
        return true;
    }

    @Override
    public final boolean declaresTables() {
        return true;
    }
}
