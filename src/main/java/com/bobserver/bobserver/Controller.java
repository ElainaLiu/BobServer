package com.bobserver.bobserver;

import com.bobserver.bobserver.model.User;
import com.bobserver.bobserver.model.UserGroup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller {
    @GetMapping("/api/intro")
    public String intro() {
        return("Welcome to Spring!");
    }

    @GetMapping("/username")
    public User usernameCall(@RequestParam(value = "username", defaultValue = "@JeffBezos") String username){
        UserGroup group = new UserGroup(username);
        return group.getCurrUser();
    }

    @GetMapping("/playlist")
    public String playlistCall(@RequestParam(value = "username", defaultValue = "@JeffBezos") String username){
        UserGroup group = new UserGroup(username);
        return group.getCurrUser().getUrl();
    }
}