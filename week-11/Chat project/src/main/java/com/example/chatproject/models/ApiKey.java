package com.example.chatproject.models;

import java.util.Random;

public class ApiKey {

    private String apiKey;

    public ApiKey() {
        this.apiKey = generatekey();
    }

    private String generatekey() {
        Random ran = new Random();
        long key = ran.nextLong();
        return Long.toString(key);
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public String toString() {
        return "ApiKey{" +
                "apiKey='" + apiKey + '\'' +
                '}';
    }
}
