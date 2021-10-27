package com.example.exercises.Colors.models;

import com.example.exercises.Colors.repositories.MyColor;
import com.example.exercises.HelloDI.services.Printer;
import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {
    Printer printer;

    public GreenColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is of green color");
    }
}