package com.ray.enjoy.java.logging.smtp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import java.util.stream.IntStream;

/**
 * use profile：logback-smtp-marker
 */
public class SMTPMarkerExample {
    static Logger logger = LoggerFactory.getLogger(SMTPMarkerExample.class);

    public static void main(String[] args) {

        IntStream.range(0, 251).forEach(i ->
                logger.info("Example log from {}", i)
        );

        Marker notifyAdmin = MarkerFactory.getMarker("NOTIFY_ADMIN");
        IntStream.range(0, 4).forEach(
                i -> {
                    if (i == 2)
                        logger.error(notifyAdmin, "Example log from {}", i, new Exception("test smtp"));
                    logger.error("Example log from {}", i, new Exception("test smtp"));
                }
        );
    }
}