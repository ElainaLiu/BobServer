package com.bobserver.bobserver.model;
import java.util.Map;
import com.bobserver.bobserver.model.User;

import java.util.*;

public class UserGroup {
    private Map<String, User> users = new HashMap<>();
    private User currUser;

    public UserGroup(String name){
        String[] atts = {"Openness", "Conscientiousness", "Extraversion", "Agreeableness", "Emotional Range"};
        
        double[] vals1 = {85.7, 80.3, 42.2, 67.8, 24.9};
        double[] vals2 = {70.9, 20.2, 40.3, 3.2, 82.4};
        double[] vals3 = {10.5, 50.3, 80.3, 47.5, 0.5};
        
        String user1 = "JeffBezos";
        String user2 = "Tim_Cook";
        String user3 = "OSUPrezDrake";
        
        String url1 = "https://open.spotify.com/playlist/5EF18jWof9VRYaC7ss3Wte"; //Classical Jazz
        String url2 = "https://open.spotify.com/playlist/0RKi2UxVDVMrZqBA9uRSuT"; //Heavy metal
        String url3 = "https://open.spotify.com/playlist/5KMBhQon3ArWQe2vPzC8KW"; //Pop/upbeat
        
        this.users.put(user1, new User(user1, atts, vals1, url1));
        this.users.put(user2, new User(user2, atts, vals2, url2));
        this.users.put(user3, new User(user3, atts, vals3, url3));
        this.currUser = this.users.get(name);
    }

    public Map<String, User> getUsers(){
        return this.users;
    }

    public User getCurrUser(){
        return this.currUser;
    }
}