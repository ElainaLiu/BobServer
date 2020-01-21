package com.bobserver.bobserver.model;
import java.util.Map;

import java.util.*;

public class User {

    private String username;
    private HashMap<String, Double> attributes;
    private String[] attributeNames;
    private double[] attributeVals;

    public User(String name, String[] attributeNames, double[] attributeVals){
        this.username = name;
        this.attributes = new HashMap<>();
        for(int i = 0; i < attributeNames.length; i++){
            this.attributes.put(attributeNames[i], attributeVals[i]);
        }
        this.attributeNames = attributeNames;
        this.attributeVals = attributeVals;
    }

    public String getUsername(){
        return this.username;
    }

    public Map<String, Double> getAttributeMap(){
        return this.attributes;
    }

    public String[] getAttributes(){
        return this.attributeNames;
    }

    public double[] getVals(){
        return this.attributeVals;
    }
}