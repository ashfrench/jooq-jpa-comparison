/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.mysql.tables;


import com.excelian.comparison.db.jooq.entities.mysql.Keys;
import com.excelian.comparison.db.jooq.entities.mysql.Mysql;
import com.excelian.comparison.db.jooq.entities.mysql.tables.records.NdbBinlogIndexRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class NdbBinlogIndex extends TableImpl<NdbBinlogIndexRecord> {

    private static final long serialVersionUID = 448682181;

    /**
     * The reference instance of <code>mysql.ndb_binlog_index</code>
     */
    public static final NdbBinlogIndex NDB_BINLOG_INDEX = new NdbBinlogIndex();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NdbBinlogIndexRecord> getRecordType() {
        return NdbBinlogIndexRecord.class;
    }

    /**
     * The column <code>mysql.ndb_binlog_index.Position</code>.
     */
    public final TableField<NdbBinlogIndexRecord, ULong> POSITION = createField("Position", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.File</code>.
     */
    public final TableField<NdbBinlogIndexRecord, String> FILE = createField("File", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.epoch</code>.
     */
    public final TableField<NdbBinlogIndexRecord, ULong> EPOCH = createField("epoch", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.inserts</code>.
     */
    public final TableField<NdbBinlogIndexRecord, UInteger> INSERTS = createField("inserts", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.updates</code>.
     */
    public final TableField<NdbBinlogIndexRecord, UInteger> UPDATES = createField("updates", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.deletes</code>.
     */
    public final TableField<NdbBinlogIndexRecord, UInteger> DELETES = createField("deletes", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.schemaops</code>.
     */
    public final TableField<NdbBinlogIndexRecord, UInteger> SCHEMAOPS = createField("schemaops", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.orig_server_id</code>.
     */
    public final TableField<NdbBinlogIndexRecord, UInteger> ORIG_SERVER_ID = createField("orig_server_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.orig_epoch</code>.
     */
    public final TableField<NdbBinlogIndexRecord, ULong> ORIG_EPOCH = createField("orig_epoch", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.gci</code>.
     */
    public final TableField<NdbBinlogIndexRecord, UInteger> GCI = createField("gci", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.next_position</code>.
     */
    public final TableField<NdbBinlogIndexRecord, ULong> NEXT_POSITION = createField("next_position", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.next_file</code>.
     */
    public final TableField<NdbBinlogIndexRecord, String> NEXT_FILE = createField("next_file", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>mysql.ndb_binlog_index</code> table reference
     */
    public NdbBinlogIndex() {
        this("ndb_binlog_index", null);
    }

    /**
     * Create an aliased <code>mysql.ndb_binlog_index</code> table reference
     */
    public NdbBinlogIndex(String alias) {
        this(alias, NDB_BINLOG_INDEX);
    }

    private NdbBinlogIndex(String alias, Table<NdbBinlogIndexRecord> aliased) {
        this(alias, aliased, null);
    }

    private NdbBinlogIndex(String alias, Table<NdbBinlogIndexRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<NdbBinlogIndexRecord> getPrimaryKey() {
        return Keys.KEY_NDB_BINLOG_INDEX_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NdbBinlogIndexRecord>> getKeys() {
        return Arrays.<UniqueKey<NdbBinlogIndexRecord>>asList(Keys.KEY_NDB_BINLOG_INDEX_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NdbBinlogIndex as(String alias) {
        return new NdbBinlogIndex(alias, this);
    }

    /**
     * Rename this table
     */
    public NdbBinlogIndex rename(String name) {
        return new NdbBinlogIndex(name, null);
    }
}
