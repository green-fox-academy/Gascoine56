package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument {
    String name = "Electric guitar";
    int numberofStrings;
    String sound = "Twang";

    public ElectricGuitar() {
        this.name = "Electric guitar";
        this.numberofStrings = 6;

    }

    public ElectricGuitar(int numberofStrings) {
        this.numberofStrings = numberofStrings;
    }

    @Override
    public void sound(String sound) {
        System.out.println(sound);
    }

    public void play() {
        System.out.println(name + " ,a " + numberofStrings + "-stringed instrument that goes " + this.sound);
    }
}
