package com.ray.enjoy.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log2FileExample {
    static Logger logger = LoggerFactory.getLogger(Log2FileExample.class);

    public static void main(String[] args) {
        logger.info("this is info message");
        logger.error("this is error message");
    }
}