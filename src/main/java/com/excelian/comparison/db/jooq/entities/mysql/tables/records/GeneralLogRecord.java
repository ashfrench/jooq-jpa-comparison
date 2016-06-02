/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.mysql.tables.records;


import com.excelian.comparison.db.jooq.entities.mysql.tables.GeneralLog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * General log
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GeneralLogRecord extends TableRecordImpl<GeneralLogRecord> implements Record6<Timestamp, String, ULong, UInteger, String, byte[]> {

    private static final long serialVersionUID = 782616233;

    /**
     * Setter for <code>mysql.general_log.event_time</code>.
     */
    public void setEventTime(Timestamp value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.general_log.event_time</code>.
     */
    public Timestamp getEventTime() {
        return (Timestamp) get(0);
    }

    /**
     * Setter for <code>mysql.general_log.user_host</code>.
     */
    public void setUserHost(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.general_log.user_host</code>.
     */
    public String getUserHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.general_log.thread_id</code>.
     */
    public void setThreadId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.general_log.thread_id</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>mysql.general_log.server_id</code>.
     */
    public void setServerId(UInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.general_log.server_id</code>.
     */
    public UInteger getServerId() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>mysql.general_log.command_type</code>.
     */
    public void setCommandType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.general_log.command_type</code>.
     */
    public String getCommandType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mysql.general_log.argument</code>.
     */
    public void setArgument(byte[] value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql.general_log.argument</code>.
     */
    public byte[] getArgument() {
        return (byte[]) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Timestamp, String, ULong, UInteger, String, byte[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Timestamp, String, ULong, UInteger, String, byte[]> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field1() {
        return GeneralLog.GENERAL_LOG.EVENT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GeneralLog.GENERAL_LOG.USER_HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return GeneralLog.GENERAL_LOG.THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field4() {
        return GeneralLog.GENERAL_LOG.SERVER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return GeneralLog.GENERAL_LOG.COMMAND_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field6() {
        return GeneralLog.GENERAL_LOG.ARGUMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value1() {
        return getEventTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUserHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value4() {
        return getServerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCommandType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value6() {
        return getArgument();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeneralLogRecord value1(Timestamp value) {
        setEventTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeneralLogRecord value2(String value) {
        setUserHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeneralLogRecord value3(ULong value) {
        setThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeneralLogRecord value4(UInteger value) {
        setServerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeneralLogRecord value5(String value) {
        setCommandType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeneralLogRecord value6(byte[] value) {
        setArgument(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeneralLogRecord values(Timestamp value1, String value2, ULong value3, UInteger value4, String value5, byte[] value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GeneralLogRecord
     */
    public GeneralLogRecord() {
        super(GeneralLog.GENERAL_LOG);
    }

    /**
     * Create a detached, initialised GeneralLogRecord
     */
    public GeneralLogRecord(Timestamp eventTime, String userHost, ULong threadId, UInteger serverId, String commandType, byte[] argument) {
        super(GeneralLog.GENERAL_LOG);

        set(0, eventTime);
        set(1, userHost);
        set(2, threadId);
        set(3, serverId);
        set(4, commandType);
        set(5, argument);
    }
}
