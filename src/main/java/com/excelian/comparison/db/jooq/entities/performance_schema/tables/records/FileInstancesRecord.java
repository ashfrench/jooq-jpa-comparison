/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.performance_schema.tables.records;


import com.excelian.comparison.db.jooq.entities.performance_schema.tables.FileInstances;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FileInstancesRecord extends TableRecordImpl<FileInstancesRecord> implements Record3<String, String, UInteger> {

    private static final long serialVersionUID = -178347031;

    /**
     * Setter for <code>performance_schema.file_instances.FILE_NAME</code>.
     */
    public void setFileName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.file_instances.FILE_NAME</code>.
     */
    public String getFileName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.file_instances.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.file_instances.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.file_instances.OPEN_COUNT</code>.
     */
    public void setOpenCount(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.file_instances.OPEN_COUNT</code>.
     */
    public UInteger getOpenCount() {
        return (UInteger) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, UInteger> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return FileInstances.FILE_INSTANCES.FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FileInstances.FILE_INSTANCES.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return FileInstances.FILE_INSTANCES.OPEN_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getOpenCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileInstancesRecord value1(String value) {
        setFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileInstancesRecord value2(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileInstancesRecord value3(UInteger value) {
        setOpenCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileInstancesRecord values(String value1, String value2, UInteger value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FileInstancesRecord
     */
    public FileInstancesRecord() {
        super(FileInstances.FILE_INSTANCES);
    }

    /**
     * Create a detached, initialised FileInstancesRecord
     */
    public FileInstancesRecord(String fileName, String eventName, UInteger openCount) {
        super(FileInstances.FILE_INSTANCES);

        set(0, fileName);
        set(1, eventName);
        set(2, openCount);
    }
}
