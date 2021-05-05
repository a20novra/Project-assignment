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
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSize(){
        return size;
    }

    public String getCost(){
        return cost;
    }

    public String getLocation(){
        return location;
    }

    public String getAuxdata(){
        return auxdata;
    }

    @Override
    public String toString(){
        return name;
    }
}

