package com.myown.server.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

    private int id;
    private String name;
    private Address address;
    private List<String> addresses;
    private Map<String, String> description;


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

    public Person(int id, String name, Address address, List<String> addresses, Map<String, String> description) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.addresses = addresses;
        this.description = description;
    }

    public Person(int id, String name, Address address, List<String> addresses, Map<String, String> description, Address address1) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.addresses = addresses;
        this.description = description;
        this.address = address1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getDescription() {
        return description;
    }

    public void setDescription(Map<String, String> description) {
        this.description = description;
    }

    public void display(){
        System.out.println(" id:" + id +" name:" + name);
        System.out.println(" adress:" + address.infoAddress());
        Iterator<String> iterator = addresses.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<Map.Entry<String, String>> entrySet = description.entrySet();
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(" key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }

    public void show(){
        System.out.println(" id:" + id +" name:" + name);
        System.out.println(" adress:" + address.infoAddress());
        Iterator<String> iterator = addresses.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<Map.Entry<String, String>> entrySet = description.entrySet();
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(" key: " + entry.getKey() + " value: " + entry.getValue());
        }
        System.out.println(" adress:" + address.infoAddress());
    }

    public void active() {
        System.out.println(" id:" + id + " name:" + name);
    }
}
