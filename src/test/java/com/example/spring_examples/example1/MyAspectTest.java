package com.example.spring_examples.example1;

import com.example.spring_examples.example1.service.AOPService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyAspectTest {
    @Autowired
    private AOPService aopService;
    @Test
    public void getTest(){
        aopService.get();
        log.debug("{}",aopService.getClass().getSimpleName());
    }
}
