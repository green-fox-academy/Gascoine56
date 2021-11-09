package com.example.backendapi.models.classtypemodels;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StringModel {

    private String text;

    public StringModel(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "StringModel{" +
                "text='" + text + '\'' +
                '}';
    }
}