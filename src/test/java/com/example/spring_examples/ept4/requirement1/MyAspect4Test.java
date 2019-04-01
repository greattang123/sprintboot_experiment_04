package com.example.spring_examples.ept4.requirement1;

import com.example.spring_examples.ept4.requirement1.service.UserService4;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MyAspect4Test {
    @Autowired
    private UserService4 us;
    @Test
    public void welcomeTest(){
        log.debug(us.welcome("GreatTang"));
    }
    @Test
    public void addUserTest(){
        us.addUser();
        us.getUser();
    }
}
