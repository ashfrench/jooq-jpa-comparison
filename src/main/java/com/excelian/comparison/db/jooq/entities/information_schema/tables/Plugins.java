/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.information_schema.tables;


import com.excelian.comparison.db.jooq.entities.information_schema.InformationSchema;
import com.excelian.comparison.db.jooq.entities.information_schema.tables.records.PluginsRecord;

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
public class Plugins extends TableImpl<PluginsRecord> {

    private static final long serialVersionUID = -1167069520;

    /**
     * The reference instance of <code>information_schema.PLUGINS</code>
     */
    public static final Plugins PLUGINS = new Plugins();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PluginsRecord> getRecordType() {
        return PluginsRecord.class;
    }

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_NAME</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_NAME = createField("PLUGIN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_VERSION</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_VERSION = createField("PLUGIN_VERSION", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_STATUS</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_STATUS = createField("PLUGIN_STATUS", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_TYPE</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_TYPE = createField("PLUGIN_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(80).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_TYPE_VERSION</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_TYPE_VERSION = createField("PLUGIN_TYPE_VERSION", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_LIBRARY</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_LIBRARY = createField("PLUGIN_LIBRARY", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_LIBRARY_VERSION</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_LIBRARY_VERSION = createField("PLUGIN_LIBRARY_VERSION", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_AUTHOR</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_AUTHOR = createField("PLUGIN_AUTHOR", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_DESCRIPTION</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_DESCRIPTION = createField("PLUGIN_DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_LICENSE</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_LICENSE = createField("PLUGIN_LICENSE", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

    /**
     * The column <code>information_schema.PLUGINS.LOAD_OPTION</code>.
     */
    public final TableField<PluginsRecord, String> LOAD_OPTION = createField("LOAD_OPTION", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.PLUGINS</code> table reference
     */
    public Plugins() {
        this("PLUGINS", null);
    }

    /**
     * Create an aliased <code>information_schema.PLUGINS</code> table reference
     */
    public Plugins(String alias) {
        this(alias, PLUGINS);
    }

    private Plugins(String alias, Table<PluginsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Plugins(String alias, Table<PluginsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plugins as(String alias) {
        return new Plugins(alias, this);
    }

    /**
     * Rename this table
     */
    public Plugins rename(String name) {
        return new Plugins(name, null);
    }
}
