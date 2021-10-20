package com.example.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    public static AtomicLong count = new AtomicLong(0);

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam String name){
        count.addAndGet(1);
        Greeting greeting = new Greeting(" Hello, " + name, count);

        return greeting;
    }

}
