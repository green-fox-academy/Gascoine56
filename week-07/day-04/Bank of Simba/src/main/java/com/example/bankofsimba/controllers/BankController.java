package com.example.bankofsimba.controllers;

import com.example.bankofsimba.models.BankAccount;
import com.example.bankofsimba.models.Moral;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class BankController {
    public static List<BankAccount> accounts = createAccounts();

    public static List<BankAccount> createAccounts(){
        List<BankAccount> acc = new ArrayList<>();
       acc.add(new BankAccount("Simba", 2000, "Lion", Moral.GOOD));
        acc.add(new BankAccount("Zazu", 20000, "Bird", Moral.QUESTIONABLE));
        acc.add(new BankAccount("Rafiki", 1000000, "Monkey", Moral.GOOD));
        acc.add(new BankAccount("Shenzi", 50, "Hyena", Moral.BAD));
        acc.add(new BankAccount("Scar", 50000, "Lion", Moral.BAD));
        return acc;
    }



    @GetMapping("/show")
    public String showBalance(Model model) {
        BankAccount acc = new BankAccount("Simba", 2000, "Lion", Moral.GOOD);
        model.addAttribute("account", acc);
        return "show";
    }

    @GetMapping("/inception")
    public String inception() {
        return "inception";
    }

    @GetMapping("/showAll")
    public String showAll(Model model) {

        model.addAttribute("accounts", accounts);
        model.addAttribute("morals", Moral.values());

        return "allaccounts";
    }

    @PostMapping("/showAll/{name}")
    public String addMoney(@PathVariable String name) {
        for (BankAccount a : accounts) {
            if (a.getName().equals(name) && name.equals("Simba")) {
                a.setBalance(100);
                return "redirect:/showAll";
            } else if (a.getName().equals(name)) {
                a.setBalance(10);
                return "redirect:/showAll";
            }
        }
        return "redirect:/showAll";
    }
    @PostMapping("/addAccount")
    public String addAccount(@ModelAttribute BankAccount account){
        accounts.add(account);
        return "redirect:/showAll";
    }
}