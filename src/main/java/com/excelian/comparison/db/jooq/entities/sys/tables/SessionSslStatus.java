/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.tables;


import com.excelian.comparison.db.jooq.entities.sys.Sys;
import com.excelian.comparison.db.jooq.entities.sys.tables.records.SessionSslStatusRecord;

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
public class SessionSslStatus extends TableImpl<SessionSslStatusRecord> {

    private static final long serialVersionUID = 875436316;

    /**
     * The reference instance of <code>sys.session_ssl_status</code>
     */
    public static final SessionSslStatus SESSION_SSL_STATUS = new SessionSslStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionSslStatusRecord> getRecordType() {
        return SessionSslStatusRecord.class;
    }

    /**
     * The column <code>sys.session_ssl_status.thread_id</code>.
     */
    public final TableField<SessionSslStatusRecord, ULong> THREAD_ID = createField("thread_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.session_ssl_status.ssl_version</code>.
     */
    public final TableField<SessionSslStatusRecord, String> SSL_VERSION = createField("ssl_version", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>sys.session_ssl_status.ssl_cipher</code>.
     */
    public final TableField<SessionSslStatusRecord, String> SSL_CIPHER = createField("ssl_cipher", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>sys.session_ssl_status.ssl_sessions_reused</code>.
     */
    public final TableField<SessionSslStatusRecord, String> SSL_SESSIONS_REUSED = createField("ssl_sessions_reused", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * Create a <code>sys.session_ssl_status</code> table reference
     */
    public SessionSslStatus() {
        this("session_ssl_status", null);
    }

    /**
     * Create an aliased <code>sys.session_ssl_status</code> table reference
     */
    public SessionSslStatus(String alias) {
        this(alias, SESSION_SSL_STATUS);
    }

    private SessionSslStatus(String alias, Table<SessionSslStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private SessionSslStatus(String alias, Table<SessionSslStatusRecord> aliased, Field<?>[] parameters) {
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
    public SessionSslStatus as(String alias) {
        return new SessionSslStatus(alias, this);
    }

    /**
     * Rename this table
     */
    public SessionSslStatus rename(String name) {
        return new SessionSslStatus(name, null);
    }
}