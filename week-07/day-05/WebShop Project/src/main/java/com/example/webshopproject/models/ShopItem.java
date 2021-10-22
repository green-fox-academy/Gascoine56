package com.example.webshopproject.models;

import com.example.webshopproject.controllers.ShopController;

public class ShopItem {

    private String name;
    private String description;
    private double price;
    private double stock;
    private String volumeUnit;
    private String type;
    private String currency;

    public ShopItem(String name, String description, double price, double stock, String volumeUnit, String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.volumeUnit = volumeUnit;
        this.type = type;
        currency = "CZK";
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPriceEUR() {
        this.price /= 26;
    }

    public void setpriceOriginal() {
        this.price *= 26;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getVolumeUnit() {
        return volumeUnit;
    }

    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }
}