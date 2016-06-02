/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.tables;


import com.excelian.comparison.db.jooq.entities.sys.Sys;
import com.excelian.comparison.db.jooq.entities.sys.tables.records.SchemaTableLockWaitsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
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
public class SchemaTableLockWaits extends TableImpl<SchemaTableLockWaitsRecord> {

    private static final long serialVersionUID = 1215603;

    /**
     * The reference instance of <code>sys.schema_table_lock_waits</code>
     */
    public static final SchemaTableLockWaits SCHEMA_TABLE_LOCK_WAITS = new SchemaTableLockWaits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemaTableLockWaitsRecord> getRecordType() {
        return SchemaTableLockWaitsRecord.class;
    }

    /**
     * The column <code>sys.schema_table_lock_waits.object_schema</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> OBJECT_SCHEMA = createField("object_schema", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.object_name</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> OBJECT_NAME = createField("object_name", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_thread_id</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, ULong> WAITING_THREAD_ID = createField("waiting_thread_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_pid</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, ULong> WAITING_PID = createField("waiting_pid", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_account</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> WAITING_ACCOUNT = createField("waiting_account", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_lock_type</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> WAITING_LOCK_TYPE = createField("waiting_lock_type", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_lock_duration</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> WAITING_LOCK_DURATION = createField("waiting_lock_duration", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_query</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> WAITING_QUERY = createField("waiting_query", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_query_secs</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, Long> WAITING_QUERY_SECS = createField("waiting_query_secs", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_query_rows_affected</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, ULong> WAITING_QUERY_ROWS_AFFECTED = createField("waiting_query_rows_affected", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.waiting_query_rows_examined</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, ULong> WAITING_QUERY_ROWS_EXAMINED = createField("waiting_query_rows_examined", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.blocking_thread_id</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, ULong> BLOCKING_THREAD_ID = createField("blocking_thread_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.blocking_pid</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, ULong> BLOCKING_PID = createField("blocking_pid", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.blocking_account</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> BLOCKING_ACCOUNT = createField("blocking_account", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.blocking_lock_type</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> BLOCKING_LOCK_TYPE = createField("blocking_lock_type", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.blocking_lock_duration</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> BLOCKING_LOCK_DURATION = createField("blocking_lock_duration", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.sql_kill_blocking_query</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> SQL_KILL_BLOCKING_QUERY = createField("sql_kill_blocking_query", org.jooq.impl.SQLDataType.VARCHAR.length(31), this, "");

    /**
     * The column <code>sys.schema_table_lock_waits.sql_kill_blocking_connection</code>.
     */
    public final TableField<SchemaTableLockWaitsRecord, String> SQL_KILL_BLOCKING_CONNECTION = createField("sql_kill_blocking_connection", org.jooq.impl.SQLDataType.VARCHAR.length(25), this, "");

    /**
     * Create a <code>sys.schema_table_lock_waits</code> table reference
     */
    public SchemaTableLockWaits() {
        this("schema_table_lock_waits", null);
    }

    /**
     * Create an aliased <code>sys.schema_table_lock_waits</code> table reference
     */
    public SchemaTableLockWaits(String alias) {
        this(alias, SCHEMA_TABLE_LOCK_WAITS);
    }

    private SchemaTableLockWaits(String alias, Table<SchemaTableLockWaitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SchemaTableLockWaits(String alias, Table<SchemaTableLockWaitsRecord> aliased, Field<?>[] parameters) {
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
    public SchemaTableLockWaits as(String alias) {
        return new SchemaTableLockWaits(alias, this);
    }

    /**
     * Rename this table
     */
    public SchemaTableLockWaits rename(String name) {
        return new SchemaTableLockWaits(name, null);
    }
}
