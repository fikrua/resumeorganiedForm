package com.company;

import java.util.ArrayList;

public class Experiences {
    private ArrayList<String> experiences = new ArrayList();
    private ArrayList<String> company = new ArrayList<>();
    private ArrayList <String> title = new ArrayList<>();
    private ArrayList <String> date = new ArrayList<>();
    private ArrayList <String> description = new ArrayList<>();
    private ArrayList<String> endDate = new ArrayList<>();

    public ArrayList<String> getEndDate() {
        return endDate;
    }

    public void setEndDate(ArrayList<String> endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String> getExperiences() {
        return experiences;
    }

    public void setExperiences(ArrayList<String> experiences) {
        this.experiences = experiences;
    }

    public ArrayList<String> getCompany() {
        return company;
    }

    public void setCompany(ArrayList<String> company) {
        this.company = company;
    }

    public ArrayList<String> getTitle() {
        return title;
    }

    public void setTitle(ArrayList<String> title) {
        this.title = title;
    }

    public ArrayList<String> getDate() {
        return date;
    }

    public void setDate(ArrayList<String> date) {
        this.date = date;
    }

    public ArrayList<String> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<String> description) {
        this.description = description;
    }
}
