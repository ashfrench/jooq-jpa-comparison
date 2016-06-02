/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.tables.records;


import com.excelian.comparison.db.jooq.entities.sys.tables.PsCheckLostInstrumentation;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class PsCheckLostInstrumentationRecord extends TableRecordImpl<PsCheckLostInstrumentationRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -1995723842;

    /**
     * Setter for <code>sys.ps_check_lost_instrumentation.variable_name</code>.
     */
    public void setVariableName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.ps_check_lost_instrumentation.variable_name</code>.
     */
    public String getVariableName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.ps_check_lost_instrumentation.variable_value</code>.
     */
    public void setVariableValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.ps_check_lost_instrumentation.variable_value</code>.
     */
    public String getVariableValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PsCheckLostInstrumentation.PS_CHECK_LOST_INSTRUMENTATION.VARIABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PsCheckLostInstrumentation.PS_CHECK_LOST_INSTRUMENTATION.VARIABLE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getVariableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getVariableValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsCheckLostInstrumentationRecord value1(String value) {
        setVariableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsCheckLostInstrumentationRecord value2(String value) {
        setVariableValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsCheckLostInstrumentationRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PsCheckLostInstrumentationRecord
     */
    public PsCheckLostInstrumentationRecord() {
        super(PsCheckLostInstrumentation.PS_CHECK_LOST_INSTRUMENTATION);
    }

    /**
     * Create a detached, initialised PsCheckLostInstrumentationRecord
     */
    public PsCheckLostInstrumentationRecord(String variableName, String variableValue) {
        super(PsCheckLostInstrumentation.PS_CHECK_LOST_INSTRUMENTATION);

        set(0, variableName);
        set(1, variableValue);
    }
}
