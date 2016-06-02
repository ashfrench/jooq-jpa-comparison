/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.performance_schema.tables;


import com.excelian.comparison.db.jooq.entities.performance_schema.PerformanceSchema;
import com.excelian.comparison.db.jooq.entities.performance_schema.tables.records.EventsTransactionsSummaryByThreadByEventNameRecord;

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
public class EventsTransactionsSummaryByThreadByEventName extends TableImpl<EventsTransactionsSummaryByThreadByEventNameRecord> {

    private static final long serialVersionUID = -1664533485;

    /**
     * The reference instance of <code>performance_schema.events_transactions_summary_by_thread_by_event_name</code>
     */
    public static final EventsTransactionsSummaryByThreadByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_THREAD_BY_EVENT_NAME = new EventsTransactionsSummaryByThreadByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsTransactionsSummaryByThreadByEventNameRecord> getRecordType() {
        return EventsTransactionsSummaryByThreadByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.THREAD_ID</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.COUNT_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> COUNT_READ_WRITE = createField("COUNT_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.SUM_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> SUM_TIMER_READ_WRITE = createField("SUM_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.MIN_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> MIN_TIMER_READ_WRITE = createField("MIN_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.AVG_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> AVG_TIMER_READ_WRITE = createField("AVG_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.MAX_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> MAX_TIMER_READ_WRITE = createField("MAX_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.COUNT_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> COUNT_READ_ONLY = createField("COUNT_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.SUM_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> SUM_TIMER_READ_ONLY = createField("SUM_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.MIN_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> MIN_TIMER_READ_ONLY = createField("MIN_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.AVG_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> AVG_TIMER_READ_ONLY = createField("AVG_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_thread_by_event_name.MAX_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByThreadByEventNameRecord, ULong> MAX_TIMER_READ_ONLY = createField("MAX_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.events_transactions_summary_by_thread_by_event_name</code> table reference
     */
    public EventsTransactionsSummaryByThreadByEventName() {
        this("events_transactions_summary_by_thread_by_event_name", null);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_summary_by_thread_by_event_name</code> table reference
     */
    public EventsTransactionsSummaryByThreadByEventName(String alias) {
        this(alias, EVENTS_TRANSACTIONS_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    private EventsTransactionsSummaryByThreadByEventName(String alias, Table<EventsTransactionsSummaryByThreadByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsTransactionsSummaryByThreadByEventName(String alias, Table<EventsTransactionsSummaryByThreadByEventNameRecord> aliased, Field<?>[] parameters) {
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
    public EventsTransactionsSummaryByThreadByEventName as(String alias) {
        return new EventsTransactionsSummaryByThreadByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    public EventsTransactionsSummaryByThreadByEventName rename(String name) {
        return new EventsTransactionsSummaryByThreadByEventName(name, null);
    }
}
