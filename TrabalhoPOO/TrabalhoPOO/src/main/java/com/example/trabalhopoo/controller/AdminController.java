package com.example.trabalhopoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String showAdminPage() {
        return "Admin/adm"; // Nome do arquivo admin.html
    }
}
