package com.example.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Doubling {

    private Integer received;
    private Integer result;

    public Doubling(Integer received) {
        this.received = received;
        this.result = received * 2;
    }

    @Override
    public String toString() {
        return "Doubling{" +
                "received=" + received +
                ", result=" + result +
                '}';
    }
}