package com.ray.enjoy.java.logging.l1.l2;

import org.slf4j.Logger;

public class L2Example {
    static Logger logger = org.slf4j.LoggerFactory.getLogger(L2Example.class);

    public static void log() {
        logger.info("This is not logged.");
        logger.error("This is l2 logged.");
    }
}