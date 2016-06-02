/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.mysql;


import com.excelian.comparison.db.jooq.entities.mysql.tables.ColumnsPriv;
import com.excelian.comparison.db.jooq.entities.mysql.tables.Db;
import com.excelian.comparison.db.jooq.entities.mysql.tables.EngineCost;
import com.excelian.comparison.db.jooq.entities.mysql.tables.Event;
import com.excelian.comparison.db.jooq.entities.mysql.tables.Func;
import com.excelian.comparison.db.jooq.entities.mysql.tables.GeneralLog;
import com.excelian.comparison.db.jooq.entities.mysql.tables.GtidExecuted;
import com.excelian.comparison.db.jooq.entities.mysql.tables.HelpCategory;
import com.excelian.comparison.db.jooq.entities.mysql.tables.HelpKeyword;
import com.excelian.comparison.db.jooq.entities.mysql.tables.HelpRelation;
import com.excelian.comparison.db.jooq.entities.mysql.tables.HelpTopic;
import com.excelian.comparison.db.jooq.entities.mysql.tables.InnodbIndexStats;
import com.excelian.comparison.db.jooq.entities.mysql.tables.InnodbTableStats;
import com.excelian.comparison.db.jooq.entities.mysql.tables.NdbBinlogIndex;
import com.excelian.comparison.db.jooq.entities.mysql.tables.Plugin;
import com.excelian.comparison.db.jooq.entities.mysql.tables.Proc;
import com.excelian.comparison.db.jooq.entities.mysql.tables.ProcsPriv;
import com.excelian.comparison.db.jooq.entities.mysql.tables.ProxiesPriv;
import com.excelian.comparison.db.jooq.entities.mysql.tables.ServerCost;
import com.excelian.comparison.db.jooq.entities.mysql.tables.Servers;
import com.excelian.comparison.db.jooq.entities.mysql.tables.SlaveMasterInfo;
import com.excelian.comparison.db.jooq.entities.mysql.tables.SlaveRelayLogInfo;
import com.excelian.comparison.db.jooq.entities.mysql.tables.SlaveWorkerInfo;
import com.excelian.comparison.db.jooq.entities.mysql.tables.SlowLog;
import com.excelian.comparison.db.jooq.entities.mysql.tables.TablesPriv;
import com.excelian.comparison.db.jooq.entities.mysql.tables.TimeZone;
import com.excelian.comparison.db.jooq.entities.mysql.tables.TimeZoneLeapSecond;
import com.excelian.comparison.db.jooq.entities.mysql.tables.TimeZoneName;
import com.excelian.comparison.db.jooq.entities.mysql.tables.TimeZoneTransition;
import com.excelian.comparison.db.jooq.entities.mysql.tables.TimeZoneTransitionType;
import com.excelian.comparison.db.jooq.entities.mysql.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in mysql
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * Column privileges
     */
    public static final ColumnsPriv COLUMNS_PRIV = com.excelian.comparison.db.jooq.entities.mysql.tables.ColumnsPriv.COLUMNS_PRIV;

    /**
     * Database privileges
     */
    public static final Db DB = com.excelian.comparison.db.jooq.entities.mysql.tables.Db.DB;

    /**
     * The table <code>mysql.engine_cost</code>.
     */
    public static final EngineCost ENGINE_COST = com.excelian.comparison.db.jooq.entities.mysql.tables.EngineCost.ENGINE_COST;

    /**
     * Events
     */
    public static final Event EVENT = com.excelian.comparison.db.jooq.entities.mysql.tables.Event.EVENT;

    /**
     * User defined functions
     */
    public static final Func FUNC = com.excelian.comparison.db.jooq.entities.mysql.tables.Func.FUNC;

    /**
     * General log
     */
    public static final GeneralLog GENERAL_LOG = com.excelian.comparison.db.jooq.entities.mysql.tables.GeneralLog.GENERAL_LOG;

    /**
     * The table <code>mysql.gtid_executed</code>.
     */
    public static final GtidExecuted GTID_EXECUTED = com.excelian.comparison.db.jooq.entities.mysql.tables.GtidExecuted.GTID_EXECUTED;

    /**
     * help categories
     */
    public static final HelpCategory HELP_CATEGORY = com.excelian.comparison.db.jooq.entities.mysql.tables.HelpCategory.HELP_CATEGORY;

    /**
     * help keywords
     */
    public static final HelpKeyword HELP_KEYWORD = com.excelian.comparison.db.jooq.entities.mysql.tables.HelpKeyword.HELP_KEYWORD;

    /**
     * keyword-topic relation
     */
    public static final HelpRelation HELP_RELATION = com.excelian.comparison.db.jooq.entities.mysql.tables.HelpRelation.HELP_RELATION;

    /**
     * help topics
     */
    public static final HelpTopic HELP_TOPIC = com.excelian.comparison.db.jooq.entities.mysql.tables.HelpTopic.HELP_TOPIC;

    /**
     * The table <code>mysql.innodb_index_stats</code>.
     */
    public static final InnodbIndexStats INNODB_INDEX_STATS = com.excelian.comparison.db.jooq.entities.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS;

    /**
     * The table <code>mysql.innodb_table_stats</code>.
     */
    public static final InnodbTableStats INNODB_TABLE_STATS = com.excelian.comparison.db.jooq.entities.mysql.tables.InnodbTableStats.INNODB_TABLE_STATS;

    /**
     * The table <code>mysql.ndb_binlog_index</code>.
     */
    public static final NdbBinlogIndex NDB_BINLOG_INDEX = com.excelian.comparison.db.jooq.entities.mysql.tables.NdbBinlogIndex.NDB_BINLOG_INDEX;

    /**
     * MySQL plugins
     */
    public static final Plugin PLUGIN = com.excelian.comparison.db.jooq.entities.mysql.tables.Plugin.PLUGIN;

    /**
     * Stored Procedures
     */
    public static final Proc PROC = com.excelian.comparison.db.jooq.entities.mysql.tables.Proc.PROC;

    /**
     * Procedure privileges
     */
    public static final ProcsPriv PROCS_PRIV = com.excelian.comparison.db.jooq.entities.mysql.tables.ProcsPriv.PROCS_PRIV;

    /**
     * User proxy privileges
     */
    public static final ProxiesPriv PROXIES_PRIV = com.excelian.comparison.db.jooq.entities.mysql.tables.ProxiesPriv.PROXIES_PRIV;

    /**
     * MySQL Foreign Servers table
     */
    public static final Servers SERVERS = com.excelian.comparison.db.jooq.entities.mysql.tables.Servers.SERVERS;

    /**
     * The table <code>mysql.server_cost</code>.
     */
    public static final ServerCost SERVER_COST = com.excelian.comparison.db.jooq.entities.mysql.tables.ServerCost.SERVER_COST;

    /**
     * Master Information
     */
    public static final SlaveMasterInfo SLAVE_MASTER_INFO = com.excelian.comparison.db.jooq.entities.mysql.tables.SlaveMasterInfo.SLAVE_MASTER_INFO;

    /**
     * Relay Log Information
     */
    public static final SlaveRelayLogInfo SLAVE_RELAY_LOG_INFO = com.excelian.comparison.db.jooq.entities.mysql.tables.SlaveRelayLogInfo.SLAVE_RELAY_LOG_INFO;

    /**
     * Worker Information
     */
    public static final SlaveWorkerInfo SLAVE_WORKER_INFO = com.excelian.comparison.db.jooq.entities.mysql.tables.SlaveWorkerInfo.SLAVE_WORKER_INFO;

    /**
     * Slow log
     */
    public static final SlowLog SLOW_LOG = com.excelian.comparison.db.jooq.entities.mysql.tables.SlowLog.SLOW_LOG;

    /**
     * Table privileges
     */
    public static final TablesPriv TABLES_PRIV = com.excelian.comparison.db.jooq.entities.mysql.tables.TablesPriv.TABLES_PRIV;

    /**
     * Time zones
     */
    public static final TimeZone TIME_ZONE = com.excelian.comparison.db.jooq.entities.mysql.tables.TimeZone.TIME_ZONE;

    /**
     * Leap seconds information for time zones
     */
    public static final TimeZoneLeapSecond TIME_ZONE_LEAP_SECOND = com.excelian.comparison.db.jooq.entities.mysql.tables.TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND;

    /**
     * Time zone names
     */
    public static final TimeZoneName TIME_ZONE_NAME = com.excelian.comparison.db.jooq.entities.mysql.tables.TimeZoneName.TIME_ZONE_NAME;

    /**
     * Time zone transitions
     */
    public static final TimeZoneTransition TIME_ZONE_TRANSITION = com.excelian.comparison.db.jooq.entities.mysql.tables.TimeZoneTransition.TIME_ZONE_TRANSITION;

    /**
     * Time zone transition types
     */
    public static final TimeZoneTransitionType TIME_ZONE_TRANSITION_TYPE = com.excelian.comparison.db.jooq.entities.mysql.tables.TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE;

    /**
     * Users and global privileges
     */
    public static final User USER = com.excelian.comparison.db.jooq.entities.mysql.tables.User.USER;
}
