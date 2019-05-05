package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Resume resume= new Resume();
      ArrayList<String> skill = new ArrayList<>();
      ArrayList<String> education = new ArrayList<>();// input for seteducation
      //ArrayList<Resume> resumeArrayList = new ArrayList<>();
      ArrayList<String> university = new ArrayList<>();
      ArrayList<String> yearList = new ArrayList<>();
      ArrayList<String> experiences = new ArrayList<>();
      ArrayList<String> company = new ArrayList<>();
      ArrayList <String> title = new ArrayList<>();
      ArrayList <String> date = new ArrayList<>();
      ArrayList<String> endDate = new ArrayList<>();
      ArrayList <String> description = new ArrayList<>();
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
              while (done==true) { // education list
                  System.out.println("enter education");
                  String edu = scanner.nextLine();


                  System.out.println("enter the university ");
                  String unvirsty = scanner.nextLine();
                  System.out.println("enter graduation year");
                  String year = scanner.nextLine();

                  education.add(edu);
                  university.add(unvirsty);
                  yearList.add(year);
                  System.out.println(" do you have more education if you have press any key else  -1");
                  String test = scanner.nextLine();
                  if (test.equalsIgnoreCase("-1"))
                      break;



              }
        while (done==true) {
                  System.out.println(" enter your experiences title ");

                  String title1 =scanner.nextLine();


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
            System.out.println(" do you have any more experiences if you don't have press -1");
            String test = scanner.nextLine();
            if (test.equalsIgnoreCase("-1"))
                break;


              }

        while(done==true) {

            System.out.println("enter your skill if you have any when you done push -1");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("-1"))
                break;


            skill.add(input);
        }

        System.out.println(resume.getName()+"\n"+ resume.getEmail()+"\n"+resume.getPhoneNo()+"\n");

        // setter  and getter for skill the input come from while loop  for education list ;

        resume.education.setEducation(education);
        resume.education.setUniveristy(university);
        resume.education.setYear(yearList);


            for (int i = 0; i < resume.education.getEducation().size(); i++) {
                if(i==0) {
                    System.out.println("Education\n"+resume.education.getEducation().get(i) + "\n" + resume.education.getUniveristy().get(i) + ", "
                            + resume.education.getYear().get(i) + "\n");
                }
                else
                    System.out.println(resume.education.getEducation().get(i) + "\n" + resume.education.getUniveristy().get(i) + ", "
                            + resume.education.getYear().get(i) + "\n");



        }
        // set and print out the experience

        resume.experiences.setTitle(title);
        resume.experiences.setCompany(company);
        resume.experiences.setDate(date);
        resume.experiences.setDescription(description);
        resume.experiences.setEndDate(endDate);

        for(int i=0 ; i<resume.experiences.getTitle().size();i++){
            if(i==0) {
                System.out.println("Experiences\n"+resume.experiences.getTitle().get(i) + "\n" + resume.experiences.getCompany().get(i) + ", "
                        + resume.experiences.getDate().get(i) +" - "+ resume.experiences.getEndDate().get(i)+
                        "\n" +" - Duty " +resume.experiences.getDescription().get(i) + "\n");
            }
            else
                System.out.println(resume.experiences.getTitle().get(i) + "\n" + resume.experiences.getCompany().get(i) + ", "
                        + resume.experiences.getDate().get(i)+" - "+ resume.experiences.getEndDate().get(i) + "\n" + "- Duty  " +resume.experiences.getDescription().get(i) + "\n");

        }

        // setter  and getter for skill the input come from while loop
        resume.skill.setSkills(skill);
        for (int i= 0;i<resume.skill.getSkills().size();i++ ){
            System.out.println(resume.skill.getSkills().get(i));
        }





    }
}
