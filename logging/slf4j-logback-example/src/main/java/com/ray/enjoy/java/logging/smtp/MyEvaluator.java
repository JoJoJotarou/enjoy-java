package com.ray.enjoy.java.logging.smtp;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.boolex.EventEvaluatorBase;

/**
 * ERROR 3次才发邮件
 */
public class MyEvaluator extends EventEvaluatorBase<ILoggingEvent> {

    int counter = 0;

    public boolean evaluate(ILoggingEvent event) {

        if (Level.ERROR == event.getLevel()) {
            counter++;
        }

        if (counter >= 3) {
            counter = 0;
            return true;
        }

        return false;
    }
}