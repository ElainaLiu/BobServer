package com.bobserver.bobserver.model;
import java.util.Map;

import java.util.*;

public class User {

    private String username;
    private HashMap<String, Double> attributes;
    private String playlistUrl;

    public User(String name, String[] attributeNames, double[] attributeVals, String url){
        this.username = name;
        this.attributes = new HashMap<>();
        for(int i = 0; i < attributeNames.length; i++){
            this.attributes.put(attributeNames[i], attributeVals[i]);
        }
        this.playlistUrl = url;
    }

    public String getUsername(){
        return this.username;
    }

    public Map<String, Double> getAttributeMap(){
        return this.attributes;
    }

    public String getUrl(){
        return this.playlistUrl;
    }
}