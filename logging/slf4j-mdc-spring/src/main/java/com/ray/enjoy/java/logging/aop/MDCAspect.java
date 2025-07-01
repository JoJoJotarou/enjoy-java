package com.ray.enjoy.java.logging.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MDCAspect {

    @Pointcut("execution(* com.ray.enjoy.java.logging.*.*Service.*(..))")
    public void logPointcut() {
    }

    @Around("logPointcut()")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            MDC.put("APP_ID", "APP1");
            return joinPoint.proceed();
        } finally {
            MDC.clear();
        }
    }
}