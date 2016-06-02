/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.performance_schema.tables;


import com.excelian.comparison.db.jooq.entities.performance_schema.PerformanceSchema;
import com.excelian.comparison.db.jooq.entities.performance_schema.tables.records.GlobalStatusRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class GlobalStatus extends TableImpl<GlobalStatusRecord> {

    private static final long serialVersionUID = -2109133050;

    /**
     * The reference instance of <code>performance_schema.global_status</code>
     */
    public static final GlobalStatus GLOBAL_STATUS = new GlobalStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GlobalStatusRecord> getRecordType() {
        return GlobalStatusRecord.class;
    }

    /**
     * The column <code>performance_schema.global_status.VARIABLE_NAME</code>.
     */
    public final TableField<GlobalStatusRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.global_status.VARIABLE_VALUE</code>.
     */
    public final TableField<GlobalStatusRecord, String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * Create a <code>performance_schema.global_status</code> table reference
     */
    public GlobalStatus() {
        this("global_status", null);
    }

    /**
     * Create an aliased <code>performance_schema.global_status</code> table reference
     */
    public GlobalStatus(String alias) {
        this(alias, GLOBAL_STATUS);
    }

    private GlobalStatus(String alias, Table<GlobalStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private GlobalStatus(String alias, Table<GlobalStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalStatus as(String alias) {
        return new GlobalStatus(alias, this);
    }

    /**
     * Rename this table
     */
    public GlobalStatus rename(String name) {
        return new GlobalStatus(name, null);
    }
}
