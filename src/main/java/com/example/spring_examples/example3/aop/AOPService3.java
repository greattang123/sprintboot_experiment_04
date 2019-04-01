package com.example.spring_examples.example3.aop;

import org.springframework.stereotype.Service;

@Service
public class AOPService3 {
    public String getName(String name) {
        return "welcome " + name;
    }
}
