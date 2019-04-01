package com.example.spring_examples.ept4.requirement1.aspect;

import com.example.spring_examples.example3.authority.MyAuthority;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Slf4j
@Aspect
@Component
public class MyAspect4 {
    @Around("execution(* com.example..*.buy*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        long start=System.nanoTime();
        Object object=joinPoint.proceed();
        long end=System.nanoTime();
        log.debug("执行时间{}",end-start);
        return object;
    }
    @Around("@within(myAuthority)||@annotation(myAuthority)")
    public Object interceptorTarget(ProceedingJoinPoint joinPoint, MyAuthority myAuthority)throws  Throwable{
        Optional.ofNullable(myAuthority)
                .or(()->{
                    MyAuthority m=joinPoint.getTarget().getClass().getAnnotation(MyAuthority.class);
                    return Optional.of(m);
                })
                .ifPresent(m->{
                    for(MyAuthority.MyAuthorityType t:m.value()){
                        log.debug("{}",t);
                    }

                });
        return joinPoint.proceed();
    }
}
