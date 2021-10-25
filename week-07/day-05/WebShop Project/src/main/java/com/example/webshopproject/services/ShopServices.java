package com.example.webshopproject.services;

import com.example.webshopproject.models.ShopItem;

import java.util.*;
import java.util.stream.Collectors;

public class ShopServices {
    public final List<ShopItem> shopItemList = new ArrayList<>();

    public ShopServices() {
        shopItemList.add(new ShopItem("Running shoes", "Nike running shoes for every day running", 1000, 5, "pcs", "Clothing"));
        shopItemList.add(new ShopItem("Flying carpet", "Can be used as a carpet or a vehicle.", 100000, 0, "pcs", "Magical artifacts"));
        shopItemList.add(new ShopItem("Unicorn intestines", "Somebody will surely find a use for these some day.", 10, 6.8, "kgs", "Cosmetics"));
        shopItemList.add(new ShopItem("Tears of a virgin", "Only 5 drops a day to keep you young and beautiful forever", 5860, 20, "liters", "Cosmetics"));
        shopItemList.add(new ShopItem("T-shirt Nike", "Extra sweaty", 300, 80, "pcs", "Clothing"));
    }

    public List<ShopItem> getAll() {
        return shopItemList.stream().toList();
    }

    public List<ShopItem> onlyAvailable() {
        return shopItemList.stream().filter(x -> x.getStock() != 0).collect(Collectors.toList());
    }

    public List<ShopItem> containsNike() {
        return shopItemList.stream().filter(x -> x.getName().contains("Nike") || x.getDescription().contains("Nike")).collect(Collectors.toList());
    }

    public double countAverageStock() {
        OptionalDouble x = shopItemList.stream().mapToDouble(ShopItem::getStock).average();
        if (x.isPresent())
            return x.getAsDouble();
        else
            return 0.0;
    }

    public List<ShopItem> cheapestFirst() {
        return shopItemList.stream().sorted(Comparator.comparingDouble(ShopItem::getPrice)).collect(Collectors.toList());
    }

    public ShopItem mostExpensive() {
        return shopItemList.stream().filter(x -> x.getStock() >0 ).max(Comparator.comparingDouble(ShopItem::getPrice)).orElse(null);
    }

    public List<ShopItem> search(String text) {
        return shopItemList.stream().filter(x -> x.getName().contains(text) || x.getDescription().contains(text)).collect(Collectors.toList());
    }

    public List<ShopItem> searchType(String text) {
        return shopItemList.stream().filter(x -> x.getType().equals(text) || x.getDescription().contains(text)).collect(Collectors.toList());
    }

    public void setToEuro() {
        for (ShopItem item : shopItemList) {
            item.setPriceEUR();
            item.setCurrency("EUR");
        }
    }

    public void setToOriginalCurr() {
        for (ShopItem item : shopItemList) {
            item.setpriceOriginal();
            item.setCurrency("CZK");
        }
    }

    public List<ShopItem> exactSort(double price) {
        return shopItemList.stream().filter(x -> x.getPrice() == price).collect(Collectors.toList());
    }

    public List<ShopItem> belowSort(double price) {
        return shopItemList.stream().filter(x -> x.getPrice() < price).collect(Collectors.toList());
    }

    public List<ShopItem> aboveSort(double price) {
        return shopItemList.stream().filter(x -> x.getPrice() > price).collect(Collectors.toList());
    }
}