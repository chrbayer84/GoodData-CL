package com.gooddata.exception;

/**
 * GoodData ModelException
 *
 * @author zd <zd@gooddata.com>
 * @version 1.0
 */
public class ModelException extends GdcException {

    /**
     * Constructor
     * @param s message
     */
    public ModelException(String s) {
        super(s);
    }
    
    public ModelException(Throwable t) {
    	super(t);
    }
    
    public ModelException(String s, Throwable t) {
    	super(s, t);
    }

}