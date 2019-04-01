package com.example.spring_examples.example3.authority;

import com.example.spring_examples.example3.authority.MyAuthority;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Slf4j
@Component
@Aspect
public class AuthorityAspect {

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
