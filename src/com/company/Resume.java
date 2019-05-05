package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Resume {
    private String name;
    private String email;
    private String phoneNo;
    Education education = new Education();
    ArrayList<Education> educationArrayList= new ArrayList<>();
    Skill skill = new Skill();
    Experiences experiences = new Experiences();

    public Resume() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }


}
