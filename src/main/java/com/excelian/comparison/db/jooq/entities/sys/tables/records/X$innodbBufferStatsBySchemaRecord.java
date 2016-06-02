/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.tables.records;


import com.excelian.comparison.db.jooq.entities.sys.tables.X$innodbBufferStatsBySchema;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


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
public class X$innodbBufferStatsBySchemaRecord extends TableRecordImpl<X$innodbBufferStatsBySchemaRecord> implements Record7<String, BigInteger, BigInteger, Long, Long, Long, BigInteger> {

    private static final long serialVersionUID = -2064220126;

    /**
     * Setter for <code>sys.x$innodb_buffer_stats_by_schema.object_schema</code>.
     */
    public void setObjectSchema(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$innodb_buffer_stats_by_schema.object_schema</code>.
     */
    public String getObjectSchema() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$innodb_buffer_stats_by_schema.allocated</code>.
     */
    public void setAllocated(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$innodb_buffer_stats_by_schema.allocated</code>.
     */
    public BigInteger getAllocated() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>sys.x$innodb_buffer_stats_by_schema.data</code>.
     */
    public void setData(BigInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$innodb_buffer_stats_by_schema.data</code>.
     */
    public BigInteger getData() {
        return (BigInteger) get(2);
    }

    /**
     * Setter for <code>sys.x$innodb_buffer_stats_by_schema.pages</code>.
     */
    public void setPages(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$innodb_buffer_stats_by_schema.pages</code>.
     */
    public Long getPages() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>sys.x$innodb_buffer_stats_by_schema.pages_hashed</code>.
     */
    public void setPagesHashed(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$innodb_buffer_stats_by_schema.pages_hashed</code>.
     */
    public Long getPagesHashed() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>sys.x$innodb_buffer_stats_by_schema.pages_old</code>.
     */
    public void setPagesOld(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$innodb_buffer_stats_by_schema.pages_old</code>.
     */
    public Long getPagesOld() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>sys.x$innodb_buffer_stats_by_schema.rows_cached</code>.
     */
    public void setRowsCached(BigInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$innodb_buffer_stats_by_schema.rows_cached</code>.
     */
    public BigInteger getRowsCached() {
        return (BigInteger) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, BigInteger, BigInteger, Long, Long, Long, BigInteger> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, BigInteger, BigInteger, Long, Long, Long, BigInteger> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return X$innodbBufferStatsBySchema.X$INNODB_BUFFER_STATS_BY_SCHEMA.OBJECT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return X$innodbBufferStatsBySchema.X$INNODB_BUFFER_STATS_BY_SCHEMA.ALLOCATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field3() {
        return X$innodbBufferStatsBySchema.X$INNODB_BUFFER_STATS_BY_SCHEMA.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return X$innodbBufferStatsBySchema.X$INNODB_BUFFER_STATS_BY_SCHEMA.PAGES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return X$innodbBufferStatsBySchema.X$INNODB_BUFFER_STATS_BY_SCHEMA.PAGES_HASHED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return X$innodbBufferStatsBySchema.X$INNODB_BUFFER_STATS_BY_SCHEMA.PAGES_OLD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field7() {
        return X$innodbBufferStatsBySchema.X$INNODB_BUFFER_STATS_BY_SCHEMA.ROWS_CACHED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getObjectSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value2() {
        return getAllocated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value3() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getPages();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getPagesHashed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getPagesOld();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value7() {
        return getRowsCached();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$innodbBufferStatsBySchemaRecord value1(String value) {
        setObjectSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$innodbBufferStatsBySchemaRecord value2(BigInteger value) {
        setAllocated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$innodbBufferStatsBySchemaRecord value3(BigInteger value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$innodbBufferStatsBySchemaRecord value4(Long value) {
        setPages(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$innodbBufferStatsBySchemaRecord value5(Long value) {
        setPagesHashed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$innodbBufferStatsBySchemaRecord value6(Long value) {
        setPagesOld(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$innodbBufferStatsBySchemaRecord value7(BigInteger value) {
        setRowsCached(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$innodbBufferStatsBySchemaRecord values(String value1, BigInteger value2, BigInteger value3, Long value4, Long value5, Long value6, BigInteger value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$innodbBufferStatsBySchemaRecord
     */
    public X$innodbBufferStatsBySchemaRecord() {
        super(X$innodbBufferStatsBySchema.X$INNODB_BUFFER_STATS_BY_SCHEMA);
    }

    /**
     * Create a detached, initialised X$innodbBufferStatsBySchemaRecord
     */
    public X$innodbBufferStatsBySchemaRecord(String objectSchema, BigInteger allocated, BigInteger data, Long pages, Long pagesHashed, Long pagesOld, BigInteger rowsCached) {
        super(X$innodbBufferStatsBySchema.X$INNODB_BUFFER_STATS_BY_SCHEMA);

        set(0, objectSchema);
        set(1, allocated);
        set(2, data);
        set(3, pages);
        set(4, pagesHashed);
        set(5, pagesOld);
        set(6, rowsCached);
    }
}
