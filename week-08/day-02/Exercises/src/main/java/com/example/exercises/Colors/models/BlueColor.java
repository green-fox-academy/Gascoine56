package com.example.exercises.Colors.models;

import com.example.exercises.Colors.repositories.MyColor;
import com.example.exercises.HelloDI.services.Printer;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {
    Printer printer;

    public BlueColor(Printer printer) {
        this.printer = printer;
    }

    public void printColor() {
        printer.log("It is of blue color");
    }
}