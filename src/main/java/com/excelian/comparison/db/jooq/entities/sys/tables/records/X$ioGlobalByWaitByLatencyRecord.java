/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.tables.records;


import com.excelian.comparison.db.jooq.entities.sys.tables.X$ioGlobalByWaitByLatency;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class X$ioGlobalByWaitByLatencyRecord extends TableRecordImpl<X$ioGlobalByWaitByLatencyRecord> implements Record14<String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, Long, BigDecimal, ULong, Long, BigDecimal> {

    private static final long serialVersionUID = 1300415188;

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.event_name</code>.
     */
    public void setEventName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.event_name</code>.
     */
    public String getEventName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.total</code>.
     */
    public void setTotal(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.avg_latency</code>.
     */
    public void setAvgLatency(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.avg_latency</code>.
     */
    public ULong getAvgLatency() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.max_latency</code>.
     */
    public void setMaxLatency(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.max_latency</code>.
     */
    public ULong getMaxLatency() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.read_latency</code>.
     */
    public void setReadLatency(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.read_latency</code>.
     */
    public ULong getReadLatency() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.write_latency</code>.
     */
    public void setWriteLatency(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.write_latency</code>.
     */
    public ULong getWriteLatency() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.misc_latency</code>.
     */
    public void setMiscLatency(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.misc_latency</code>.
     */
    public ULong getMiscLatency() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.count_read</code>.
     */
    public void setCountRead(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.count_read</code>.
     */
    public ULong getCountRead() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.total_read</code>.
     */
    public void setTotalRead(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.total_read</code>.
     */
    public Long getTotalRead() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.avg_read</code>.
     */
    public void setAvgRead(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.avg_read</code>.
     */
    public BigDecimal getAvgRead() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.count_write</code>.
     */
    public void setCountWrite(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.count_write</code>.
     */
    public ULong getCountWrite() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.total_written</code>.
     */
    public void setTotalWritten(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.total_written</code>.
     */
    public Long getTotalWritten() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>sys.x$io_global_by_wait_by_latency.avg_written</code>.
     */
    public void setAvgWritten(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>sys.x$io_global_by_wait_by_latency.avg_written</code>.
     */
    public BigDecimal getAvgWritten() {
        return (BigDecimal) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, Long, BigDecimal, ULong, Long, BigDecimal> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, Long, BigDecimal, ULong, Long, BigDecimal> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.AVG_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.MAX_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.READ_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.WRITE_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.MISC_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.COUNT_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.TOTAL_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.AVG_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field12() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.COUNT_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.TOTAL_WRITTEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field14() {
        return X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY.AVG_WRITTEN;
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
        return getAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getReadLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getWriteLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getMiscLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getCountRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getTotalRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getAvgRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value12() {
        return getCountWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getTotalWritten();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value14() {
        return getAvgWritten();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value1(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value2(ULong value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value3(ULong value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value4(ULong value) {
        setAvgLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value5(ULong value) {
        setMaxLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value6(ULong value) {
        setReadLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value7(ULong value) {
        setWriteLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value8(ULong value) {
        setMiscLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value9(ULong value) {
        setCountRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value10(Long value) {
        setTotalRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value11(BigDecimal value) {
        setAvgRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value12(ULong value) {
        setCountWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value13(Long value) {
        setTotalWritten(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord value14(BigDecimal value) {
        setAvgWritten(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatencyRecord values(String value1, ULong value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9, Long value10, BigDecimal value11, ULong value12, Long value13, BigDecimal value14) {
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
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$ioGlobalByWaitByLatencyRecord
     */
    public X$ioGlobalByWaitByLatencyRecord() {
        super(X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY);
    }

    /**
     * Create a detached, initialised X$ioGlobalByWaitByLatencyRecord
     */
    public X$ioGlobalByWaitByLatencyRecord(String eventName, ULong total, ULong totalLatency, ULong avgLatency, ULong maxLatency, ULong readLatency, ULong writeLatency, ULong miscLatency, ULong countRead, Long totalRead, BigDecimal avgRead, ULong countWrite, Long totalWritten, BigDecimal avgWritten) {
        super(X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY);

        set(0, eventName);
        set(1, total);
        set(2, totalLatency);
        set(3, avgLatency);
        set(4, maxLatency);
        set(5, readLatency);
        set(6, writeLatency);
        set(7, miscLatency);
        set(8, countRead);
        set(9, totalRead);
        set(10, avgRead);
        set(11, countWrite);
        set(12, totalWritten);
        set(13, avgWritten);
    }
}