package com.myown.server.test;

import java.util.Iterator;
import java.util.List;

public class Person {

    private int id;
    private String name;
    private Address address;
    private List<String> addresses;


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

    public Person(int id, String name, Address address, List<String> addresses) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.addresses = addresses;
    }

    public void display(){
        System.out.println(" id:" + id +" name:" + name);
        System.out.println(" adress:" + address.infoAddress());
        Iterator<String> iterator = addresses.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
