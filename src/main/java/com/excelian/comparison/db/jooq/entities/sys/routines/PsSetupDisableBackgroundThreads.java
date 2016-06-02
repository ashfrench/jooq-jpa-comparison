/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.routines;


import com.excelian.comparison.db.jooq.entities.sys.Sys;

import javax.annotation.Generated;

import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Disable all background thread instrumentation within Performance Schema.
 *  
 *  Parameters
 *  
 *  None.
 *  
 *  Example
 *  
 *  mysql> CALL sys.ps_setup_disable_background_threads();
 *  +--------------------------------+
 *  | summary                        |
 *  +--------------------------------+
 *  | Disabled 18 background threads |
 *  +--------------------------------+
 *  1 row in set (0.00 sec)
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
public class PsSetupDisableBackgroundThreads extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1589812946;

    /**
     * Create a new routine call instance
     */
    public PsSetupDisableBackgroundThreads() {
        super("ps_setup_disable_background_threads", Sys.SYS);
    }
}