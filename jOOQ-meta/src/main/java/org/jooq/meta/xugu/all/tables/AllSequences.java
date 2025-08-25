package org.jooq.meta.xugu.all.tables;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.information_schema.tables.Sequences;
import org.jooq.meta.xugu.all.All;

import java.time.LocalDateTime;

/**
 * ALL_SEQUENCES系统视图用于存储和管理创建的序列值信息
 */
public class AllSequences extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    public static final AllSequences ALL_SEQUENCES = new AllSequences();

    @Override
    public Class<? extends Record> getRecordType() {
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
     * 序列值ID
     */
    public final TableField<Record, Integer> SEQ_ID = createField(DSL.name("SEQ_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 序列值产生器的名称
     */
    public final TableField<Record, String> SEQ_NAME = createField(DSL.name("SEQ_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * 是否循环
     */
    public final TableField<Record, Boolean> IS_CYCLE = createField(DSL.name("IS_CYCLE"), SQLDataType.BOOLEAN.defaultValue(true), this, "");

    /**
     * 是否有序
     */
    public final TableField<Record, Boolean> IS_ORDER = createField(DSL.name("IS_ORDER"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * 是否缓存一些序列值
     */
    public final TableField<Record, Integer> CACHE_VAL = createField(DSL.name("CACHE_VAL"), SQLDataType.INTEGER.defaultValue(1), this, "");

    /**
     * 当前值
     */
    public final TableField<Record, Long> CURR_VAL = createField(DSL.name("CURR_VAL"), SQLDataType.BIGINT, this, "");

    /**
     * 最大值
     */
    public final TableField<Record, Long> MAX_VAL = createField(DSL.name("MAX_VAL"), SQLDataType.BIGINT, this, "");

    /**
     * 最小值
     */
    public final TableField<Record, Long> MIN_VAL = createField(DSL.name("MIN_VAL"), SQLDataType.BIGINT, this, "");

    /**
     * 增长步长
     */
    public final TableField<Record, Long> STEP_VAL = createField(DSL.name("STEP_VAL"), SQLDataType.BIGINT, this, "");

    /**
     * 创建时间
     */
    public final TableField<Record, LocalDateTime> CREATE_TIME = createField(DSL.name("CREATE_TIME"), SQLDataType.LOCALDATETIME, this, "");

    /**
     * 是否系统内建
     */
    public final TableField<Record, Boolean> IS_SYS = createField(DSL.name("IS_SYS"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否有效
     */
    public final TableField<Record, Boolean> VALID = createField(DSL.name("VALID"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * 注释信息
     */
    public final TableField<Record, String> COMMENTS = createField(DSL.name("COMMENTS"), SQLDataType.VARCHAR(255).nullable(true), this, "");

    /**
     * 保留字段
     */
    public final TableField<Record, String> RESERVED1 = createField(DSL.name("RESERVED1"), SQLDataType.VARCHAR(255).nullable(true), this, "");

    /**
     * 保留字段
     */
    public final TableField<Record, String> RESERVED2 = createField(DSL.name("RESERVED2"), SQLDataType.VARCHAR(255).nullable(true), this, "");

    /**
     * 序列值产生器的名称
     * xugu 在 v12 新增的字段
     */
    public final TableField<Record, String> SEQUENCE_NAME = createField(DSL.name("SEQUENCE_NAME"), SQLDataType.VARCHAR(128), this, "");

    public AllSequences() {
        this(DSL.name("ALL_SEQUENCES"), null);
    }

    public AllSequences(String alias) {
        this(DSL.name(alias), ALL_SEQUENCES);
    }

    public AllSequences(Name alias) {
        this(alias, ALL_SEQUENCES);
    }

    private AllSequences(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }


    private AllSequences(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    @Override
    public Schema getSchema() {
        return All.ALL;
    }

    @Override
    public AllSequences as(String alias) {
        return new AllSequences(DSL.name(alias), this);
    }

    @Override
    public AllSequences as(Name alias) {
        return new AllSequences(alias, this);
    }

    @Override
    public AllSequences rename(String name) {
        return new AllSequences(DSL.name(name), null);
    }

    @Override
    public AllSequences rename(Name name) {
        return new AllSequences(name, null);
    }
}
