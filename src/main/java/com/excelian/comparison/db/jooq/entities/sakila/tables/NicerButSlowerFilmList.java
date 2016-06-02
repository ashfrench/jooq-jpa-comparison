/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sakila.tables;


import com.excelian.comparison.db.jooq.entities.sakila.Sakila;
import com.excelian.comparison.db.jooq.entities.sakila.enums.NicerButSlowerFilmListRating;
import com.excelian.comparison.db.jooq.entities.sakila.tables.records.NicerButSlowerFilmListRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.UShort;


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
public class NicerButSlowerFilmList extends TableImpl<NicerButSlowerFilmListRecord> {

    private static final long serialVersionUID = -709483593;

    /**
     * The reference instance of <code>sakila.nicer_but_slower_film_list</code>
     */
    public static final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = new NicerButSlowerFilmList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NicerButSlowerFilmListRecord> getRecordType() {
        return NicerButSlowerFilmListRecord.class;
    }

    /**
     * The column <code>sakila.nicer_but_slower_film_list.FID</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, UShort> FID = createField("FID", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED)), this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.title</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.description</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.category</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR.length(25).nullable(false), this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.price</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, BigDecimal> PRICE = createField("price", org.jooq.impl.SQLDataType.DECIMAL.precision(4, 2).defaultValue(org.jooq.impl.DSL.inline("4.99", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.length</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, UShort> LENGTH = createField("length", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.rating</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, NicerButSlowerFilmListRating> RATING = createField("rating", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.excelian.comparison.db.jooq.entities.sakila.enums.NicerButSlowerFilmListRating.class), this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.actors</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> ACTORS = createField("actors", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sakila.nicer_but_slower_film_list</code> table reference
     */
    public NicerButSlowerFilmList() {
        this("nicer_but_slower_film_list", null);
    }

    /**
     * Create an aliased <code>sakila.nicer_but_slower_film_list</code> table reference
     */
    public NicerButSlowerFilmList(String alias) {
        this(alias, NICER_BUT_SLOWER_FILM_LIST);
    }

    private NicerButSlowerFilmList(String alias, Table<NicerButSlowerFilmListRecord> aliased) {
        this(alias, aliased, null);
    }

    private NicerButSlowerFilmList(String alias, Table<NicerButSlowerFilmListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
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
    public NicerButSlowerFilmList as(String alias) {
        return new NicerButSlowerFilmList(alias, this);
    }

    /**
     * Rename this table
     */
    public NicerButSlowerFilmList rename(String name) {
        return new NicerButSlowerFilmList(name, null);
    }
}
