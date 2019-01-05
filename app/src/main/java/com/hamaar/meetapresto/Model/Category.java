package com.hamaar.meetapresto.Model;

public class Category {

    //generate getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //generate constructor
    public Category(int id, String cat) {
        this.id = id;
        this.cat = cat;
    }

    private int id;
    private String cat;
}
