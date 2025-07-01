package com.ray.enjoy.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 激活 maven profile：logback-nonXml，然后再运行
 */
public class CommonLoggingExample {
    static Logger logger = LoggerFactory.getLogger(CommonLoggingExample.class);

    public static void main(String[] args) {
        // 默认日志等级是 debug
        logger.trace("Example trace log from {}", CommonLoggingExample.class.getSimpleName());
        logger.info("Example info log from {}", CommonLoggingExample.class.getSimpleName());
        logger.warn("Example warn log from {}", CommonLoggingExample.class.getSimpleName());
        logger.error("Example error log from {}", CommonLoggingExample.class.getSimpleName());
        logger.debug("Example debug log from {}", CommonLoggingExample.class.getSimpleName());
        logger.error("Example error log from {}", CommonLoggingExample.class.getSimpleName(), new Exception("test smpt"));
    }
}