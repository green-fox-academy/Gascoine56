package com.example.programmerfoxclub.repositories;

import com.example.programmerfoxclub.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxStorage {

    List<Fox> foxLair;

    @Autowired
    public FoxStorage(List<Fox> foxLair) {
        this.foxLair = foxLair;
        foxLair.add(new Fox("BasicFox"));
    }

    public List<Fox> getFoxLair() {
        return foxLair;
    }

    public void setFoxLair(List<Fox> foxLair) {
        this.foxLair = foxLair;
    }

    public void addFox(Fox fox) {
        foxLair.add(fox);
    }
}
