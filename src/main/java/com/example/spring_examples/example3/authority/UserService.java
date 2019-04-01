package com.example.spring_examples.example3.authority;

import com.example.spring_examples.example3.authority.MyAuthority;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@MyAuthority
@Slf4j
public class UserService {
    @MyAuthority(value = MyAuthority.MyAuthorityType.ADMIN)
    public void addUser(){
        log.debug("Admin authority");
    }
    public void getUser(){
        log.debug("common user authority");
    }
}
