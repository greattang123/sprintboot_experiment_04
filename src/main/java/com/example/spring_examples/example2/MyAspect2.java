package com.example.spring_examples.example2;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
@Aspect
public class MyAspect2 {
    @Pointcut("execution(* com.example.spring_examples.example2..*.*(..))")
    public void pointcut(){}
    @Before("pointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        Arrays.asList(joinPoint.getArgs())
                .forEach(arg->{
                    log.debug("arg: "+arg);
                });
        log.debug("getTarget():{}",joinPoint.getTarget().getClass());
        log.debug("getThis(): {}",joinPoint.getThis().getClass());
    }
    @Around(("pointcut()"))
    public Object aroundAdvice(ProceedingJoinPoint joinPoint)throws Throwable{
        Object[]args=joinPoint.getArgs();
        String name=(String)args[0];
        if("GT".equals(name)){
            args[0]="OK";
        }
        Object object=joinPoint.proceed(args);
        log.debug("连接点方法返回类型:{}",object.getClass());
        return object;
    }
}
