package com.ray.enjoy.java.logging.l1;

import com.ray.enjoy.java.logging.l1.l2.L2Example;
import org.slf4j.Logger;

/**
 * 激活 maven profile：logback-loggerLevel，然后再运行
 */
public class L1Example {
    static Logger logger = org.slf4j.LoggerFactory.getLogger(L1Example.class);

    public static void main(String[] args) {
        logger.info("This is l1 logged info.");
        logger.error("This is l2 logged error.");

        L2Example.log();
    }
}