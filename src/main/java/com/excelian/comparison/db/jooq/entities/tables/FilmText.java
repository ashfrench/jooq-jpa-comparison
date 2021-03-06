/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.tables;


import com.excelian.comparison.db.jooq.entities.Keys;
import com.excelian.comparison.db.jooq.entities.Sakila;
import com.excelian.comparison.db.jooq.entities.tables.records.FilmTextRecord;

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
public class FilmText extends TableImpl<FilmTextRecord> {

    private static final long serialVersionUID = -1342134514;

    /**
     * The reference instance of <code>sakila.film_text</code>
     */
    public static final FilmText FILM_TEXT = new FilmText();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmTextRecord> getRecordType() {
        return FilmTextRecord.class;
    }

    /**
     * The column <code>sakila.film_text.film_id</code>.
     */
    public final TableField<FilmTextRecord, Short> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>sakila.film_text.title</code>.
     */
    public final TableField<FilmTextRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>sakila.film_text.description</code>.
     */
    public final TableField<FilmTextRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sakila.film_text</code> table reference
     */
    public FilmText() {
        this("film_text", null);
    }

    /**
     * Create an aliased <code>sakila.film_text</code> table reference
     */
    public FilmText(String alias) {
        this(alias, FILM_TEXT);
    }

    private FilmText(String alias, Table<FilmTextRecord> aliased) {
        this(alias, aliased, null);
    }

    private FilmText(String alias, Table<FilmTextRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<FilmTextRecord> getPrimaryKey() {
        return Keys.KEY_FILM_TEXT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FilmTextRecord>> getKeys() {
        return Arrays.<UniqueKey<FilmTextRecord>>asList(Keys.KEY_FILM_TEXT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmText as(String alias) {
        return new FilmText(alias, this);
    }

    /**
     * Rename this table
     */
    public FilmText rename(String name) {
        return new FilmText(name, null);
    }
}
