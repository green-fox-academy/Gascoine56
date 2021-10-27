package com.example.exercises.Colors.controllors;

import com.example.exercises.Colors.models.BlueColor;
import com.example.exercises.Colors.repositories.MyColor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    public Controller(MyColor color) {
        this.color = color;
    }

    MyColor color;

    @GetMapping("/")
    public void print(){
        color.printColor();
    }


}
