package com.example.spring_examples.example1.repository;

import com.example.spring_examples.example1.service.AOPService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AOPServiceImpl implements AOPService {

    @Override
    public void get() {
        log.debug("AOPServiceImpl.get()");
    }
}
