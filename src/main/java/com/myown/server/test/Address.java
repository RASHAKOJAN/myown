package com.myown.server.test;

public class Address {
    private String phone;
    private String email;
    private String country;
    private String city;

    public Address(String phone, String email, String country, String city) {
        this.phone = phone;
        this.email = email;
        this.country = country;
        this.city = city;
    }

    public String infoAddress(){
        return "phone: " + phone + " email:" + email + " country:" + country + " city:" + city;
    }
}
