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

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.Keywords.*;
import static org.jooq.impl.Names.*;
import static org.jooq.impl.SQLDataType.*;
import static org.jooq.impl.Tools.BooleanDataKey.*;
import static org.jooq.SQLDialect.*;

import org.jooq.*;
import org.jooq.impl.*;

import java.util.*;

/**
 * The <code>ALTER SCHEMA IF EXISTS</code> statement.
 */
@SuppressWarnings({ "hiding", "unused" })
final class AlterSchemaImpl
extends
    AbstractRowCountQuery
implements
    AlterSchemaStep,
    AlterSchemaFinalStep
{

    private static final long serialVersionUID = 1L;

    private final Schema  schema;
    private final boolean alterSchemaIfExists;
    private       Schema  renameTo;
    
    AlterSchemaImpl(
        Configuration configuration,
        Schema schema,
        boolean alterSchemaIfExists
    ) {
        this(
            configuration,
            schema,
            alterSchemaIfExists,
            null
        );
    }

    AlterSchemaImpl(
        Configuration configuration,
        Schema schema,
        boolean alterSchemaIfExists,
        Schema renameTo
    ) {
        super(configuration);

        this.schema = schema;
        this.alterSchemaIfExists = alterSchemaIfExists;
        this.renameTo = renameTo;
    }

    final Schema  $schema()              { return schema; }
    final boolean $alterSchemaIfExists() { return alterSchemaIfExists; }
    final Schema  $renameTo()            { return renameTo; }

    // -------------------------------------------------------------------------
    // XXX: DSL API
    // -------------------------------------------------------------------------
    
    @Override
    public final AlterSchemaImpl renameTo(String renameTo) {
        return renameTo(DSL.schema(DSL.name(renameTo)));
    }

    @Override
    public final AlterSchemaImpl renameTo(Name renameTo) {
        return renameTo(DSL.schema(renameTo));
    }

    @Override
    public final AlterSchemaImpl renameTo(Schema renameTo) {
        this.renameTo = renameTo;
        return this;
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------



    private static final Clause[]        CLAUSES               = { Clause.ALTER_SCHEMA };














    @Override
    public final void accept(Context<?> ctx) {








            accept0(ctx);
    }

    private final void accept0(Context<?> ctx) {
        ctx.start(Clause.ALTER_SCHEMA_SCHEMA);

        boolean supportRename = false;

        if (supportRename)
            ctx.visit(K_RENAME).sql(' ').visit(K_SCHEMA);
        else
            ctx.visit(K_ALTER_SCHEMA);

        if (alterSchemaIfExists)



                ctx.sql(' ').visit(K_IF_EXISTS);

        ctx.sql(' ').visit(schema)
           .end(Clause.ALTER_SCHEMA_SCHEMA)
           .formatIndentStart()
           .formatSeparator();

        if (renameTo != null) {
            boolean qualify = ctx.qualify();

            ctx.start(Clause.ALTER_SCHEMA_RENAME)
               .qualify(false)
               .visit(supportRename ? K_TO : K_RENAME_TO).sql(' ').visit(renameTo)
               .qualify(qualify)
               .end(Clause.ALTER_SCHEMA_RENAME);
        }

        ctx.formatIndentEnd();
    }

    @Override
    public final Clause[] clauses(Context<?> ctx) {
        return CLAUSES;
    }


}
