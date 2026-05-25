package com.example.demo11;

import java.util.ArrayList;

import java.io.Serializable;

public class Recipient extends Person implements Serializable {

    public Recipient(int id, String name, int age, Address address, Contact contact) {
        super(id, name, age, address, contact);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}

