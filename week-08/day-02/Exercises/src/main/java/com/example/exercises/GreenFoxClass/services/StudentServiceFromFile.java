package com.example.exercises.GreenFoxClass.services;

import com.example.exercises.GreenFoxClass.repositories.FoxInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

@Service
@Primary
public class StudentServiceFromFile implements FoxInterface {
    private List<String> names;
    Path filePath = Paths.get("C:\\Users\\Palo\\greenfox\\Gascoine56\\week-08\\day-02\\Exercises\\src\\main\\resources\\txt files\\names.txt");

    public StudentServiceFromFile() {
        try {
            Files.writeString(filePath,"Sanyi \n", Charset.defaultCharset());
            Files.writeString(filePath,"Lilla \n", Charset.defaultCharset(), StandardOpenOption.APPEND);
            Files.writeString(filePath,"John \n", Charset.defaultCharset(), StandardOpenOption.APPEND);
            Files.writeString(filePath,"Palo \n", Charset.defaultCharset(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    public List<String> findAll() throws IOException {
        names = (Files.readAllLines(filePath));
        return names;
    }

    public void save(String student) throws IOException {
        Files.writeString(filePath, student + "\n", StandardOpenOption.APPEND);
    }

    public int count() throws IOException {
        return Files.readAllLines(filePath).size();
    }

    public boolean checkByName(String name) throws IOException {
        return Files.readAllLines(filePath).contains(name);
    }
}