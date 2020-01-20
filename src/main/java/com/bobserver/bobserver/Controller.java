package com.bobserver.bobserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/api/intro")
    public String intro() {
        return("Welcome to Spring!");
    }
}