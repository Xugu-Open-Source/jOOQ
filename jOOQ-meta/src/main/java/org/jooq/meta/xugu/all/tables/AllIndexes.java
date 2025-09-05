package org.jooq.meta.xugu.all.tables;

import org.jooq.*;
import org.jooq.Record;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.xugu.all.All;
import org.jooq.types.UInteger;

import java.time.LocalDateTime;

public class AllIndexes extends TableImpl<Record> {

    private static final long serialVersionUID = -277536801;

    public static final AllIndexes ALL_INDEXES = new AllIndexes();

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
     * 主表ID
     */
    public final TableField<Record, Integer> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 索引ID
     */
    public final TableField<Record, Integer> INDEX_ID = createField(DSL.name("INDEX_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 索引名
     */
    public final TableField<Record, String> INDEX_NAME = createField(DSL.name("INDEX_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * 索引类型
     */
    public final TableField<Record, Integer> INDEX_TYPE = createField(DSL.name("INDEX_TYPE"), SQLDataType.INTEGER, this, "");

    /**
     * 判断是否为主键
     */
    public final TableField<Record, Boolean> IS_PRIMARY = createField(DSL.name("IS_PRIMARY"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否唯一值
     */
    public final TableField<Record, Boolean> IS_UNIQUE = createField(DSL.name("IS_UNIQUE"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否局部索引（若是局部则分区方式与主表同）
     */
    public final TableField<Record, Boolean> IS_LOCAL = createField(DSL.name("IS_LOCAL"), SQLDataType.BOOLEAN, this, "");

    /**
     * 分区类型（0：无分区；1：范围；2：列表；3：hash）
     */
    public final TableField<Record, Integer> PARTI_TYPE = createField(DSL.name("PARTI_TYPE"), SQLDataType.INTEGER, this, "");

    /**
     * 分区数
     */
    public final TableField<Record, Integer> PARTI_NUM = createField(DSL.name("PARTI_NUM"), SQLDataType.INTEGER, this, "");

    /**
     * 分区键
     */
    public final TableField<Record, String> PARTI_KEY = createField(DSL.name("PARTI_KEY"), SQLDataType.VARCHAR(1024).nullable(true), this, "");

    /**
     * 子分区类型（0：无分区；1：范围；2：列表；3：hash）
     */
    public final TableField<Record, Integer> SUBPARTI_TYPE = createField(DSL.name("SUBPARTI_TYPE"), SQLDataType.INTEGER, this, "");

    /**
     * 子分区数
     */
    public final TableField<Record, Integer> SUBPARTI_NUM = createField(DSL.name("SUBPARTI_NUM"), SQLDataType.INTEGER, this, "");

    /**
     * 子分区键
     */
    public final TableField<Record, String> SUBPARTI_KEY = createField(DSL.name("SUBPARTI_KEY"), SQLDataType.VARCHAR(1024).nullable(true), this, "");

    /**
     * 存贮号
     */
    public final TableField<Record, Integer> GSTO_NO = createField(DSL.name("GSTO_NO"), SQLDataType.INTEGER, this, "");

    /**
     * 副本数
     */
    public final TableField<Record, Integer> COPY_NUM = createField(DSL.name("COPY_NUM"), SQLDataType.INTEGER, this, "");

    /**
     * 块大小（单位：K）
     */
    public final TableField<Record, Integer> BLOCK_SIZE = createField(DSL.name("BLOCK_SIZE"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 存贮单元大小（单位：M）
     */
    public final TableField<Record, Integer> CHUNK_SIZE = createField(DSL.name("CHUNK_SIZE"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 存贮单元大小（单位：M）
     */
    public final TableField<Record, Integer> FIELD_NUM = createField(DSL.name("FIELD_NUM"), SQLDataType.INTEGER, this, "");

    /**
     * 索引键（字段或函数，用逗号分隔）
     */
    public final TableField<Record, String> KEYS = createField(DSL.name("KEYS"), SQLDataType.VARCHAR, this, "");

    /**
     * 文档过滤器名
     */
    public final TableField<Record, String> FILTER = createField(DSL.name("FILTER"), SQLDataType.VARCHAR(128).nullable(true), this, "");

    /**
     * 词表名
     */
    public final TableField<Record, String> VOCABLE = createField(DSL.name("VOCABLE"), SQLDataType.VARCHAR(128).nullable(true), this, "");

    /**
     * 语法分析器名
     */
    public final TableField<Record, String> LEXER = createField(DSL.name("LEXER"), SQLDataType.VARCHAR(128).nullable(true), this, "");

    /**
     * 词分割长度
     */
    public final TableField<Record, Integer> WORD_LEN = createField(DSL.name("WORD_LEN"), SQLDataType.INTEGER, this, "");

    /**
     * 是否需要进行事务支持
     */
    public final TableField<Record, Boolean> ENABLE_TRANS = createField(DSL.name("ENABLE_TRANS"), SQLDataType.BOOLEAN, this, "");

    /**
     * 首次创建时间
     */
    public final TableField<Record, LocalDateTime> CREATE_TIME = createField(DSL.name("CREATE_TIME"), SQLDataType.LOCALDATETIME, this, "");

    /**
     * 是否系统内建
     */
    public final TableField<Record, Boolean> IS_SYS = createField(DSL.name("IS_SYS"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否KEEP CACHE
     */
    public final TableField<Record, Boolean> KEEPIN_CACHE = createField(DSL.name("KEEPIN_CACHE"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * 是否不记redo日志
     */
    public final TableField<Record, Boolean> NOLOGGING = createField(DSL.name("NOLOGGING"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否有效
     */
    public final TableField<Record, Byte> VALID = createField(DSL.name("VALID"), SQLDataType.TINYINT, this, "");

    /**
     * 是否开启缓变
     *
     * @since XuguDB v12
     */
    public final TableField<Record, Boolean> SLOW_MODIFY = createField(DSL.name("SLOW_MODIFY"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * online日志ID
     *
     * @since XuguDB v12
     */
    public final TableField<Record, Integer> ONLINELOG_ID = createField(DSL.name("ONLINELOG_ID"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 保留字段
     */
    public final TableField<Record, String> RESERVED3 = createField(DSL.name("RESERVED3"), SQLDataType.VARCHAR(128).nullable(true), this, "");

    private AllIndexes(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private AllIndexes(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ALL.AllIndexes</code> table reference
     */
    public AllIndexes(String alias) {
        this(DSL.name(alias), ALL_INDEXES);
    }

    /**
     * Create an aliased <code>ALL.AllIndexes</code> table reference
     */
    public AllIndexes(Name alias) {
        this(alias, ALL_INDEXES);
    }

    /**
     * Create a <code>ALL.AllIndexes</code> table reference
     */
    public AllIndexes() {
        this(DSL.name("ALL_INDEXES"), null);
    }

    public <O extends Record> AllIndexes(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ALL_INDEXES);
    }

    @Override
    public Schema getSchema() {
        return All.ALL;
    }

    @Override
    public AllIndexes as(String alias) {
        return new AllIndexes(DSL.name(alias), this);
    }

    @Override
    public AllIndexes as(Name alias) {
        return new AllIndexes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AllIndexes rename(String name) {
        return new AllIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AllIndexes rename(Name name) {
        return new AllIndexes(name, null);
    }
}

