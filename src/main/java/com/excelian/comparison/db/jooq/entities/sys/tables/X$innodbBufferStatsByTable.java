/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.tables;


import com.excelian.comparison.db.jooq.entities.sys.Sys;
import com.excelian.comparison.db.jooq.entities.sys.tables.records.X$innodbBufferStatsByTableRecord;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$innodbBufferStatsByTable extends TableImpl<X$innodbBufferStatsByTableRecord> {

    private static final long serialVersionUID = 126191227;

    /**
     * The reference instance of <code>sys.x$innodb_buffer_stats_by_table</code>
     */
    public static final X$innodbBufferStatsByTable X$INNODB_BUFFER_STATS_BY_TABLE = new X$innodbBufferStatsByTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$innodbBufferStatsByTableRecord> getRecordType() {
        return X$innodbBufferStatsByTableRecord.class;
    }

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_table.object_schema</code>.
     */
    public final TableField<X$innodbBufferStatsByTableRecord, String> OBJECT_SCHEMA = createField("object_schema", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_table.object_name</code>.
     */
    public final TableField<X$innodbBufferStatsByTableRecord, String> OBJECT_NAME = createField("object_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_table.allocated</code>.
     */
    public final TableField<X$innodbBufferStatsByTableRecord, BigInteger> ALLOCATED = createField("allocated", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(43), this, "");

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_table.data</code>.
     */
    public final TableField<X$innodbBufferStatsByTableRecord, BigInteger> DATA = createField("data", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(43), this, "");

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_table.pages</code>.
     */
    public final TableField<X$innodbBufferStatsByTableRecord, Long> PAGES = createField("pages", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_table.pages_hashed</code>.
     */
    public final TableField<X$innodbBufferStatsByTableRecord, Long> PAGES_HASHED = createField("pages_hashed", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_table.pages_old</code>.
     */
    public final TableField<X$innodbBufferStatsByTableRecord, Long> PAGES_OLD = createField("pages_old", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_table.rows_cached</code>.
     */
    public final TableField<X$innodbBufferStatsByTableRecord, BigInteger> ROWS_CACHED = createField("rows_cached", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(44).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * Create a <code>sys.x$innodb_buffer_stats_by_table</code> table reference
     */
    public X$innodbBufferStatsByTable() {
        this("x$innodb_buffer_stats_by_table", null);
    }

    /**
     * Create an aliased <code>sys.x$innodb_buffer_stats_by_table</code> table reference
     */
    public X$innodbBufferStatsByTable(String alias) {
        this(alias, X$INNODB_BUFFER_STATS_BY_TABLE);
    }

    private X$innodbBufferStatsByTable(String alias, Table<X$innodbBufferStatsByTableRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$innodbBufferStatsByTable(String alias, Table<X$innodbBufferStatsByTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$innodbBufferStatsByTable as(String alias) {
        return new X$innodbBufferStatsByTable(alias, this);
    }

    /**
     * Rename this table
     */
    public X$innodbBufferStatsByTable rename(String name) {
        return new X$innodbBufferStatsByTable(name, null);
    }
}