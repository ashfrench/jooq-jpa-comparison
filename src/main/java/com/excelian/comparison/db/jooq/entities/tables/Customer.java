/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.tables;


import com.excelian.comparison.db.jooq.entities.Keys;
import com.excelian.comparison.db.jooq.entities.Sakila;
import com.excelian.comparison.db.jooq.entities.tables.records.CustomerRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.UShort;


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
public class Customer extends TableImpl<CustomerRecord> {

    private static final long serialVersionUID = 2071157983;

    /**
     * The reference instance of <code>sakila.customer</code>
     */
    public static final Customer CUSTOMER = new Customer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerRecord> getRecordType() {
        return CustomerRecord.class;
    }

    /**
     * The column <code>sakila.customer.customer_id</code>.
     */
    public final TableField<CustomerRecord, UShort> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.customer.store_id</code>.
     */
    public final TableField<CustomerRecord, UByte> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.customer.first_name</code>.
     */
    public final TableField<CustomerRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>sakila.customer.last_name</code>.
     */
    public final TableField<CustomerRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>sakila.customer.email</code>.
     */
    public final TableField<CustomerRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>sakila.customer.address_id</code>.
     */
    public final TableField<CustomerRecord, UShort> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.customer.active</code>.
     */
    public final TableField<CustomerRecord, Byte> ACTIVE = createField("active", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sakila.customer.create_date</code>.
     */
    public final TableField<CustomerRecord, Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>sakila.customer.last_update</code>.
     */
    public final TableField<CustomerRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>sakila.customer</code> table reference
     */
    public Customer() {
        this("customer", null);
    }

    /**
     * Create an aliased <code>sakila.customer</code> table reference
     */
    public Customer(String alias) {
        this(alias, CUSTOMER);
    }

    private Customer(String alias, Table<CustomerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customer(String alias, Table<CustomerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sakila.SAKILA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CustomerRecord, UShort> getIdentity() {
        return Keys.IDENTITY_CUSTOMER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CustomerRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CustomerRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomerRecord>>asList(Keys.KEY_CUSTOMER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CustomerRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CustomerRecord, ?>>asList(Keys.FK_CUSTOMER_STORE, Keys.FK_CUSTOMER_ADDRESS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customer as(String alias) {
        return new Customer(alias, this);
    }

    /**
     * Rename this table
     */
    public Customer rename(String name) {
        return new Customer(name, null);
    }
}