package com.bobserver.bobserver.model;
import java.util.Map;

import java.util.*;

public class User {

    private String username;
    private Map<String, Double> attributes;
    private List<String> atts;
    private List<Double> vals;

    public User(String name, List<String> attributeNames, List<Double> attributeVals){
        this.username = name;
        /*this.attributes = HashMap<>();
        for(int i = 0; i < attributeNames.size(); i++){
            this.attributes.put(attributeNames.get(i), attributeVals.get(i));
        }*/
        this.atts = attributeNames;
        this.vals = attributeVals;
        return;
    }

    public String getUsername(){
        return this.username;
    }

    public Map<String, Double> getAttributeMap(){
        return this.attributes;
    }

    public List<String> getAttributes(){
        return this.atts;
    }

    public List<Double> getVals(){
        return this.vals;
    }
}