package com.example.demo11;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Donor extends Person implements Serializable {
    private BloodGroup bloodGroup;


    public Donor(int id, String name, int age, Address address, Contact contact, BloodGroup bloodGroup) {
        super(id, name, age, address, contact);
        this.bloodGroup = bloodGroup;

    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donor donor = (Donor) o;
        return Objects.equals(bloodGroup, donor.bloodGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bloodGroup);
    }
}
