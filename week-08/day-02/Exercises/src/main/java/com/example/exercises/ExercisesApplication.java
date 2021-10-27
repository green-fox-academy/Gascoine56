package com.example.exercises;

import com.example.exercises.Colors.repositories.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercisesApplication implements CommandLineRunner {
    MyColor color;

    public ExercisesApplication(MyColor color) {
        this.color = color;
    }

    public void print() {
        color.printColor();
    }

    public static void main(String[] args) {
        SpringApplication.run(ExercisesApplication.class, args);

    }

    public void run(String... args) throws Exception {
        print();
    }
}