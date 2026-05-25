package com.example.demo11;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.HashMap;

public class  Admin {

    //    admin:
    private static final String adminUsername = "admin";
    private static final String Password = "12345678";

    private Admin(){

    }

    public static boolean returnAdminObject(String username,String password) throws WrongCredentialsException {
        if(username.equals(adminUsername) && password.equals(Password))
            return true;
        else
            throw new WrongCredentialsException("Wrong Credentials");
    }



}