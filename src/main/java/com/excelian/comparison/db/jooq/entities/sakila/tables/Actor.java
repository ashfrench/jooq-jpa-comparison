/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sakila.tables;


import com.excelian.comparison.db.jooq.entities.sakila.Keys;
import com.excelian.comparison.db.jooq.entities.sakila.Sakila;
import com.excelian.comparison.db.jooq.entities.sakila.tables.records.ActorRecord;

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
public class Actor extends TableImpl<ActorRecord> {

    private static final long serialVersionUID = -527589250;

    /**
     * The reference instance of <code>sakila.actor</code>
     */
    public static final Actor ACTOR = new Actor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActorRecord> getRecordType() {
        return ActorRecord.class;
    }

    /**
     * The column <code>sakila.actor.actor_id</code>.
     */
    public final TableField<ActorRecord, UShort> ACTOR_ID = createField("actor_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sakila.actor.first_name</code>.
     */
    public final TableField<ActorRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>sakila.actor.last_name</code>.
     */
    public final TableField<ActorRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>sakila.actor.last_update</code>.
     */
    public final TableField<ActorRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>sakila.actor</code> table reference
     */
    public Actor() {
        this("actor", null);
    }

    /**
     * Create an aliased <code>sakila.actor</code> table reference
     */
    public Actor(String alias) {
        this(alias, ACTOR);
    }

    private Actor(String alias, Table<ActorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Actor(String alias, Table<ActorRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ActorRecord, UShort> getIdentity() {
        return Keys.IDENTITY_ACTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActorRecord> getPrimaryKey() {
        return Keys.KEY_ACTOR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActorRecord>> getKeys() {
        return Arrays.<UniqueKey<ActorRecord>>asList(Keys.KEY_ACTOR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Actor as(String alias) {
        return new Actor(alias, this);
    }

    /**
     * Rename this table
     */
    public Actor rename(String name) {
        return new Actor(name, null);
    }
}