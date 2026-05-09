package com.example.laboratorio2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/s")
    public String srp(){
        return "srp";
    }

    @GetMapping("/o")
    public String ocp(){
        return "ocp";
    }

    @GetMapping("/l")
    public String lsp(){
        return "lsp";
    }

    @GetMapping("/i")
    public String isp(){
        return "isp";
    }

    @GetMapping("/d")
    public String dip(){
        return "dip";
    }

}
