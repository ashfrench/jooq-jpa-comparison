/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.tables;


import com.excelian.comparison.db.jooq.entities.Keys;
import com.excelian.comparison.db.jooq.entities.Sakila;
import com.excelian.comparison.db.jooq.entities.tables.records.CountryRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
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
public class Country extends TableImpl<CountryRecord> {

    private static final long serialVersionUID = -114561106;

    /**
     * The reference instance of <code>sakila.country</code>
     */
    public static final Country COUNTRY = new Country();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountryRecord> getRecordType() {
        return CountryRecord.class;
    }

    /**
     * The column <code>sakila.country.country_id</code>.
     */
    public final TableField<CountryRecord, UShort> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.country.country</code>.
     */
    public final TableField<CountryRecord, String> COUNTRY_ = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>sakila.country.last_update</code>.
     */
    public final TableField<CountryRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>sakila.country</code> table reference
     */
    public Country() {
        this("country", null);
    }

    /**
     * Create an aliased <code>sakila.country</code> table reference
     */
    public Country(String alias) {
        this(alias, COUNTRY);
    }

    private Country(String alias, Table<CountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Country(String alias, Table<CountryRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CountryRecord, UShort> getIdentity() {
        return Keys.IDENTITY_COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CountryRecord> getPrimaryKey() {
        return Keys.KEY_COUNTRY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CountryRecord>> getKeys() {
        return Arrays.<UniqueKey<CountryRecord>>asList(Keys.KEY_COUNTRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Country as(String alias) {
        return new Country(alias, this);
    }

    /**
     * Rename this table
     */
    public Country rename(String name) {
        return new Country(name, null);
    }
}
