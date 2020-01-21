package com.bobserver.bobserver;

import com.bobserver.bobserver.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;

@RestController
public class Controller {
    @GetMapping("/api/intro")
    public String intro() {
        return("Welcome to Spring!");
    }

    @GetMapping("/username")
    public User usernameCall(@RequestParam(value = "username", defaultValue = "@JeffBezosOfficial") String username){
        List<String> atts = new ArrayList<>();
        List<Double> vals = new ArrayList<>();
        atts.add("Hospitable");
        atts.add("Worldly");
        atts.add("Empathetic");
        vals.add(3.5);
        vals.add(80.4);
        vals.add(1.0);
        return new User(username, atts, vals);
    }
}