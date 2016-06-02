/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.information_schema.tables.records;


import com.excelian.comparison.db.jooq.entities.information_schema.tables.SchemaPrivileges;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


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
public class SchemaPrivilegesRecord extends TableRecordImpl<SchemaPrivilegesRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = -1765058955;

    /**
     * Setter for <code>information_schema.SCHEMA_PRIVILEGES.GRANTEE</code>.
     */
    public void setGrantee(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.SCHEMA_PRIVILEGES.GRANTEE</code>.
     */
    public String getGrantee() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.SCHEMA_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.SCHEMA_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.SCHEMA_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.SCHEMA_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.SCHEMA_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public void setPrivilegeType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.SCHEMA_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public String getPrivilegeType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.SCHEMA_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public void setIsGrantable(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.SCHEMA_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public String getIsGrantable() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SchemaPrivileges.SCHEMA_PRIVILEGES.GRANTEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SchemaPrivileges.SCHEMA_PRIVILEGES.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SchemaPrivileges.SCHEMA_PRIVILEGES.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SchemaPrivileges.SCHEMA_PRIVILEGES.PRIVILEGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SchemaPrivileges.SCHEMA_PRIVILEGES.IS_GRANTABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaPrivilegesRecord value1(String value) {
        setGrantee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaPrivilegesRecord value2(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaPrivilegesRecord value3(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaPrivilegesRecord value4(String value) {
        setPrivilegeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaPrivilegesRecord value5(String value) {
        setIsGrantable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaPrivilegesRecord values(String value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SchemaPrivilegesRecord
     */
    public SchemaPrivilegesRecord() {
        super(SchemaPrivileges.SCHEMA_PRIVILEGES);
    }

    /**
     * Create a detached, initialised SchemaPrivilegesRecord
     */
    public SchemaPrivilegesRecord(String grantee, String tableCatalog, String tableSchema, String privilegeType, String isGrantable) {
        super(SchemaPrivileges.SCHEMA_PRIVILEGES);

        set(0, grantee);
        set(1, tableCatalog);
        set(2, tableSchema);
        set(3, privilegeType);
        set(4, isGrantable);
    }
}
