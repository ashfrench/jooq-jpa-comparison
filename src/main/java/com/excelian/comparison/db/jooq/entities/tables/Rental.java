/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.tables;


import com.excelian.comparison.db.jooq.entities.Keys;
import com.excelian.comparison.db.jooq.entities.Sakila;
import com.excelian.comparison.db.jooq.entities.tables.records.RentalRecord;

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
import org.jooq.types.UInteger;
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
public class Rental extends TableImpl<RentalRecord> {

    private static final long serialVersionUID = -1098026878;

    /**
     * The reference instance of <code>sakila.rental</code>
     */
    public static final Rental RENTAL = new Rental();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RentalRecord> getRecordType() {
        return RentalRecord.class;
    }

    /**
     * The column <code>sakila.rental.rental_id</code>.
     */
    public final TableField<RentalRecord, Integer> RENTAL_ID = createField("rental_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>sakila.rental.rental_date</code>.
     */
    public final TableField<RentalRecord, Timestamp> RENTAL_DATE = createField("rental_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>sakila.rental.inventory_id</code>.
     */
    public final TableField<RentalRecord, UInteger> INVENTORY_ID = createField("inventory_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.rental.customer_id</code>.
     */
    public final TableField<RentalRecord, UShort> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.rental.return_date</code>.
     */
    public final TableField<RentalRecord, Timestamp> RETURN_DATE = createField("return_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sakila.rental.staff_id</code>.
     */
    public final TableField<RentalRecord, UByte> STAFF_ID = createField("staff_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.rental.last_update</code>.
     */
    public final TableField<RentalRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>sakila.rental</code> table reference
     */
    public Rental() {
        this("rental", null);
    }

    /**
     * Create an aliased <code>sakila.rental</code> table reference
     */
    public Rental(String alias) {
        this(alias, RENTAL);
    }

    private Rental(String alias, Table<RentalRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rental(String alias, Table<RentalRecord> aliased, Field<?>[] parameters) {
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
    public Identity<RentalRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RENTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RentalRecord> getPrimaryKey() {
        return Keys.KEY_RENTAL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RentalRecord>> getKeys() {
        return Arrays.<UniqueKey<RentalRecord>>asList(Keys.KEY_RENTAL_PRIMARY, Keys.KEY_RENTAL_RENTAL_DATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RentalRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RentalRecord, ?>>asList(Keys.FK_RENTAL_INVENTORY, Keys.FK_RENTAL_CUSTOMER, Keys.FK_RENTAL_STAFF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rental as(String alias) {
        return new Rental(alias, this);
    }

    /**
     * Rename this table
     */
    public Rental rename(String name) {
        return new Rental(name, null);
    }
}
