/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities.mysql.enums;


import javax.annotation.Generated;

import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum ProcType implements EnumType {

    FUNCTION("FUNCTION"),

    PROCEDURE("PROCEDURE");

    private final String literal;

    private ProcType(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "proc_type";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}