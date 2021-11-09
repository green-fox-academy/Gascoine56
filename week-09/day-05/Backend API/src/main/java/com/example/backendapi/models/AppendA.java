package com.example.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AppendA {

    private String appended;

    public AppendA(String appendable) {
        this.appended = appendable.concat("a");
    }

    @Override
    public String toString() {
        return "AppendA{" +
                "appended='" + appended + '\'' +
                '}';
    }
}