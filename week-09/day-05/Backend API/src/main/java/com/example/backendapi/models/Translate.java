package com.example.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Translate {

    private String text;
    private String lang;
    private String translated;
    private ArrayList teve = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u', 'y'));

    public Translate(String text, String lang) {
        this.text = text;
        this.lang = lang;
        this.translated = translate(text, lang);
    }

    private String translate(String text, String lang) {
        StringBuilder str = new StringBuilder();
        if (lang.equals("hu")) {
            setLang("teve");
            for (char c : text.toCharArray()) {
                if (teve.contains(c)) {
                    str.append(c).append('v').append(c);
                } else str.append(c);
            }
        } else {
            int counter = 0;
            setLang("gibberish");
            for (char c : text.toCharArray()) {
                str.append(c);
                counter += 1;
                if (counter >= 4) {
                    counter = 0;
                    str.append("oh");
                }
            }
        }
        return str.toString();
    }

    @Override
    public String toString() {
        return "Translate{" +
                "text='" + text + '\'' +
                ", lang='" + lang + '\'' +
                '}';
    }

    public String toStringResponse() {
        return "Translate{" +
                "translated='" + translated + '\'' +
                ", responseLang='" + lang + '\'' +
                '}';
    }
}