/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.tables.records;


import com.excelian.comparison.db.jooq.entities.sys.tables.X$ioGlobalByWaitByBytes;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class X$ioGlobalByWaitByBytesRecord extends TableRecordImpl<X$ioGlobalByWaitByBytesRecord> implements Record13<String, ULong, ULong, ULong, ULong, ULong, ULong, Long, BigDecimal, ULong, Long, BigDecimal, Long> {

    private static final long serialVersionUID = -977411458;

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_bytes.event_name</code>.
     */
    public void setEventName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_bytes.event_name</code>.
     */
    public String getEventName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_bytes.total</code>.
     */
    public void setTotal(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_bytes.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_bytes.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_bytes.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_bytes.min_latency</code>.
     */
    public void setMinLatency(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_bytes.min_latency</code>.
     */
    public ULong getMinLatency() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_bytes.avg_latency</code>.
     */
    public void setAvgLatency(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_bytes.avg_latency</code>.
     */
    public ULong getAvgLatency() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_bytes.max_latency</code>.
     */
    public void setMaxLatency(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_bytes.max_latency</code>.
     */
    public ULong getMaxLatency() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_bytes.count_read</code>.
     */
    public void setCountRead(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_bytes.count_read</code>.
     */
    public ULong getCountRead() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_bytes.total_read</code>.
     */
    public void setTotalRead(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_bytes.total_read</code>.
     */
    public Long getTotalRead() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_bytes.avg_read</code>.
     */
    public void setAvgRead(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_bytes.avg_read</code>.
     */
    public BigDecimal getAvgRead() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_bytes.count_write</code>.
     */
    public void setCountWrite(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_bytes.count_write</code>.
     */
    public ULong getCountWrite() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_bytes.total_written</code>.
     */
    public void setTotalWritten(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_bytes.total_written</code>.
     */
    public Long getTotalWritten() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_bytes.avg_written</code>.
     */
    public void setAvgWritten(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_bytes.avg_written</code>.
     */
    public BigDecimal getAvgWritten() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_bytes.total_requested</code>.
     */
    public void setTotalRequested(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_bytes.total_requested</code>.
     */
    public Long getTotalRequested() {
        return (Long) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, ULong, ULong, ULong, ULong, ULong, ULong, Long, BigDecimal, ULong, Long, BigDecimal, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, ULong, ULong, ULong, ULong, ULong, ULong, Long, BigDecimal, ULong, Long, BigDecimal, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES.MIN_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES.AVG_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES.MAX_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES.COUNT_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES.TOTAL_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES.AVG_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES.COUNT_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES.TOTAL_WRITTEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES.AVG_WRITTEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES.TOTAL_REQUESTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getMinLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getCountRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getTotalRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getAvgRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getCountWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getTotalWritten();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getAvgWritten();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getTotalRequested();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord value1(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord value2(ULong value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord value3(ULong value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord value4(ULong value) {
        setMinLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord value5(ULong value) {
        setAvgLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord value6(ULong value) {
        setMaxLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord value7(ULong value) {
        setCountRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord value8(Long value) {
        setTotalRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord value9(BigDecimal value) {
        setAvgRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord value10(ULong value) {
        setCountWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord value11(Long value) {
        setTotalWritten(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord value12(BigDecimal value) {
        setAvgWritten(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord value13(Long value) {
        setTotalRequested(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytesRecord values(String value1, ULong value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7, Long value8, BigDecimal value9, ULong value10, Long value11, BigDecimal value12, Long value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$ioGlobalByWaitByBytesRecord
     */
    public X$ioGlobalByWaitByBytesRecord() {
        super(X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES);
    }

    /**
     * Create a detached, initialised X$ioGlobalByWaitByBytesRecord
     */
    public X$ioGlobalByWaitByBytesRecord(String eventName, ULong total, ULong totalLatency, ULong minLatency, ULong avgLatency, ULong maxLatency, ULong countRead, Long totalRead, BigDecimal avgRead, ULong countWrite, Long totalWritten, BigDecimal avgWritten, Long totalRequested) {
        super(X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES);

        set(0, eventName);
        set(1, total);
        set(2, totalLatency);
        set(3, minLatency);
        set(4, avgLatency);
        set(5, maxLatency);
        set(6, countRead);
        set(7, totalRead);
        set(8, avgRead);
        set(9, countWrite);
        set(10, totalWritten);
        set(11, avgWritten);
        set(12, totalRequested);
    }
}
