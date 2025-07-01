package com.ray.enjoy.java.logging.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {
    private static final Logger log = LoggerFactory.getLogger(LoggingService.class);

    public void log() {
        log.info("this a test message");
    }
}