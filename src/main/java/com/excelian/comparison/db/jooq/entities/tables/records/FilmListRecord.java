/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.tables.records;


import com.excelian.comparison.db.jooq.entities.enums.FilmListRating;
import com.excelian.comparison.db.jooq.entities.tables.FilmList;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;
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
public class FilmListRecord extends TableRecordImpl<FilmListRecord> implements Record8<UShort, String, String, String, BigDecimal, UShort, FilmListRating, String> {

    private static final long serialVersionUID = -1187970268;

    /**
     * Setter for <code>sakila.film_list.FID</code>.
     */
    public void setFid(UShort value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.film_list.FID</code>.
     */
    public UShort getFid() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>sakila.film_list.title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.film_list.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.film_list.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.film_list.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.film_list.category</code>.
     */
    public void setCategory(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sakila.film_list.category</code>.
     */
    public String getCategory() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sakila.film_list.price</code>.
     */
    public void setPrice(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>sakila.film_list.price</code>.
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>sakila.film_list.length</code>.
     */
    public void setLength(UShort value) {
        set(5, value);
    }

    /**
     * Getter for <code>sakila.film_list.length</code>.
     */
    public UShort getLength() {
        return (UShort) get(5);
    }

    /**
     * Setter for <code>sakila.film_list.rating</code>.
     */
    public void setRating(FilmListRating value) {
        set(6, value);
    }

    /**
     * Getter for <code>sakila.film_list.rating</code>.
     */
    public FilmListRating getRating() {
        return (FilmListRating) get(6);
    }

    /**
     * Setter for <code>sakila.film_list.actors</code>.
     */
    public void setActors(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>sakila.film_list.actors</code>.
     */
    public String getActors() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<UShort, String, String, String, BigDecimal, UShort, FilmListRating, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<UShort, String, String, String, BigDecimal, UShort, FilmListRating, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field1() {
        return FilmList.FILM_LIST.FID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FilmList.FILM_LIST.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FilmList.FILM_LIST.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FilmList.FILM_LIST.CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return FilmList.FILM_LIST.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field6() {
        return FilmList.FILM_LIST.LENGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<FilmListRating> field7() {
        return FilmList.FILM_LIST.RATING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FilmList.FILM_LIST.ACTORS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort value1() {
        return getFid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort value6() {
        return getLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRating value7() {
        return getRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getActors();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value1(UShort value) {
        setFid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value4(String value) {
        setCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value5(BigDecimal value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value6(UShort value) {
        setLength(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value7(FilmListRating value) {
        setRating(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord value8(String value) {
        setActors(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmListRecord values(UShort value1, String value2, String value3, String value4, BigDecimal value5, UShort value6, FilmListRating value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmListRecord
     */
    public FilmListRecord() {
        super(FilmList.FILM_LIST);
    }

    /**
     * Create a detached, initialised FilmListRecord
     */
    public FilmListRecord(UShort fid, String title, String description, String category, BigDecimal price, UShort length, FilmListRating rating, String actors) {
        super(FilmList.FILM_LIST);

        set(0, fid);
        set(1, title);
        set(2, description);
        set(3, category);
        set(4, price);
        set(5, length);
        set(6, rating);
        set(7, actors);
    }
}
