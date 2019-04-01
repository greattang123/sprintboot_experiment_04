package com.example.spring_examples.example1.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class MyAspect {
    @Pointcut("execution(* com.example.spring_examples.example1..*.*(..))")
    public void pointcut(){}
    @Before("pointcut()")
    public void beforeAdvice(){
        log.debug("beforeAdvice");
    }
    @AfterReturning(("pointcut()"))
    public void afterRunningAdvice(){
        log.debug("afterRunningAdvice");
    }
    @After(("pointcut()"))
    public void afterAdvice(){
        log.debug("afterAdvice");
    }
    @Around(("pointcut()"))
    public Object aroundAdvice(ProceedingJoinPoint joinPoint)throws  Throwable{
        log.debug("before aroundAdvice");
        Object object=joinPoint.proceed();
        log.debug("after aroundAdvice");
        return object;
    }

}
