package com.example.bankofsimba.models;

public class BankAccount {
    private String name;
    private int balance;
    private String animalType;
    private Moral moral;

    public BankAccount(String name, int balance, String animalType, Moral moral) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.moral = moral;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Moral getMoral() {
        return moral;
    }

    public void setMoral(Moral moral) {
        this.moral = moral;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
