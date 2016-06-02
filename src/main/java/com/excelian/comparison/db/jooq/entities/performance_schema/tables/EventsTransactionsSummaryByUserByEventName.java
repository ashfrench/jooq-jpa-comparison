/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.performance_schema.tables;


import com.excelian.comparison.db.jooq.entities.performance_schema.PerformanceSchema;
import com.excelian.comparison.db.jooq.entities.performance_schema.tables.records.EventsTransactionsSummaryByUserByEventNameRecord;

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
public class EventsTransactionsSummaryByUserByEventName extends TableImpl<EventsTransactionsSummaryByUserByEventNameRecord> {

    private static final long serialVersionUID = -1150866524;

    /**
     * The reference instance of <code>performance_schema.events_transactions_summary_by_user_by_event_name</code>
     */
    public static final EventsTransactionsSummaryByUserByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME = new EventsTransactionsSummaryByUserByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsTransactionsSummaryByUserByEventNameRecord> getRecordType() {
        return EventsTransactionsSummaryByUserByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.USER</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, String> USER = createField("USER", org.jooq.impl.SQLDataType.CHAR.length(32), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> COUNT_READ_WRITE = createField("COUNT_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> SUM_TIMER_READ_WRITE = createField("SUM_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> MIN_TIMER_READ_WRITE = createField("MIN_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> AVG_TIMER_READ_WRITE = createField("AVG_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> MAX_TIMER_READ_WRITE = createField("MAX_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> COUNT_READ_ONLY = createField("COUNT_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> SUM_TIMER_READ_ONLY = createField("SUM_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> MIN_TIMER_READ_ONLY = createField("MIN_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> AVG_TIMER_READ_ONLY = createField("AVG_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByUserByEventNameRecord, ULong> MAX_TIMER_READ_ONLY = createField("MAX_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.events_transactions_summary_by_user_by_event_name</code> table reference
     */
    public EventsTransactionsSummaryByUserByEventName() {
        this("events_transactions_summary_by_user_by_event_name", null);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_summary_by_user_by_event_name</code> table reference
     */
    public EventsTransactionsSummaryByUserByEventName(String alias) {
        this(alias, EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    private EventsTransactionsSummaryByUserByEventName(String alias, Table<EventsTransactionsSummaryByUserByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsTransactionsSummaryByUserByEventName(String alias, Table<EventsTransactionsSummaryByUserByEventNameRecord> aliased, Field<?>[] parameters) {
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
    public EventsTransactionsSummaryByUserByEventName as(String alias) {
        return new EventsTransactionsSummaryByUserByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    public EventsTransactionsSummaryByUserByEventName rename(String name) {
        return new EventsTransactionsSummaryByUserByEventName(name, null);
    }
}
