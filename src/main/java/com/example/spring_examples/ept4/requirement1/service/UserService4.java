package com.example.spring_examples.ept4.requirement1.service;

import com.example.spring_examples.ept4.requirement1.aspect.MyInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService4 {
    public String welcome(String name){
        return name+" 您好，欢迎您来买车！";
    }
    @MyInterceptor(value = MyInterceptor.MyInterceptorType.ADMIN)
    public void addUser(){
        log.debug("Admin authority");
    }
    public void getUser(){
        log.debug("common user authority");
    }
}
