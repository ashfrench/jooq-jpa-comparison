/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.routines;


import com.excelian.comparison.db.jooq.entities.sys.Sys;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Takes the query in the argument and executes it using a prepared statement. 
 * The prepared statement is deallocated,
 *  so the procedure is mainly useful for executing one off dynamically created 
 * queries.
 *  
 *  The sys_execute_prepared_stmt prepared statement name is used for the 
 * query and is required not to exist.
 *  
 *  
 *  Parameters
 *  
 *  in_query (longtext CHARACTER SET UTF8):
 *  The query to execute.
 *  
 *  
 *  Configuration Options
 *  
 *  sys.debug
 *  Whether to provide debugging output.
 *  Default is 'OFF'. Set to 'ON' to include.
 *  
 *  
 *  Example
 *  
 *  mysql> CALL sys.execute_prepared_stmt('SELECT * FROM sys.sys_config');
 *  +------------------------+-------+---------------------+--------+
 *  | variable               | value | set_time            | set_by |
 *  +------------------------+-------+---------------------+--------+
 *  | statement_truncate_len | 64    | 2015-06-30 13:06:00 | NULL   |
 *  +------------------------+-------+---------------------+--------+
 *  1 row in set (0.00 sec)
 *  
 *  Query OK, 0 rows affected (0.00 sec)
 *  
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExecutePreparedStmt extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -618342065;

    /**
     * The parameter <code>sys.execute_prepared_stmt.in_query</code>.
     */
    public static final Parameter<String> IN_QUERY = createParameter("in_query", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public ExecutePreparedStmt() {
        super("execute_prepared_stmt", Sys.SYS);

        addInParameter(IN_QUERY);
    }

    /**
     * Set the <code>in_query</code> parameter IN value to the routine
     */
    public void setInQuery(String value) {
        setValue(IN_QUERY, value);
    }
}
