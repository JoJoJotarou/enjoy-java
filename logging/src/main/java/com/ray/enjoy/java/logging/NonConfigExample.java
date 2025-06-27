package com.ray.enjoy.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 激活 maven profile：logback-nonXml，然后再运行
 */
public class NonConfigExample {
    static Logger logger = LoggerFactory.getLogger(NonConfigExample.class);

    public static void main(String[] args) {
        // 默认日志等级是 debug
        logger.info("Example log from {}", NonConfigExample.class.getSimpleName());
        logger.trace("Example log from {}", NonConfigExample.class.getSimpleName());
    }
}