package com.example.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Until {

    private int until;

    public Until(int until) {
        this.until = until;
    }

    @Override
    public String toString() {
        return "Until{" +
                "until=" + until +
                '}';
    }
}