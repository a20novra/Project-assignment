package com.example.projectassignment;

public class Fishes {
    private int id;
    private String name;
    private int size;
    private int cost;
    private String location;


    public Fishes( int id, String name, int size, int cost , String location){
        this.id = id;
        this.name = name;
        this.size = size;
        this.cost = cost;
        this.location = location;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }

    public int getCost(){
        return cost;
    }

    public String getLocation(){
        return location;
    }

    @Override
    public String toString(){
        return name;
    }
}

