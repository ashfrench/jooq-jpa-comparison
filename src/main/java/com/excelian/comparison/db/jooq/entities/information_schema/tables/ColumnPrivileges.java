/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.information_schema.tables;


import com.excelian.comparison.db.jooq.entities.information_schema.InformationSchema;
import com.excelian.comparison.db.jooq.entities.information_schema.tables.records.ColumnPrivilegesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class ColumnPrivileges extends TableImpl<ColumnPrivilegesRecord> {

    private static final long serialVersionUID = -1386044162;

    /**
     * The reference instance of <code>information_schema.COLUMN_PRIVILEGES</code>
     */
    public static final ColumnPrivileges COLUMN_PRIVILEGES = new ColumnPrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnPrivilegesRecord> getRecordType() {
        return ColumnPrivilegesRecord.class;
    }

    /**
     * The column <code>information_schema.COLUMN_PRIVILEGES.GRANTEE</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> GRANTEE = createField("GRANTEE", org.jooq.impl.SQLDataType.VARCHAR.length(81).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.COLUMN_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.COLUMN_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.COLUMN_PRIVILEGES.TABLE_NAME</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.COLUMN_PRIVILEGES.COLUMN_NAME</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.COLUMN_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> PRIVILEGE_TYPE = createField("PRIVILEGE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.COLUMN_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public final TableField<ColumnPrivilegesRecord, String> IS_GRANTABLE = createField("IS_GRANTABLE", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.COLUMN_PRIVILEGES</code> table reference
     */
    public ColumnPrivileges() {
        this("COLUMN_PRIVILEGES", null);
    }

    /**
     * Create an aliased <code>information_schema.COLUMN_PRIVILEGES</code> table reference
     */
    public ColumnPrivileges(String alias) {
        this(alias, COLUMN_PRIVILEGES);
    }

    private ColumnPrivileges(String alias, Table<ColumnPrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ColumnPrivileges(String alias, Table<ColumnPrivilegesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnPrivileges as(String alias) {
        return new ColumnPrivileges(alias, this);
    }

    /**
     * Rename this table
     */
    public ColumnPrivileges rename(String name) {
        return new ColumnPrivileges(name, null);
    }
}
