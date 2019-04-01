package com.example.spring_examples.example3;

import com.example.spring_examples.example3.aop.AOPService3;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MyAspect3Test {
    @Autowired
    private AOPService3 aopService3;
    @Test
    public void getName() {
        log.debug(aopService3.getName("GT"));
    }
}
