/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.performance_schema.tables;


import com.excelian.comparison.db.jooq.entities.performance_schema.PerformanceSchema;
import com.excelian.comparison.db.jooq.entities.performance_schema.tables.records.FileSummaryByEventNameRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
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
public class FileSummaryByEventName extends TableImpl<FileSummaryByEventNameRecord> {

    private static final long serialVersionUID = -1176144475;

    /**
     * The reference instance of <code>performance_schema.file_summary_by_event_name</code>
     */
    public static final FileSummaryByEventName FILE_SUMMARY_BY_EVENT_NAME = new FileSummaryByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FileSummaryByEventNameRecord> getRecordType() {
        return FileSummaryByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.file_summary_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.COUNT_READ</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> COUNT_READ = createField("COUNT_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.SUM_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> SUM_TIMER_READ = createField("SUM_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MIN_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MIN_TIMER_READ = createField("MIN_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.AVG_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> AVG_TIMER_READ = createField("AVG_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MAX_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MAX_TIMER_READ = createField("MAX_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.SUM_NUMBER_OF_BYTES_READ</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, Long> SUM_NUMBER_OF_BYTES_READ = createField("SUM_NUMBER_OF_BYTES_READ", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.COUNT_WRITE</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> COUNT_WRITE = createField("COUNT_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.SUM_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> SUM_TIMER_WRITE = createField("SUM_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MIN_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MIN_TIMER_WRITE = createField("MIN_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.AVG_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> AVG_TIMER_WRITE = createField("AVG_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MAX_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MAX_TIMER_WRITE = createField("MAX_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.SUM_NUMBER_OF_BYTES_WRITE</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, Long> SUM_NUMBER_OF_BYTES_WRITE = createField("SUM_NUMBER_OF_BYTES_WRITE", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.COUNT_MISC</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> COUNT_MISC = createField("COUNT_MISC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.SUM_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> SUM_TIMER_MISC = createField("SUM_TIMER_MISC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MIN_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MIN_TIMER_MISC = createField("MIN_TIMER_MISC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.AVG_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> AVG_TIMER_MISC = createField("AVG_TIMER_MISC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_event_name.MAX_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByEventNameRecord, ULong> MAX_TIMER_MISC = createField("MAX_TIMER_MISC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.file_summary_by_event_name</code> table reference
     */
    public FileSummaryByEventName() {
        this("file_summary_by_event_name", null);
    }

    /**
     * Create an aliased <code>performance_schema.file_summary_by_event_name</code> table reference
     */
    public FileSummaryByEventName(String alias) {
        this(alias, FILE_SUMMARY_BY_EVENT_NAME);
    }

    private FileSummaryByEventName(String alias, Table<FileSummaryByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private FileSummaryByEventName(String alias, Table<FileSummaryByEventNameRecord> aliased, Field<?>[] parameters) {
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
    public FileSummaryByEventName as(String alias) {
        return new FileSummaryByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    public FileSummaryByEventName rename(String name) {
        return new FileSummaryByEventName(name, null);
    }
}
