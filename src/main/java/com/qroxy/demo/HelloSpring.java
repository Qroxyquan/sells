package com.qroxy.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {
    @GetMapping(value = "/")
    public String hellWorld(){
        return "hello spring!";
    }
}
