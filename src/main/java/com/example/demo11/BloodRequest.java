package com.example.demo11;

import java.io.Serializable;

public class BloodRequest implements Serializable {
    static int counter;

    int id;
    private String name;
    private Contact phone;
    private int quantity;
    private BloodGroup bloodgroup;

    public BloodRequest(String name, Contact phone, int quantity, BloodGroup bloodgroup) {
        this.name = name;
        this.phone = phone;
        this.quantity = quantity;
        this.bloodgroup = bloodgroup;
        id= ++counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getPhone() {
        return phone;
    }

    public void setPhone(Contact phone) {
        this.phone = phone;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BloodGroup getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(BloodGroup bloodgroup) {
        this.bloodgroup = bloodgroup;
    }
}
