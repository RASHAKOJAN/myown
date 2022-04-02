package com.myown.server.model;

public class Person {

    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println(" id:" + id +" name:" + name);
    }
}
