package com.example.spring_examples.example3;

import com.example.spring_examples.example3.authority.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserAuthorityTest {
    @Autowired
    private UserService us;
    @Test
    public void addUserTest(){
        us.getUser();
        us.addUser();
    }
}