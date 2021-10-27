package com.example.exercises.Colors.models;

import com.example.exercises.Colors.repositories.MyColor;
import com.example.exercises.HelloDI.services.Printer;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {
    public BlueColor(Printer printer) {
        this.printer = printer;
    }

    Printer printer;

    @Override
    public void printColor() {
        printer.log("It is of blue color");
    }
}