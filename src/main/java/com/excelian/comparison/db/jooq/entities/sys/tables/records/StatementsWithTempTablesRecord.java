/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.tables.records;


import com.excelian.comparison.db.jooq.entities.sys.tables.StatementsWithTempTables;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class StatementsWithTempTablesRecord extends TableRecordImpl<StatementsWithTempTablesRecord> implements Record11<String, String, ULong, String, ULong, ULong, BigInteger, BigInteger, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = -1002688625;

    /**
     * Setter for <code>sys.statements_with_temp_tables.query</code>.
     */
    public void setQuery(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.statements_with_temp_tables.query</code>.
     */
    public String getQuery() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.statements_with_temp_tables.db</code>.
     */
    public void setDb(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.statements_with_temp_tables.db</code>.
     */
    public String getDb() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.statements_with_temp_tables.exec_count</code>.
     */
    public void setExecCount(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.statements_with_temp_tables.exec_count</code>.
     */
    public ULong getExecCount() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.statements_with_temp_tables.total_latency</code>.
     */
    public void setTotalLatency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.statements_with_temp_tables.total_latency</code>.
     */
    public String getTotalLatency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.statements_with_temp_tables.memory_tmp_tables</code>.
     */
    public void setMemoryTmpTables(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.statements_with_temp_tables.memory_tmp_tables</code>.
     */
    public ULong getMemoryTmpTables() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.statements_with_temp_tables.disk_tmp_tables</code>.
     */
    public void setDiskTmpTables(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.statements_with_temp_tables.disk_tmp_tables</code>.
     */
    public ULong getDiskTmpTables() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.statements_with_temp_tables.avg_tmp_tables_per_query</code>.
     */
    public void setAvgTmpTablesPerQuery(BigInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.statements_with_temp_tables.avg_tmp_tables_per_query</code>.
     */
    public BigInteger getAvgTmpTablesPerQuery() {
        return (BigInteger) get(6);
    }

    /**
     * Setter for <code>sys.statements_with_temp_tables.tmp_tables_to_disk_pct</code>.
     */
    public void setTmpTablesToDiskPct(BigInteger value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.statements_with_temp_tables.tmp_tables_to_disk_pct</code>.
     */
    public BigInteger getTmpTablesToDiskPct() {
        return (BigInteger) get(7);
    }

    /**
     * Setter for <code>sys.statements_with_temp_tables.first_seen</code>.
     */
    public void setFirstSeen(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.statements_with_temp_tables.first_seen</code>.
     */
    public Timestamp getFirstSeen() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>sys.statements_with_temp_tables.last_seen</code>.
     */
    public void setLastSeen(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.statements_with_temp_tables.last_seen</code>.
     */
    public Timestamp getLastSeen() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>sys.statements_with_temp_tables.digest</code>.
     */
    public void setDigest(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.statements_with_temp_tables.digest</code>.
     */
    public String getDigest() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, ULong, String, ULong, ULong, BigInteger, BigInteger, Timestamp, Timestamp, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, ULong, String, ULong, ULong, BigInteger, BigInteger, Timestamp, Timestamp, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES.QUERY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES.DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES.EXEC_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES.MEMORY_TMP_TABLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES.DISK_TMP_TABLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field7() {
        return StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES.AVG_TMP_TABLES_PER_QUERY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field8() {
        return StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES.TMP_TABLES_TO_DISK_PCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES.FIRST_SEEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES.LAST_SEEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES.DIGEST;
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
    public String value4() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getMemoryTmpTables();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getDiskTmpTables();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value7() {
        return getAvgTmpTablesPerQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value8() {
        return getTmpTablesToDiskPct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getFirstSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getLastSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDigest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithTempTablesRecord value1(String value) {
        setQuery(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithTempTablesRecord value2(String value) {
        setDb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithTempTablesRecord value3(ULong value) {
        setExecCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithTempTablesRecord value4(String value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithTempTablesRecord value5(ULong value) {
        setMemoryTmpTables(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithTempTablesRecord value6(ULong value) {
        setDiskTmpTables(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithTempTablesRecord value7(BigInteger value) {
        setAvgTmpTablesPerQuery(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithTempTablesRecord value8(BigInteger value) {
        setTmpTablesToDiskPct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithTempTablesRecord value9(Timestamp value) {
        setFirstSeen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithTempTablesRecord value10(Timestamp value) {
        setLastSeen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithTempTablesRecord value11(String value) {
        setDigest(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithTempTablesRecord values(String value1, String value2, ULong value3, String value4, ULong value5, ULong value6, BigInteger value7, BigInteger value8, Timestamp value9, Timestamp value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StatementsWithTempTablesRecord
     */
    public StatementsWithTempTablesRecord() {
        super(StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES);
    }

    /**
     * Create a detached, initialised StatementsWithTempTablesRecord
     */
    public StatementsWithTempTablesRecord(String query, String db, ULong execCount, String totalLatency, ULong memoryTmpTables, ULong diskTmpTables, BigInteger avgTmpTablesPerQuery, BigInteger tmpTablesToDiskPct, Timestamp firstSeen, Timestamp lastSeen, String digest) {
        super(StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES);

        set(0, query);
        set(1, db);
        set(2, execCount);
        set(3, totalLatency);
        set(4, memoryTmpTables);
        set(5, diskTmpTables);
        set(6, avgTmpTablesPerQuery);
        set(7, tmpTablesToDiskPct);
        set(8, firstSeen);
        set(9, lastSeen);
        set(10, digest);
    }
}
