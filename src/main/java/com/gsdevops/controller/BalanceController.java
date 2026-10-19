package com.gsdevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalances")
    public String getBalanceDetails() {
               return "Here are balance details from the DB";
    }
}
