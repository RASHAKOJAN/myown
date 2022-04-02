package com.myown.server.test;

public class Person {

    private int id;
    private String name;
    private Address address;


    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display(){
        System.out.println(" id:" + id +" name:" + name);
        System.out.println(" adress:" + address.infoAddress());
    }
}
