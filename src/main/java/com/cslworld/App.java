package com.cslworld;

import com.cslworld.log.AbstractLog4JLogger;

/**
 * Created by kanishka on 09/03/15.
 */
public class App extends AbstractLog4JLogger {
    public static void main(String[] args) {
        new App();
    }

    public App(){
        logger.info("Initializing the service");
    }
}
