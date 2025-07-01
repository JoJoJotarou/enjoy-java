package com.ray.enjoy.java.logging.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Aspect
@Component
public class TraceIdMDCAspect {

    @Pointcut("execution(* com.ray.enjoy.java.logging.*.*Service.*(..))")
    public void logPointcut() {
    }

    @Around("logPointcut()")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            MDC.put("traceId", UUID.randomUUID().toString());
            return joinPoint.proceed();
        } finally {
            MDC.clear();
        }
    }
}