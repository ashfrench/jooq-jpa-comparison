/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.tables.records;


import com.excelian.comparison.db.jooq.entities.sys.tables.StatementsWithErrorsOrWarnings;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class StatementsWithErrorsOrWarningsRecord extends TableRecordImpl<StatementsWithErrorsOrWarningsRecord> implements Record10<String, String, ULong, ULong, BigDecimal, ULong, BigDecimal, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = 1466653483;

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.query</code>.
     */
    public void setQuery(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.query</code>.
     */
    public String getQuery() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.db</code>.
     */
    public void setDb(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.db</code>.
     */
    public String getDb() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.exec_count</code>.
     */
    public void setExecCount(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.exec_count</code>.
     */
    public ULong getExecCount() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.errors</code>.
     */
    public void setErrors(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.errors</code>.
     */
    public ULong getErrors() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.error_pct</code>.
     */
    public void setErrorPct(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.error_pct</code>.
     */
    public BigDecimal getErrorPct() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.warnings</code>.
     */
    public void setWarnings(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.warnings</code>.
     */
    public ULong getWarnings() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.warning_pct</code>.
     */
    public void setWarningPct(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.warning_pct</code>.
     */
    public BigDecimal getWarningPct() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.first_seen</code>.
     */
    public void setFirstSeen(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.first_seen</code>.
     */
    public Timestamp getFirstSeen() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.last_seen</code>.
     */
    public void setLastSeen(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.last_seen</code>.
     */
    public Timestamp getLastSeen() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>sys.statements_with_errors_or_warnings.digest</code>.
     */
    public void setDigest(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.statements_with_errors_or_warnings.digest</code>.
     */
    public String getDigest() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, ULong, ULong, BigDecimal, ULong, BigDecimal, Timestamp, Timestamp, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, ULong, ULong, BigDecimal, ULong, BigDecimal, Timestamp, Timestamp, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.QUERY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.EXEC_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.ERRORS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.ERROR_PCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.WARNINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.WARNING_PCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.FIRST_SEEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.LAST_SEEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS.DIGEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getExecCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getErrors();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getErrorPct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getWarnings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getWarningPct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getFirstSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getLastSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDigest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithErrorsOrWarningsRecord value1(String value) {
        setQuery(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithErrorsOrWarningsRecord value2(String value) {
        setDb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithErrorsOrWarningsRecord value3(ULong value) {
        setExecCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithErrorsOrWarningsRecord value4(ULong value) {
        setErrors(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithErrorsOrWarningsRecord value5(BigDecimal value) {
        setErrorPct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithErrorsOrWarningsRecord value6(ULong value) {
        setWarnings(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithErrorsOrWarningsRecord value7(BigDecimal value) {
        setWarningPct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithErrorsOrWarningsRecord value8(Timestamp value) {
        setFirstSeen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithErrorsOrWarningsRecord value9(Timestamp value) {
        setLastSeen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithErrorsOrWarningsRecord value10(String value) {
        setDigest(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithErrorsOrWarningsRecord values(String value1, String value2, ULong value3, ULong value4, BigDecimal value5, ULong value6, BigDecimal value7, Timestamp value8, Timestamp value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StatementsWithErrorsOrWarningsRecord
     */
    public StatementsWithErrorsOrWarningsRecord() {
        super(StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS);
    }

    /**
     * Create a detached, initialised StatementsWithErrorsOrWarningsRecord
     */
    public StatementsWithErrorsOrWarningsRecord(String query, String db, ULong execCount, ULong errors, BigDecimal errorPct, ULong warnings, BigDecimal warningPct, Timestamp firstSeen, Timestamp lastSeen, String digest) {
        super(StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS);

        set(0, query);
        set(1, db);
        set(2, execCount);
        set(3, errors);
        set(4, errorPct);
        set(5, warnings);
        set(6, warningPct);
        set(7, firstSeen);
        set(8, lastSeen);
        set(9, digest);
    }
}
