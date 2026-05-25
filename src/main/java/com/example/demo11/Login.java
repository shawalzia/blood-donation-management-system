package com.example.demo11;


import java.io.Serializable;

public class Login implements Serializable {
    private String Name;
    private String UserName;
    private String password;

    private String password2;
    private  String gender;
    private  int age;

    public Login(String name, String userName, String password, String password2, String gender, int age) {
        Name = name;
        UserName = userName;
        this.password = password;
        this.password2 = password2;
        this.gender = gender;
        this.age = age;
    }

    public String getPassword2() {
        return password2;
    }

    public String getName() {
        return Name;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
