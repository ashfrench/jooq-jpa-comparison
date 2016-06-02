/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sakila.tables;


import com.excelian.comparison.db.jooq.entities.sakila.Keys;
import com.excelian.comparison.db.jooq.entities.sakila.Sakila;
import com.excelian.comparison.db.jooq.entities.sakila.tables.records.StoreRecord;

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
public class Store extends TableImpl<StoreRecord> {

    private static final long serialVersionUID = -1887288033;

    /**
     * The reference instance of <code>sakila.store</code>
     */
    public static final Store STORE = new Store();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StoreRecord> getRecordType() {
        return StoreRecord.class;
    }

    /**
     * The column <code>sakila.store.store_id</code>.
     */
    public final TableField<StoreRecord, UByte> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.store.manager_staff_id</code>.
     */
    public final TableField<StoreRecord, UByte> MANAGER_STAFF_ID = createField("manager_staff_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.store.address_id</code>.
     */
    public final TableField<StoreRecord, UShort> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.store.last_update</code>.
     */
    public final TableField<StoreRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>sakila.store</code> table reference
     */
    public Store() {
        this("store", null);
    }

    /**
     * Create an aliased <code>sakila.store</code> table reference
     */
    public Store(String alias) {
        this(alias, STORE);
    }

    private Store(String alias, Table<StoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private Store(String alias, Table<StoreRecord> aliased, Field<?>[] parameters) {
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
    public Identity<StoreRecord, UByte> getIdentity() {
        return Keys.IDENTITY_STORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StoreRecord> getPrimaryKey() {
        return Keys.KEY_STORE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StoreRecord>> getKeys() {
        return Arrays.<UniqueKey<StoreRecord>>asList(Keys.KEY_STORE_PRIMARY, Keys.KEY_STORE_IDX_UNIQUE_MANAGER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<StoreRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StoreRecord, ?>>asList(Keys.FK_STORE_STAFF, Keys.FK_STORE_ADDRESS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Store as(String alias) {
        return new Store(alias, this);
    }

    /**
     * Rename this table
     */
    public Store rename(String name) {
        return new Store(name, null);
    }
}
