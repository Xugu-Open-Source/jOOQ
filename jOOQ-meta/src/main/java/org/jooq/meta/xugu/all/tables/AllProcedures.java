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

package org.jooq.meta.xugu.all.tables;

import org.jooq.*;
import org.jooq.Record;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.xugu.all.All;
import org.jooq.meta.xugu.all.Keys;
import org.jooq.types.UInteger;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class AllProcedures extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.AllProcedures</code>
     */
    public static final AllProcedures ALL_PROCEDURES = new AllProcedures();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * 库ID
     */
    public final TableField<Record, Integer> DB_ID = createField(DSL.name("DB_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 模式ID
     */
    public final TableField<Record, Integer> SCHEMA_ID = createField(DSL.name("SCHEMA_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 属主ID
     */
    public final TableField<Record, Integer> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 过程ID
     */
    public final TableField<Record, Integer> PROC_ID = createField(DSL.name("PROC_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 过程或方法名
     */
    public final TableField<Record, String> PROC_NAME = createField(DSL.name("PROC_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * 语言
     */
    public final TableField<Record, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "");

    /**
     * 返回类型
     */
    public final TableField<Record, String> RET_TYPE = createField(DSL.name("RET_TYPE"), SQLDataType.VARCHAR(128), this, "");

    /**
     * 过程体的文本定义
     */
    public final TableField<Record, String> DEFINE = createField(DSL.name("DEFINE"), SQLDataType.CLOB, this, "");

    /**
     * 创建时间
     */
    public final TableField<Record, LocalDateTime> CREATE_TIME = createField(DSL.name("CREATE_TIME"), SQLDataType.LOCALDATETIME, this, "");

    /**
     * 是否有效
     */
    public final TableField<Record, Boolean> VALID = createField(DSL.name("VALID"), SQLDataType.BOOLEAN.defaultValue(true), this, "");

    /**
     * 注释信息
     */
    public final TableField<Record, String> COMMENTS = createField(DSL.name("COMMENTS"), SQLDataType.VARCHAR.nullable(true), this, "");

    /**
     * 是否系统内建
     */
    public final TableField<Record, Boolean> IS_SYS = createField(DSL.name("IS_SYS"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否为管道函数
     * xugudb v12 新增
     */
    public final TableField<Record, Boolean> PIPELINED = createField(DSL.name("PIPELINED"), SQLDataType.BOOLEAN, this, "");

    /**
     * 保留字段
     */
    public final TableField<Record, String> RESERVED1 = createField(DSL.name("RESERVED1"), SQLDataType.VARCHAR(128).nullable(true), this, "");

    /**
     * 保留字段
     */
    public final TableField<Record, String> RESERVED2 = createField(DSL.name("RESERVED2"), SQLDataType.VARCHAR(128).nullable(true), this, "");

    private AllProcedures(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private AllProcedures(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>All.AllProcedures</code> table reference
     */
    public AllProcedures(String alias) {
        this(DSL.name(alias), ALL_PROCEDURES);
    }

    /**
     * Create an aliased <code>All.AllProcedures</code> table reference
     */
    public AllProcedures(Name alias) {
        this(alias, ALL_PROCEDURES);
    }

    /**
     * Create a <code>All.AllProcedures</code> table reference
     */
    public AllProcedures() {
        this(DSL.name("ALL_PROCEDURES"), null);
    }

    public <O extends Record> AllProcedures(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ALL_PROCEDURES);
    }

    @Override
    public Schema getSchema() {
        return All.ALL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_ALL_PROCEDURES;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.SYNTHETIC_PK_ALL_PROCEDURES);
    }

    @Override
    public AllProcedures as(String alias) {
        return new AllProcedures(DSL.name(alias), this);
    }

    @Override
    public AllProcedures as(Name alias) {
        return new AllProcedures(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AllProcedures rename(String name) {
        return new AllProcedures(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AllProcedures rename(Name name) {
        return new AllProcedures(name, null);
    }
}
