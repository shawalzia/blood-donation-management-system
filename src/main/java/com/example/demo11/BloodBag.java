package com.example.demo11;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;


public class BloodBag implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String  bagId;
    private BloodGroup bloodGroup;
    private int quantity;
    private Date donationDate;
    private Date expiryDate;
    private boolean isAvailaible= true;

    public String getBagId() {
        return bagId;
    }

    public void setBagId(String bagId) {
        this.bagId = bagId;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup= bloodGroup;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }



    public boolean getisAvailaible() {
        return isAvailaible;
    }

    public void setisAvailaible(boolean availaible) {
        isAvailaible = availaible;
    }

    public BloodBag(String bagId, BloodGroup bloodGroup, int quantity, Date donationDate, Date expiryDate) {
        this.bagId = bagId;
        this.bloodGroup = bloodGroup;
        this.quantity = quantity;
        this.donationDate = donationDate;
        this.expiryDate = expiryDate;
        this.isAvailaible = true;
    }

    public void markAsExpired(){
        setisAvailaible(false);
        System.out.println(" this blood bag has been expired");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BloodBag bloodBag = (BloodBag) o;
        return quantity == bloodBag.quantity && isAvailaible == bloodBag.isAvailaible && Objects.equals(bagId, bloodBag.bagId) && Objects.equals(bloodGroup, bloodBag.bloodGroup) && Objects.equals(donationDate, bloodBag.donationDate) && Objects.equals(expiryDate, bloodBag.expiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bagId, bloodGroup, quantity, donationDate, expiryDate, isAvailaible);
    }
}
