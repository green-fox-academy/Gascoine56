package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument {
    String name = "Bass guitar";
    int numberofStrings = 4;
    String sound = "Duum-duum-duum";

    public BassGuitar(int numberofStrings) {
        this.name = "Bass guitar";
        this.numberofStrings = numberofStrings;
    }

    public BassGuitar(){

    }

    @Override
    public void sound(String sound) {
        System.out.println(sound);
    }

    public void play() {
        System.out.println(name + " ,a " + numberofStrings + "-stringed instrument that goes " + this.sound);
    }
}
