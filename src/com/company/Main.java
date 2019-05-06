package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Resume> resumeArrayList = new ArrayList<>();
        boolean bigloop = true;
        while (bigloop==true) {
            Resume resume = new Resume();
            ArrayList<String> skill = new ArrayList<>();
            ArrayList<String> education = new ArrayList<>();// input for seteducation
            HashMap<String,String> skillValue = new HashMap<>();

            ArrayList<String> university = new ArrayList<>();
            ArrayList<String> yearList = new ArrayList<>();
            ArrayList<String> experiences = new ArrayList<>();
            ArrayList<String> company = new ArrayList<>();
            ArrayList<String> title = new ArrayList<>();
            ArrayList<String> date = new ArrayList<>();
            ArrayList<String> endDate = new ArrayList<>();
            ArrayList<String> description = new ArrayList<>();
            boolean done = true;
            System.out.println(" enter your name ");
            String name = scanner.nextLine();
            System.out.println("enter Email");
            String email = scanner.nextLine();
            System.out.println("enter phone number");
            String phoneNo = scanner.nextLine();

            resume.setName(name);
            resume.setEmail(email);
            resume.setPhoneNo(phoneNo);


            // loop that accept education if there is any
            while (done == true) { // education list
                System.out.println("enter education enter -1 if you dont have any ");
                String edu = scanner.nextLine();
                if (edu.equalsIgnoreCase("-1"))
                    break;


                System.out.println("enter the university ");
                String unvirsty = scanner.nextLine();
                System.out.println("enter graduation year");
                String year = scanner.nextLine();

                education.add(edu);
                university.add(unvirsty);
                yearList.add(year);
                System.out.println(" ");


            }
            do {
                System.out.println("do you have any Experiences if you don't enter  -1\n enter yur title ");

                String title1 = scanner.nextLine();

                if (title1.equalsIgnoreCase("-1"))
                    break;

                System.out.println("enter the company ");
                String companys = scanner.nextLine();

                System.out.println("enter start date ");

                String dates = scanner.nextLine();
                System.out.println("enter end date");
                String endDats = scanner.nextLine();
                System.out.println("enter description ");
                String desc = scanner.nextLine();

                company.add(companys);
                title.add(title1);
                date.add(dates);
                endDate.add(endDats);
                description.add(desc);

            } while (done == true);

            while (done == true) {

                System.out.println("enter your skill if you have any when you done push -1");

                // each with a Competency Proficiency rating (Fundamental, Novice, Intermediate, Advanced, Expert)
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("-1"))
                    break;
                System.out.println(" enter Competency Proficiency rating (Fundamental, Novice, Intermediate, Advanced, Expert)");
                String rating = scanner.nextLine();

                skillValue.put(input,rating);



            }
            System.out.println(" do you have another resume if you push any key else press -1 ");
            String scn = scanner.nextLine();
            resumeArrayList.add(resume);
            resume.education.setEducation(education);
            resume.education.setUniveristy(university);
            resume.education.setYear(yearList);
            resume.experiences.setTitle(title);
            resume .experiences.setCompany(company);
            resume.experiences.setDate(date);
            resume.experiences.setDescription(description);
            resume.experiences.setEndDate(endDate);
            resume.skill.setSkillValue(skillValue);
            if (scn.equalsIgnoreCase("-1"))
                break;
        }
        for (Resume r:resumeArrayList ) {

            System.out.println(r.getName() + "\n" + r.getEmail() + "\n" + r.getPhoneNo() + "\n");

            // setter  and getter for skill the input come from while loop  for education list ;




            for (int i = 0; i < r.education.getEducation().size(); i++) {
                if (i == 0) {
                    System.out.println("Education\n" + r.education.getEducation().get(i) + "\n" + r.education.getUniveristy().get(i) + ", "
                            + r.education.getYear().get(i) + "\n");
                } else
                    System.out.println(r.education.getEducation().get(i) + "\n" + r.education.getUniveristy().get(i) + ", "
                            + r.education.getYear().get(i) + "\n");


            }
            // set and print out the experience



            for (int i = 0; i < r.experiences.getTitle().size(); i++) {
                if (i == 0) {
                    System.out.println("Experiences\n" + r.experiences.getTitle().get(i) + "\n" + r.experiences.getCompany().get(i) + ", "
                            + r.experiences.getDate().get(i) + " - " + r.experiences.getEndDate().get(i) +
                            "\n" + " - Duty " + r.experiences.getDescription().get(i) + "\n");
                } else
                    System.out.println(r.experiences.getTitle().get(i) + "\n" + r.experiences.getCompany().get(i) + ", "
                            + r.experiences.getDate().get(i) + " - " + r.experiences.getEndDate().get(i) + "\n" + "- Duty " + r.experiences.getDescription().get(i) + "\n");

            }


                if(r.skill.getSkillValue().size()>0)
                    System.out.println("Skill");
                Set set = r.skill.getSkillValue().entrySet();

                Iterator i = set.iterator();

                while(i.hasNext()) {

                    Map.Entry me = (Map.Entry)i.next();
                    System.out.print(me.getKey() + " : ");
                    System.out.println(me.getValue());
                }


        }





    }
}
