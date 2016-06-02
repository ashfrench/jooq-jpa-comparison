/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sakila.tables.records;


import com.excelian.comparison.db.jooq.entities.sakila.tables.FilmCategory;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
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
public class FilmCategoryRecord extends UpdatableRecordImpl<FilmCategoryRecord> implements Record3<UShort, UByte, Timestamp> {

    private static final long serialVersionUID = 1805841511;

    /**
     * Setter for <code>sakila.film_category.film_id</code>.
     */
    public void setFilmId(UShort value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.film_category.film_id</code>.
     */
    public UShort getFilmId() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>sakila.film_category.category_id</code>.
     */
    public void setCategoryId(UByte value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.film_category.category_id</code>.
     */
    public UByte getCategoryId() {
        return (UByte) get(1);
    }

    /**
     * Setter for <code>sakila.film_category.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.film_category.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<UShort, UByte> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UShort, UByte, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UShort, UByte, Timestamp> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field1() {
        return FilmCategory.FILM_CATEGORY.FILM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field2() {
        return FilmCategory.FILM_CATEGORY.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return FilmCategory.FILM_CATEGORY.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort value1() {
        return getFilmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value2() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmCategoryRecord value1(UShort value) {
        setFilmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmCategoryRecord value2(UByte value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmCategoryRecord value3(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmCategoryRecord values(UShort value1, UByte value2, Timestamp value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmCategoryRecord
     */
    public FilmCategoryRecord() {
        super(FilmCategory.FILM_CATEGORY);
    }

    /**
     * Create a detached, initialised FilmCategoryRecord
     */
    public FilmCategoryRecord(UShort filmId, UByte categoryId, Timestamp lastUpdate) {
        super(FilmCategory.FILM_CATEGORY);

        set(0, filmId);
        set(1, categoryId);
        set(2, lastUpdate);
    }
}
