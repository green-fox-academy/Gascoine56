package com.greenfoxacademy.music;

public class Violin extends StringedInstrument {
    String name = "Violin";
    int numberofStrings;
    String sound = "Screech";

    public Violin() {
        this.name = "Violin";
        this.numberofStrings = 4;
    }

    @Override
    public void sound(String sound) {
        System.out.println(sound);
    }

    public void play() {
        System.out.println(name + " ,a " + numberofStrings + "-stringed instrument that goes " + this.sound);
    }
}
