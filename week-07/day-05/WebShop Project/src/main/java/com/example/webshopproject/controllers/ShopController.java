package com.example.webshopproject.controllers;

import com.example.webshopproject.services.ShopServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ShopController {

    private final ShopServices shop;

    public ShopController() {
        this.shop = new ShopServices();
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("shopItems", shop.getAll());
        return "index";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("shopItems", shop.onlyAvailable());
        return "index";
    }

    @GetMapping("/containsNike")
    public String containsNike(Model model) {
        model.addAttribute("shopItems", shop.containsNike());
        return "index";
    }

    @GetMapping("/averageStock")
    public String averageStock(Model model) {
        model.addAttribute("average", shop.countAverageStock());
        return "averagestock";
    }

    @GetMapping("/cheapestFirst")
    public String cheapestFirst(Model model) {
        model.addAttribute("shopItems", shop.cheapestFirst());
        return "index";
    }

    @GetMapping("/mostExpensive")
    public String mostExpensive(Model model) {
        model.addAttribute("shopItems", shop.mostExpensive());
        return "index";
    }

    @PostMapping("/search")
    public String search(@RequestParam(value = "search") String search, Model model) {
        model.addAttribute("shopItems", shop.search(search));
        return "index";
    }

    @GetMapping("/more")
    public String more(Model model) {
        model.addAttribute("shopItems", shop.getAll());
        return "more";
    }

    @GetMapping("/clothing")
    public String clothing(Model model) {
        model.addAttribute("shopItems", shop.searchType("Clothing"));
        return "more";
    }

    @GetMapping("/magical")
    public String magical(Model model) {
        model.addAttribute("shopItems", shop.searchType("Magical artifacts"));
        return "more";
    }

    @GetMapping("/cosmetics")
    public String cosmetics(Model model) {
        model.addAttribute("shopItems", shop.searchType("Delicacies"));
        return "more";
    }

    @GetMapping("/euro")
    public String euro(Model model) {
        shop.setToEuro();
        model.addAttribute("shopItems", shop.getAll());
        return "more";
    }

    @GetMapping("/original-currency")
    public String originalCurr(Model model) {
        shop.setToOriginalCurr();
        model.addAttribute("shopItems", shop.getAll());
        return "more";
    }

    @GetMapping("/byprice")
    public String sortByPrice(@RequestParam(value = "price") double price, @RequestParam(value = "sort") String sort, Model model) {
        if (sort.equals("exact")) {
            model.addAttribute("shopItems", shop.exactSort(price));
            return "more";
        } else if (sort.equals("below")) {
            model.addAttribute("shopItems", shop.belowSort(price));
            return "more";
        } else {
            model.addAttribute("shopItems", shop.aboveSort(price));
            return "more";
        }
    }
}