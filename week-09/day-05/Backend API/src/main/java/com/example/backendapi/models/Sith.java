package com.example.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Locale;

@Getter
@Setter
@NoArgsConstructor
public class Sith {

    private String result;

    public Sith(String text) {
        this.result = sithTalk(text);
    }

    public String sithTalk(String text) {
        String[] sentences = text.split("\\.");
        StringBuilder str = new StringBuilder();
        for (String sentence : sentences) {
            String[] words = sentence.trim().split(" ");
            for (int i = 0; i < (words.length / 2) * 2; i += 2) {
                if (i == 0) {
                    words[i] = words[i].toLowerCase(Locale.ROOT);
                    words[i + 1] = words[i + 1].substring(0, 1).toUpperCase() + words[i + 1].substring(1);
                }
                str.append(words[i + 1]).append(" ");
                str.append(words[i]).append(" ");
            }
            if (words.length % 2 != 0) {
                str.append(words[words.length - 1]);
            }
            str.append(". ");
            str.append("Err ");
        }
        return str.toString();
    }

    @Override
    public String toString() {
        return "Sith{" +
                "result='" + result + '\'' +
                '}';
    }
}