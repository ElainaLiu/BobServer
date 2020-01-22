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
        
        String user1 = "@JeffBezos";
        String user2 = "@Tim_Cook";
        String user3 = "@OSUPrezDrake";
        
        String url1 = "https://open.spotify.com/playlist/5aGXIuWyYg15pUlcRgvRmo?si=FgyUo_FeTaOBxiw0zg2kfQ"; //Classical Jazz
        String url2 = "https://open.spotify.com/playlist/27gN69ebwiJRtXEboL12Ih?si=9OYHOUmiS_mp2YPDE8lTmA"; //Heavy metal
        String url3 = "https://open.spotify.com/playlist/08DYV5GhZ92P5YaJkLG2bw?si=bAyGA8llShuSszv5VPew1Q"; //Pop/upbeat
        
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