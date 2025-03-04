package com.example.exmaplerestapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/root")
public class RootController {

    @GetMapping
    public String root() {
        return "root";
    }

}
