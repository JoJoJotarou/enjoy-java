package com.ray.enjoy.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 激活 maven profile：logback-autoRefresh，然后再运行
 */
public class AutoRefreshExample {
    static Logger logger = LoggerFactory.getLogger(AutoRefreshExample.class);

    public static void main(String[] args) {
        while (true) {
            // 注意：修改src/main/resources/logback/autoRefresh/logback.xml是无效的
            logger.info("set target/classes/logback.xml root level = error, this message will not print");
            logger.error("This is error message");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}