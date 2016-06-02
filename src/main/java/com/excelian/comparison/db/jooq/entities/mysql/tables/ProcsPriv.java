/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.mysql.tables;


import com.excelian.comparison.db.jooq.entities.mysql.Keys;
import com.excelian.comparison.db.jooq.entities.mysql.Mysql;
import com.excelian.comparison.db.jooq.entities.mysql.enums.ProcsPrivRoutineType;
import com.excelian.comparison.db.jooq.entities.mysql.tables.records.ProcsPrivRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * Procedure privileges
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProcsPriv extends TableImpl<ProcsPrivRecord> {

    private static final long serialVersionUID = -149019672;

    /**
     * The reference instance of <code>mysql.procs_priv</code>
     */
    public static final ProcsPriv PROCS_PRIV = new ProcsPriv();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProcsPrivRecord> getRecordType() {
        return ProcsPrivRecord.class;
    }

    /**
     * The column <code>mysql.procs_priv.Host</code>.
     */
    public final TableField<ProcsPrivRecord, String> HOST = createField("Host", org.jooq.impl.SQLDataType.CHAR.length(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.procs_priv.Db</code>.
     */
    public final TableField<ProcsPrivRecord, String> DB = createField("Db", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.procs_priv.User</code>.
     */
    public final TableField<ProcsPrivRecord, String> USER = createField("User", org.jooq.impl.SQLDataType.CHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.procs_priv.Routine_name</code>.
     */
    public final TableField<ProcsPrivRecord, String> ROUTINE_NAME = createField("Routine_name", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.procs_priv.Routine_type</code>.
     */
    public final TableField<ProcsPrivRecord, ProcsPrivRoutineType> ROUTINE_TYPE = createField("Routine_type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.excelian.comparison.db.jooq.entities.mysql.enums.ProcsPrivRoutineType.class), this, "");

    /**
     * The column <code>mysql.procs_priv.Grantor</code>.
     */
    public final TableField<ProcsPrivRecord, String> GRANTOR = createField("Grantor", org.jooq.impl.SQLDataType.CHAR.length(77).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.procs_priv.Proc_priv</code>.
     */
    public final TableField<ProcsPrivRecord, String> PROC_PRIV = createField("Proc_priv", org.jooq.impl.SQLDataType.VARCHAR.length(27).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.procs_priv.Timestamp</code>.
     */
    public final TableField<ProcsPrivRecord, Timestamp> TIMESTAMP = createField("Timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>mysql.procs_priv</code> table reference
     */
    public ProcsPriv() {
        this("procs_priv", null);
    }

    /**
     * Create an aliased <code>mysql.procs_priv</code> table reference
     */
    public ProcsPriv(String alias) {
        this(alias, PROCS_PRIV);
    }

    private ProcsPriv(String alias, Table<ProcsPrivRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProcsPriv(String alias, Table<ProcsPrivRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Procedure privileges");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProcsPrivRecord> getPrimaryKey() {
        return Keys.KEY_PROCS_PRIV_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProcsPrivRecord>> getKeys() {
        return Arrays.<UniqueKey<ProcsPrivRecord>>asList(Keys.KEY_PROCS_PRIV_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcsPriv as(String alias) {
        return new ProcsPriv(alias, this);
    }

    /**
     * Rename this table
     */
    public ProcsPriv rename(String name) {
        return new ProcsPriv(name, null);
    }
}
