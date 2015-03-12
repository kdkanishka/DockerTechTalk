package com.cslworld.log;

import org.apache.log4j.Logger;

/**
 * Created by kanishka on 09/03/15.
 */
public abstract class AbstractLog4JLogger {
    public final Logger logger = Logger.getLogger(this.getClass());
}
