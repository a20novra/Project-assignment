package com.example.projectassignment;

public class Fishes {
    private String id;
    private String name;
    private String size;
    private String cost;
    private String location;
    private String auxdata;


    public Fishes( String id, String name, String size, String cost , String location,  String auxdata){
        this.id = id;
        this.name = name;
        this.size = size;
        this.cost = cost;
        this.location = location;
        this.auxdata = auxdata;
    }

    public String getId(){
        return id;
    }

    public String getName(String name){
        return this.name;
    }

    public String getSize(String size){
        return this.size;
    }

    public String getCost(String cost){
        return this.cost;
    }

    public String getLocation(String location){
        return this.location;
    }

    public String getAuxdata(String auxdata){
        return this.auxdata;
    }

    @Override
    public String toString(){
        return name;
    }
}

