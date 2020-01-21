package com.bobserver.bobserver.model;
import java.util.Map;
import com.bobserver.bobserver.model.User;

import java.util.*;

public class UserGroup {
    private Map<String, User> users = new HashMap<>();
    private User currUser;

    public UserGroup(String name){
        String[] atts = {"Friendly", "Worldy", "Empathetic"};
        double[] vals1 = {40.7, 80.3, 2.2};
        double[] vals2 = {70.9, 60.2, 40.3};
        double[] vals3 = {10.5, 50.3, 20.3};
        this.users.put("@JeffBezosOfficial", new User("@JeffBezos", atts, vals1));
        this.users.put("@TimApple", new User("@TimApple", atts, vals2));
        this.users.put("@PresDrake", new User("@PresDrake", atts, vals3));
        this.currUser = this.users.get(name);
    }

    public Map<String, User> getUsers(){
        return this.users;
    }

    public User getCurrUser(){
        return this.currUser;
    }
}