package com.ray.enjoy.java.logging.smtp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class SMTPExample {
    static Logger logger = LoggerFactory.getLogger(SMTPExample.class);

    public static void main(String[] args) {
        // LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        // lc.reset();
        IntStream.range(0, 251).forEach(i ->
                logger.info("Example log from {}", i)
        );

        IntStream.range(0, 4).forEach(
                i -> logger.error("Example log from {}", i, new Exception("test smtp"))
        );

        // lc.stop();
        // try {
        //     Thread.sleep(10000);
        // } catch (InterruptedException e) {
        //     throw new RuntimeException(e);
        // }
    }
}