package com.example.spring_examples.ept4.requirement1.aspect;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target({TYPE,METHOD})
public @interface MyInterceptor {
    MyInterceptorType[] value()default MyInterceptorType.USER;
    public static  enum MyInterceptorType{
        USER, ADMIN;
    }
}
