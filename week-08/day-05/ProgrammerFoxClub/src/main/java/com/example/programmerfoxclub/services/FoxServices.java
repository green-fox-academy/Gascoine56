package com.example.programmerfoxclub.services;

import com.example.programmerfoxclub.models.Fox;
import com.example.programmerfoxclub.repositories.FoxStorage;
import com.example.programmerfoxclub.repositories.TRICKS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FoxServices {

    private FoxStorage foxLair;

    @Autowired
    public FoxServices(FoxStorage foxLair) {
        this.foxLair = foxLair;
    }

    public Fox addFoxByName(String name) {
        Fox fox = new Fox(name);
        foxLair.addFox(fox);
        return fox;
    }

    public FoxStorage getFoxLair() {
        return foxLair;
    }

    public void setFoxLair(FoxStorage foxLair) {
        this.foxLair = foxLair;
    }

    public Fox findFoxByName(String name) {
        Optional<Fox> result = foxLair.getFoxLair().stream().filter(fox -> fox.getName().equals(name)).findFirst();
        return result.orElse(addFoxByName(name));
    }

    public int getFoxLairSize() {
        return foxLair.getFoxLair().size();
    }

    public Fox getFirstFox() {
        return foxLair.getFoxLair().get(0);
    }

    public boolean allTricksLearnt(Fox fox) {
        return fox.getTricks().containsAll(tricksToList());
    }

    public List<String> tricksToList() {
        List<String> tricks = new ArrayList<>();
        for (TRICKS trick : TRICKS.values()) {
            tricks.add(trick.toString());
        }
        return tricks;
    }

    public List<String> unlearntTricksFilter(Fox fox) {
        return tricksToList().stream().filter(x -> !fox.getTricks().contains(x)).collect(Collectors.toList());
    }
    public String getDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime current = LocalDateTime.now();
        return dtf.format(current);
    }
    public void addAction(String action){
        foxLair.addAction(action);
    }
    public List<String> getRecentActions(){
        if (getFoxLair().getActions().size() > 5){
            List<String> recent = new ArrayList<>();
            for (int i = getFoxLair().getActions().size()-5; i < getFoxLair().getActions().size(); i++) {
                recent.add(getFoxLair().getActions().get(i));
            }
            return recent;
        }
        else
            return getFoxLair().getActions();
    }

}