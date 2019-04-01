package com.example.spring_examples.example2;

import org.springframework.stereotype.Service;

@Service
public class AOPService2 {
    public String welcome(String name){
        return "welcome "+name;
    }
}
