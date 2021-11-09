package com.example.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Greeting {

    private String name;
    private String title;
    private String welcome_message;

    public Greeting(String name, String title) {
        this.name = name;
        this.title = title;
        this.welcome_message = "Oh, hi there " + this.name + ", my dear " + this.title + "!";

    }

    @Override
    public String toString() {
        return "welcome_message{" +
                "Oh, hi there'" + name + '\'' +
                ", my dear '" + title + '\'' + "!" +
                '}';
    }
}