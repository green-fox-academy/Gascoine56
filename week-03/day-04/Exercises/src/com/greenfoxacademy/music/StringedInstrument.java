package com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument {
    private int numberOfStrings;
    String sound;

    public void sound(String sound) {
        this.sound = sound;
    }
    @Override
    public void play() {
    }
}
