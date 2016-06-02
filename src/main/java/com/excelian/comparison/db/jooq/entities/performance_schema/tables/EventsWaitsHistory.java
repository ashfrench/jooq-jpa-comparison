/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.performance_schema.tables;


import com.excelian.comparison.db.jooq.entities.performance_schema.PerformanceSchema;
import com.excelian.comparison.db.jooq.entities.performance_schema.enums.EventsWaitsHistoryNestingEventType;
import com.excelian.comparison.db.jooq.entities.performance_schema.tables.records.EventsWaitsHistoryRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class EventsWaitsHistory extends TableImpl<EventsWaitsHistoryRecord> {

    private static final long serialVersionUID = -908089538;

    /**
     * The reference instance of <code>performance_schema.events_waits_history</code>
     */
    public static final EventsWaitsHistory EVENTS_WAITS_HISTORY = new EventsWaitsHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsWaitsHistoryRecord> getRecordType() {
        return EventsWaitsHistoryRecord.class;
    }

    /**
     * The column <code>performance_schema.events_waits_history.THREAD_ID</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.EVENT_ID</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.END_EVENT_ID</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, ULong> END_EVENT_ID = createField("END_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.EVENT_NAME</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.SOURCE</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.TIMER_START</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.TIMER_END</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.SPINS</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, UInteger> SPINS = createField("SPINS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.OBJECT_SCHEMA</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.OBJECT_NAME</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.INDEX_NAME</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.OBJECT_TYPE</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, EventsWaitsHistoryNestingEventType> NESTING_EVENT_TYPE = createField("NESTING_EVENT_TYPE", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.excelian.comparison.db.jooq.entities.performance_schema.enums.EventsWaitsHistoryNestingEventType.class), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.OPERATION</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, String> OPERATION = createField("OPERATION", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.NUMBER_OF_BYTES</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, Long> NUMBER_OF_BYTES = createField("NUMBER_OF_BYTES", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.FLAGS</code>.
     */
    public final TableField<EventsWaitsHistoryRecord, UInteger> FLAGS = createField("FLAGS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * Create a <code>performance_schema.events_waits_history</code> table reference
     */
    public EventsWaitsHistory() {
        this("events_waits_history", null);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_history</code> table reference
     */
    public EventsWaitsHistory(String alias) {
        this(alias, EVENTS_WAITS_HISTORY);
    }

    private EventsWaitsHistory(String alias, Table<EventsWaitsHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsWaitsHistory(String alias, Table<EventsWaitsHistoryRecord> aliased, Field<?>[] parameters) {
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
    public EventsWaitsHistory as(String alias) {
        return new EventsWaitsHistory(alias, this);
    }

    /**
     * Rename this table
     */
    public EventsWaitsHistory rename(String name) {
        return new EventsWaitsHistory(name, null);
    }
}
