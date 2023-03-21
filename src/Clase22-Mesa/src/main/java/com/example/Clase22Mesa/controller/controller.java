package com.example.Clase22Mesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    @GetMapping("/index")
    public String welcome(Model model) {
        model.addAttribute("nombre", "pim pam pum");
        return "index";
    }
}
