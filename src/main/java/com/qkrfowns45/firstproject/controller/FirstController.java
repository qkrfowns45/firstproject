package com.qkrfowns45.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("first")
    public String sayHello(Model model){
        model.addAttribute("username","뉴비탑");
        model.addAttribute("page","첫번째");
        return "first";
    }

    @GetMapping("second")
    public String sayHello2(Model model){
        model.addAttribute("username","뉴비탑22");
        model.addAttribute("page","두번째");
        return "second";
    }
}
