package com.ray.enjoy.java.logging;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

/**
 * 激活 maven profile：logback-nonXml，然后再运行
 */
public class RootLoggerExample {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);

    public static void main(String[] args) {
        logger.setLevel(Level.ERROR);
        logger.warn("This message is not logged because WARN < ERROR.");
        logger.error("This is logged.");
    }
}