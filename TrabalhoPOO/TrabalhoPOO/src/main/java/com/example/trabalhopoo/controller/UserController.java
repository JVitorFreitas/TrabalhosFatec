package com.example.trabalhopoo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/usuario")
    public String showUserPage() {
        return "Usuario/usuario"; // Nome do arquivo user.html
    }
}
