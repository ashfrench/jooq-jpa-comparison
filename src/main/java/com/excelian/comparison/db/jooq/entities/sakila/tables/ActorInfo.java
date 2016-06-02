/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sakila.tables;


import com.excelian.comparison.db.jooq.entities.sakila.Sakila;
import com.excelian.comparison.db.jooq.entities.sakila.tables.records.ActorInfoRecord;

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
public class ActorInfo extends TableImpl<ActorInfoRecord> {

    private static final long serialVersionUID = 1310028656;

    /**
     * The reference instance of <code>sakila.actor_info</code>
     */
    public static final ActorInfo ACTOR_INFO = new ActorInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActorInfoRecord> getRecordType() {
        return ActorInfoRecord.class;
    }

    /**
     * The column <code>sakila.actor_info.actor_id</code>.
     */
    public final TableField<ActorInfoRecord, UShort> ACTOR_ID = createField("actor_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED)), this, "");

    /**
     * The column <code>sakila.actor_info.first_name</code>.
     */
    public final TableField<ActorInfoRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>sakila.actor_info.last_name</code>.
     */
    public final TableField<ActorInfoRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>sakila.actor_info.film_info</code>.
     */
    public final TableField<ActorInfoRecord, String> FILM_INFO = createField("film_info", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sakila.actor_info</code> table reference
     */
    public ActorInfo() {
        this("actor_info", null);
    }

    /**
     * Create an aliased <code>sakila.actor_info</code> table reference
     */
    public ActorInfo(String alias) {
        this(alias, ACTOR_INFO);
    }

    private ActorInfo(String alias, Table<ActorInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActorInfo(String alias, Table<ActorInfoRecord> aliased, Field<?>[] parameters) {
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
    public ActorInfo as(String alias) {
        return new ActorInfo(alias, this);
    }

    /**
     * Rename this table
     */
    public ActorInfo rename(String name) {
        return new ActorInfo(name, null);
    }
}