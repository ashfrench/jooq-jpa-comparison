/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.sys.routines;


import com.excelian.comparison.db.jooq.entities.sys.Sys;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Takes a list, and a value to add to the list, and returns the resulting 
 * list.
 *  
 *  Useful for altering certain session variables, like sql_mode or optimizer_switch 
 * for instance.
 *  
 *  Parameters
 *  
 *  in_list (TEXT):
 *  The comma separated list to add a value to
 *  
 *  in_add_value (TEXT):
 *  The value to add to the input list
 *  
 *  Returns
 *  
 *  TEXT
 *  
 *  Example
 *  
 *  mysql> select @@sql_mode;
 *  +-----------------------------------------------------------------------------------+
 *  | @@sql_mode                                                          
 *               |
 *  +-----------------------------------------------------------------------------------+
 *  | ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION 
 * |
 *  +-----------------------------------------------------------------------------------+
 *  1 row in set (0.00 sec)
 *  
 *  mysql> set sql_mode = sys.list_add(@@sql_mode, 'ANSI_QUOTES');
 *  Query OK, 0 rows affected (0.06 sec)
 *  
 *  mysql> select @@sql_mode;
 *  +-----------------------------------------------------------------------------------------------+
 *  | @@sql_mode                                                          
 *                           |
 *  +-----------------------------------------------------------------------------------------------+
 *  | ANSI_QUOTES,ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION 
 * |
 *  +-----------------------------------------------------------------------------------------------+
 *  1 row in set (0.00 sec)
 *  
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
public class ListAdd extends AbstractRoutine<String> {

    private static final long serialVersionUID = 2736684;

    /**
     * The parameter <code>sys.list_add.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>sys.list_add.in_list</code>.
     */
    public static final Parameter<String> IN_LIST = createParameter("in_list", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>sys.list_add.in_add_value</code>.
     */
    public static final Parameter<String> IN_ADD_VALUE = createParameter("in_add_value", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public ListAdd() {
        super("list_add", Sys.SYS, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(IN_LIST);
        addInParameter(IN_ADD_VALUE);
    }

    /**
     * Set the <code>in_list</code> parameter IN value to the routine
     */
    public void setInList(String value) {
        setValue(IN_LIST, value);
    }

    /**
     * Set the <code>in_list</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setInList(Field<String> field) {
        setField(IN_LIST, field);
    }

    /**
     * Set the <code>in_add_value</code> parameter IN value to the routine
     */
    public void setInAddValue(String value) {
        setValue(IN_ADD_VALUE, value);
    }

    /**
     * Set the <code>in_add_value</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setInAddValue(Field<String> field) {
        setField(IN_ADD_VALUE, field);
    }
}
