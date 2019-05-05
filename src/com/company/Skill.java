package com.company;

import java.util.ArrayList;

public class Skill {
    private String[] skills ;
   private ArrayList <String> skill = new ArrayList<>();

    public void setSkills(ArrayList<String> skill){
        for (int i=0; i<skill.size();i++){
            this.skill.add(skill.get(i));
        }

    }

    public ArrayList<String> getSkills() {
        return skill;
    }

}
