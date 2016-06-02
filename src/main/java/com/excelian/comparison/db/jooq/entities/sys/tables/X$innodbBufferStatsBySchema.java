/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.tables;


import com.excelian.comparison.db.jooq.entities.sys.Sys;
import com.excelian.comparison.db.jooq.entities.sys.tables.records.X$innodbBufferStatsBySchemaRecord;

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
public class X$innodbBufferStatsBySchema extends TableImpl<X$innodbBufferStatsBySchemaRecord> {

    private static final long serialVersionUID = -92254475;

    /**
     * The reference instance of <code>sys.x$innodb_buffer_stats_by_schema</code>
     */
    public static final X$innodbBufferStatsBySchema X$INNODB_BUFFER_STATS_BY_SCHEMA = new X$innodbBufferStatsBySchema();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$innodbBufferStatsBySchemaRecord> getRecordType() {
        return X$innodbBufferStatsBySchemaRecord.class;
    }

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_schema.object_schema</code>.
     */
    public final TableField<X$innodbBufferStatsBySchemaRecord, String> OBJECT_SCHEMA = createField("object_schema", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_schema.allocated</code>.
     */
    public final TableField<X$innodbBufferStatsBySchemaRecord, BigInteger> ALLOCATED = createField("allocated", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(43), this, "");

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_schema.data</code>.
     */
    public final TableField<X$innodbBufferStatsBySchemaRecord, BigInteger> DATA = createField("data", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(43), this, "");

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_schema.pages</code>.
     */
    public final TableField<X$innodbBufferStatsBySchemaRecord, Long> PAGES = createField("pages", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_schema.pages_hashed</code>.
     */
    public final TableField<X$innodbBufferStatsBySchemaRecord, Long> PAGES_HASHED = createField("pages_hashed", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_schema.pages_old</code>.
     */
    public final TableField<X$innodbBufferStatsBySchemaRecord, Long> PAGES_OLD = createField("pages_old", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.x$innodb_buffer_stats_by_schema.rows_cached</code>.
     */
    public final TableField<X$innodbBufferStatsBySchemaRecord, BigInteger> ROWS_CACHED = createField("rows_cached", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(44).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * Create a <code>sys.x$innodb_buffer_stats_by_schema</code> table reference
     */
    public X$innodbBufferStatsBySchema() {
        this("x$innodb_buffer_stats_by_schema", null);
    }

    /**
     * Create an aliased <code>sys.x$innodb_buffer_stats_by_schema</code> table reference
     */
    public X$innodbBufferStatsBySchema(String alias) {
        this(alias, X$INNODB_BUFFER_STATS_BY_SCHEMA);
    }

    private X$innodbBufferStatsBySchema(String alias, Table<X$innodbBufferStatsBySchemaRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$innodbBufferStatsBySchema(String alias, Table<X$innodbBufferStatsBySchemaRecord> aliased, Field<?>[] parameters) {
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
    public X$innodbBufferStatsBySchema as(String alias) {
        return new X$innodbBufferStatsBySchema(alias, this);
    }

    /**
     * Rename this table
     */
    public X$innodbBufferStatsBySchema rename(String name) {
        return new X$innodbBufferStatsBySchema(name, null);
    }
}
