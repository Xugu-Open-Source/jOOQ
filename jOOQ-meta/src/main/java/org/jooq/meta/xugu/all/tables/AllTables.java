package org.jooq.meta.xugu.all.tables;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.xugu.all.All;
import org.jooq.meta.xugu.all.Keys;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class AllTables extends TableImpl<Record> {

    private static final long serialVersionUID = 43722443;

    public static final AllTables ALL_TABLES = new AllTables();

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
     * 拥有者的用户ID
     */
    public final TableField<Record, Integer> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 模式ID
     */
    public final TableField<Record, Integer> SCHEMA_ID = createField(DSL.name("SCHEMA_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 表ID
     */
    public final TableField<Record, Integer> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 表名
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * 表类型（0:堆表；1:IOT表；2:外部文件表；3:虚拟表；4:函数表；5:远程表）
     */
    public final TableField<Record, Integer> TABLE_TYPE = createField(DSL.name("TABLE_TYPE"), SQLDataType.INTEGER, this, "");

    /**
     * 临时类型（0：非临时表；1：局部临时表；2：全局临时表）
     */
    public final TableField<Record, Integer> TEMP_TYPE = createField(DSL.name("TEMP_TYPE"), SQLDataType.INTEGER, this, "");

    /**
     * 字段数
     */
    public final TableField<Record, Integer> FIELD_NUM = createField(DSL.name("FIELD_NUM"), SQLDataType.INTEGER, this, "");

    /**
     * 分区类型（1:range分区；2:list分区；3:hash分区；4:spatial分区）
     */
    public final TableField<Record, Integer> PARTI_TYPE = createField(DSL.name("PARTI_TYPE"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 分区数
     */
    public final TableField<Record, Integer> PARTI_NUM = createField(DSL.name("PARTI_NUM"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 分区键
     */
    public final TableField<Record, String> PARTI_KEY = createField(DSL.name("PARTI_KEY"), SQLDataType.VARCHAR(1024).nullable(true), this, "");

    /**
     * 自动分区的类型（0：无；1：按年；2：按月；3：按天；4：按小时）
     */
    public final TableField<Record, Integer> AUTO_PARTI_TYPE = createField(DSL.name("AUTO_PARTI_TYPE"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 时段自动分区的时段长度
     */
    public final TableField<Record, Integer> AUTO_PARTI_SPAN = createField(DSL.name("AUTO_PARTI_SPAN"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 子分区类型（1:range分区；2:list分区；3:hash分区；4:spatial分区）
     */
    public final TableField<Record, Integer> SUBPARTI_TYPE = createField(DSL.name("SUBPARTI_TYPE"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 子分区数
     */
    public final TableField<Record, Integer> SUBPARTI_NUM = createField(DSL.name("SUBPARTI_TYPE"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 子分区键
     */
    public final TableField<Record, String> SUBPARTI_KEY = createField(DSL.name("SUBPARTI_KEY"), SQLDataType.VARCHAR(1024).nullable(true), this, "");

    /**
     * 全局存储号
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
     * 记录数
     */
    public final TableField<Record, Long> RECORD_NUM = createField(DSL.name("RECORD_NUM"), SQLDataType.BIGINT.nullable(true), this, "");

    /**
     * 块的预留置空间比例
     */
    public final TableField<Record, Integer> PCTFREE = createField(DSL.name("PCTFREE"), SQLDataType.INTEGER, this, "");

    /**
     * 插入操作的热点个数
     */
    public final TableField<Record, Integer> HOTSPOT_NUM = createField(DSL.name("HOTSPOT_NUM"), SQLDataType.INTEGER, this, "");

    /**
     * 该表的块是否使用高速缓存
     */
    public final TableField<Record, Boolean> USE_CACHE = createField(DSL.name("USE_CACHE"), SQLDataType.BOOLEAN, this, "");

    /**
     * 表是否允许在线修改
     */
    public final TableField<Record, Boolean> ONLINE = createField(DSL.name("ONLINE"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否系统内建
     */
    public final TableField<Record, Boolean> IS_SYS = createField(DSL.name("IS_SYS"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否是加密表
     */
    public final TableField<Record, Boolean> IS_ENCRY = createField(DSL.name("IS_ENCRY"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * 是否缓变
     */
    public final TableField<Record, Boolean> SLOW_MODIFY = createField(DSL.name("SLOW_MODIFY"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * 安全策略ID
     */
    public final TableField<Record, Integer> XLS_PID = createField(DSL.name("XLS_PID"), SQLDataType.INTEGER, this, "");

    /**
     * 安全策略字段
     */
    public final TableField<Record, Integer> XLS_COL_NO = createField(DSL.name("XLS_COL_NO"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 安全字段属性（0:不隐藏; 1:隐藏）
     */
    public final TableField<Record, Integer> XLS_COL_OPT = createField(DSL.name("XLS_COL_OPT"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 是否在事务结束时删除数据
     */
    public final TableField<Record, Boolean> ON_COMMIT_DEL = createField(DSL.name("ON_COMMIT_DEL"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否事务支持
     */
    public final TableField<Record, Boolean> ENA_TRANS = createField(DSL.name("ENA_TRANS"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否记redo日志
     */
    public final TableField<Record, Boolean> ENA_LOGGING = createField(DSL.name("ENA_LOGGING"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否记载变更日志
     */
    public final TableField<Record, Boolean> REG_MODIFY = createField(DSL.name("REG_MODIFY"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * 是否有效
     */
    public final TableField<Record, Boolean> VALID = createField(DSL.name("VALID"), SQLDataType.BOOLEAN, this, "");

    /**
     * 权限掩码
     */
    public final TableField<Record, Integer> ACL_MASK = createField(DSL.name("ACL_MASK"), SQLDataType.INTEGER, this, "");

    /**
     * 时段自动分区的扩展基点分区号
     */
    public final TableField<Record, Integer> AUTO_PARTI_NO = createField(DSL.name("AUTO_PARTI_NO"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 创建时间
     */
    public final TableField<Record, LocalDateTime> CREATE_TIME = createField(DSL.name("CREATE_TIME"), SQLDataType.LOCALDATETIME, this, "");

    /**
     * 注释信息
     */
    public final TableField<Record, String> COMMENTS = createField(DSL.name("COMMENTS"), SQLDataType.VARCHAR(128).nullable(true), this, "");

    /**
     * 分析策略（默认为1）
     */
    public final TableField<Record, Integer> ANA_POLICY = createField(DSL.name("ANA_POLICY"), SQLDataType.INTEGER, this, "");

    /**
     * 分析周期（默认为null,[30,1440]）
     */
    public final TableField<Record, Integer> ANA_PERIOD = createField(DSL.name("ANA_PERIOD"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 分析阈值（默认为null,[1,100]）
     */
    public final TableField<Record, Integer> ANA_THRESHOLD = createField(DSL.name("ANA_THRESHOLD"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 采样层级
     */
    public final TableField<Record, Integer> ANA_LEVEL = createField(DSL.name("ANA_LEVEL"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 密钥ID
     *
     * @since XuguDB v12
     */
    public final TableField<Record, Integer> ENCRY_ID = createField(DSL.name("ENCRY_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 存储域编号
     *
     * @since XuguDB v12
     */
    public final TableField<Record, Integer> STO_ZONE = createField(DSL.name("STO_ZONE"), SQLDataType.INTEGER, this, "");

    /**
     * HASH缓存键
     *
     * @since XuguDB v12
     */
    public final TableField<Record, String> CACHE_HASH_KEY = createField(DSL.name("CACHE_HASH_KEY"), SQLDataType.VARCHAR(1024).nullable(true), this, "");

    /**
     * 压缩等级（0:禁用数据压缩（默认）；1：启用数据压缩）
     *
     * @since XuguDB v12
     */
    public final TableField<Record, String> COMPRESS_LEVEL = createField(DSL.name("COMPRESS_LEVEL"), SQLDataType.VARCHAR(1024), this, "");

    /**
     * 保留字段
     */
    public final TableField<Record, String> RESERVED5 = createField(DSL.name("RESERVED5"), SQLDataType.VARCHAR(128), this, "");

    private AllTables(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private AllTables(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.ALL_TABLES</code> table reference
     */
    public AllTables(String alias) {
        this(DSL.name(alias), ALL_TABLES);
    }

    /**
     * Create an aliased <code>information_schema.ALL_TABLES</code> table reference
     */
    public AllTables(Name alias) {
        this(alias, ALL_TABLES);
    }

    /**
     * Create a <code>information_schema.ALL_TABLES</code> table reference
     */
    public AllTables() {
        this(DSL.name("ALL_TABLES"), null);
    }


    public <O extends Record> AllTables(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ALL_TABLES);
    }

    @Override
    public Schema getSchema() {
        return All.ALL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_ALL_TABLES;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.SYNTHETIC_PK_ALL_TABLES);
    }

    @Override
    public AllTables as(String alias) {
        return new AllTables(DSL.name(alias), this);
    }

    @Override
    public AllTables as(Name alias) {
        return new AllTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AllTables rename(String name) {
        return new AllTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AllTables rename(Name name) {
        return new AllTables(name, null);
    }
}
