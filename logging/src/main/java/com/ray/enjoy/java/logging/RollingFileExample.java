package com.ray.enjoy.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 激活 maven profile：logback-autoRefresh，然后再运行
 */
public class RollingFileExample {
    static Logger logger = LoggerFactory.getLogger(RollingFileExample.class);

    public static void main(String[] args) {
        while (true) {
            logger.info("This is error message");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}