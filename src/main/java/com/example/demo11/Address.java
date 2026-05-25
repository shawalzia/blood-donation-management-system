package com.example.demo11;

import java.io.Serializable;

public class Address implements Serializable {

    private String city;
    private String country;


    public Address( String city, String country) {

        setCity(city);
        setCountry(country);

    }


    public void setCity(String city) {
        if(city!=null) {
            this.city = city;
        }else{
            System.out.println("Invalid city");
        }
    }

    public void setCountry(String country) {
        if(country!=null) {
            this.country = country;
        } else {
            System.out.println("Invalid Country");
        }
    }




    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }


}

