package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Skill {
    private String[] skills ;
   private ArrayList <String> skill = new ArrayList<>();
   HashMap<String,String> skillValue = new HashMap<>();

    public HashMap<String, String> getSkillValue() {
        return skillValue;
    }

    public void setSkillValue(HashMap<String, String> skillValue) {
        this.skillValue = skillValue;
    }

    public void setSkills(ArrayList<String> skill){
        for (int i=0; i<skill.size();i++){
            this.skill.add(skill.get(i));
        }

    }

    public ArrayList<String> getSkills() {
        return skill;
    }

}
