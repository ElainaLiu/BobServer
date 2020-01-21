package com.bobserver.bobserver.model;
import java.util.Map;
import com.bobserver.bobserver.model.User;

import java.util.*;

public class UserGroup {
    private Map<String, User> users = new HashMap<>();
    private User currUser;

    public UserGroup(String name){
        String[] atts = {"Openness", "Conscientiousness", "Extraversion", "Agreeableness", "Emotional Range"};
        double[] vals1 = {40.7, 80.3, 2.2, 67.8, 34.9};
        double[] vals2 = {70.9, 60.2, 40.3, 3.2, 12.4};
        double[] vals3 = {10.5, 50.3, 20.3, 27.5, 0.5};
        this.users.put("@JeffBezos", new User("@JeffBezos", atts, vals1));
        this.users.put("@Tim_Cook", new User("@Tim_Cook", atts, vals2));
        this.users.put("@OSUPrezDrake", new User("@OSUPrezDrake", atts, vals3));
        this.currUser = this.users.get(name);
    }

    public Map<String, User> getUsers(){
        return this.users;
    }

    public User getCurrUser(){
        return this.currUser;
    }
}