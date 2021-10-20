package com.example.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    private AtomicLong greetCounter;
    private String content;

    public Greeting(String content, AtomicLong greetCount) {
        this.content = content;
        greetCounter = greetCount;
    }

    public String getContent() {
        return content;
    }

    public AtomicLong getGreetCounter() {
        return greetCounter;
    }

    public void setGreetCounter(AtomicLong greetCounter) {
        this.greetCounter = greetCounter;
    }

    public void setContent(String content) {
        this.content = content;
    }
}