package com.example.pfe.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AdminController {
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}
