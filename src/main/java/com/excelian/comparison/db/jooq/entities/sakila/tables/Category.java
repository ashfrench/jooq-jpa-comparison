/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sakila.tables;


import com.excelian.comparison.db.jooq.entities.sakila.Keys;
import com.excelian.comparison.db.jooq.entities.sakila.Sakila;
import com.excelian.comparison.db.jooq.entities.sakila.tables.records.CategoryRecord;

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
import org.jooq.types.UByte;


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
public class Category extends TableImpl<CategoryRecord> {

    private static final long serialVersionUID = -1323531275;

    /**
     * The reference instance of <code>sakila.category</code>
     */
    public static final Category CATEGORY = new Category();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CategoryRecord> getRecordType() {
        return CategoryRecord.class;
    }

    /**
     * The column <code>sakila.category.category_id</code>.
     */
    public final TableField<CategoryRecord, UByte> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.category.name</code>.
     */
    public final TableField<CategoryRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(25).nullable(false), this, "");

    /**
     * The column <code>sakila.category.last_update</code>.
     */
    public final TableField<CategoryRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>sakila.category</code> table reference
     */
    public Category() {
        this("category", null);
    }

    /**
     * Create an aliased <code>sakila.category</code> table reference
     */
    public Category(String alias) {
        this(alias, CATEGORY);
    }

    private Category(String alias, Table<CategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Category(String alias, Table<CategoryRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CategoryRecord, UByte> getIdentity() {
        return Keys.IDENTITY_CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CategoryRecord> getPrimaryKey() {
        return Keys.KEY_CATEGORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<CategoryRecord>>asList(Keys.KEY_CATEGORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Category as(String alias) {
        return new Category(alias, this);
    }

    /**
     * Rename this table
     */
    public Category rename(String name) {
        return new Category(name, null);
    }
}
