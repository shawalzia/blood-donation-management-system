package com.example.demo11;

import java.io.Serializable;
import java.util.Scanner;

import java.io.Serializable;
import java.util.Scanner;

public class Contact implements Serializable {

    private String phoneNo;
    private String email;

    public Contact(String phoneNo, String email) {
        setPhoneNo(phoneNo);
        setEmail(email);
    }
    public Contact(String phoneNo ){
        setPhoneNo(phoneNo);
    }
    public void setEmail(String email) {
        if(email!=null){
            this.email = email;
        }else{
            System.out.println("Invalid email address");
        }
    }
    public void setPhoneNo(String phoneNo) {
        Scanner str = new Scanner(System.in);
        boolean valid = false;
        //phoneNo.matches fx will check that are numbers
        // are digits from 0-9 and the length is 11.
        // EISHA AHMADDD
        do {
            if(phoneNo!=null && phoneNo.matches("\\d{11}")){
                this.phoneNo = phoneNo;
                valid = true;
            }else{
                System.out.println("Invalid phone Number, Enter again:");
                phoneNo = str.nextLine();

            }

        }while(!valid);
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }
}
