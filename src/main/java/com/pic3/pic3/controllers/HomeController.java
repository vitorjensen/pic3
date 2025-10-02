package com.pic3.pic3.controllers;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "Dashboard");
        return "pages/index"; // sem .html
    }
}
