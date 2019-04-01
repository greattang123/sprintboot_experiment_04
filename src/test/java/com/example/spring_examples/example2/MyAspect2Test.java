package com.example.spring_examples.example2;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyAspect2Test {
    @Autowired
    private AOPService2 aopService2;
    @Test
    public void beforeTest(){
        aopService2.welcome("GT");
    }
    @Test
    public void getName(){
        log.debug(aopService2.welcome("GT"));
    }

}
