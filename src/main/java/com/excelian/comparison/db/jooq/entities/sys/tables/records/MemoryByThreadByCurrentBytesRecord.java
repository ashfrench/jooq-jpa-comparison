/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.tables.records;


import com.excelian.comparison.db.jooq.entities.sys.tables.MemoryByThreadByCurrentBytes;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class MemoryByThreadByCurrentBytesRecord extends TableRecordImpl<MemoryByThreadByCurrentBytesRecord> implements Record7<ULong, String, BigInteger, String, String, String, String> {

    private static final long serialVersionUID = -468086894;

    /**
     * Setter for <code>sys.memory_by_thread_by_current_bytes.thread_id</code>.
     */
    public void setThreadId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.memory_by_thread_by_current_bytes.thread_id</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>sys.memory_by_thread_by_current_bytes.user</code>.
     */
    public void setUser(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.memory_by_thread_by_current_bytes.user</code>.
     */
    public String getUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.memory_by_thread_by_current_bytes.current_count_used</code>.
     */
    public void setCurrentCountUsed(BigInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.memory_by_thread_by_current_bytes.current_count_used</code>.
     */
    public BigInteger getCurrentCountUsed() {
        return (BigInteger) get(2);
    }

    /**
     * Setter for <code>sys.memory_by_thread_by_current_bytes.current_allocated</code>.
     */
    public void setCurrentAllocated(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.memory_by_thread_by_current_bytes.current_allocated</code>.
     */
    public String getCurrentAllocated() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.memory_by_thread_by_current_bytes.current_avg_alloc</code>.
     */
    public void setCurrentAvgAlloc(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.memory_by_thread_by_current_bytes.current_avg_alloc</code>.
     */
    public String getCurrentAvgAlloc() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sys.memory_by_thread_by_current_bytes.current_max_alloc</code>.
     */
    public void setCurrentMaxAlloc(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.memory_by_thread_by_current_bytes.current_max_alloc</code>.
     */
    public String getCurrentMaxAlloc() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sys.memory_by_thread_by_current_bytes.total_allocated</code>.
     */
    public void setTotalAllocated(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.memory_by_thread_by_current_bytes.total_allocated</code>.
     */
    public String getTotalAllocated() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<ULong, String, BigInteger, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<ULong, String, BigInteger, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES.THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field3() {
        return MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES.CURRENT_COUNT_USED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES.CURRENT_ALLOCATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES.CURRENT_AVG_ALLOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES.CURRENT_MAX_ALLOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES.TOTAL_ALLOCATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value3() {
        return getCurrentCountUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCurrentAllocated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCurrentAvgAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCurrentMaxAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTotalAllocated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemoryByThreadByCurrentBytesRecord value1(ULong value) {
        setThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemoryByThreadByCurrentBytesRecord value2(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemoryByThreadByCurrentBytesRecord value3(BigInteger value) {
        setCurrentCountUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemoryByThreadByCurrentBytesRecord value4(String value) {
        setCurrentAllocated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemoryByThreadByCurrentBytesRecord value5(String value) {
        setCurrentAvgAlloc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemoryByThreadByCurrentBytesRecord value6(String value) {
        setCurrentMaxAlloc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemoryByThreadByCurrentBytesRecord value7(String value) {
        setTotalAllocated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemoryByThreadByCurrentBytesRecord values(ULong value1, String value2, BigInteger value3, String value4, String value5, String value6, String value7) {
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
     * Create a detached MemoryByThreadByCurrentBytesRecord
     */
    public MemoryByThreadByCurrentBytesRecord() {
        super(MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES);
    }

    /**
     * Create a detached, initialised MemoryByThreadByCurrentBytesRecord
     */
    public MemoryByThreadByCurrentBytesRecord(ULong threadId, String user, BigInteger currentCountUsed, String currentAllocated, String currentAvgAlloc, String currentMaxAlloc, String totalAllocated) {
        super(MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES);

        set(0, threadId);
        set(1, user);
        set(2, currentCountUsed);
        set(3, currentAllocated);
        set(4, currentAvgAlloc);
        set(5, currentMaxAlloc);
        set(6, totalAllocated);
    }
}
