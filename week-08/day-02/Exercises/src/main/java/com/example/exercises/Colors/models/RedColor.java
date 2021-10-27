package com.example.exercises.Colors.models;

import com.example.exercises.Colors.repositories.MyColor;
import com.example.exercises.HelloDI.services.Printer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class RedColor implements MyColor {
    Printer printer;

    public RedColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is of red color");
    }
}