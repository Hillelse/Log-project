package com.company;



import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pattern implements Serializable {

    private String name;
    private String subject;
    private String description;
    private String dateAndTime;

    public Pattern(String name, String subject, String description) {
        this.name = name;
        this.subject = subject;
        this.description = description;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        this.dateAndTime = formatter.format(date);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public void showProblem(){
        System.out.println("name: " + this.name + "\n" + "subject: " +this.subject +
                            "\n" + "description: " +  this.description + " \n" + this.dateAndTime);

    }

    public void editDescription(String description){
        setDescription(this.description);
    }

    public void editName(String name){
        setName((this.name));
    }

    public void editSubject(String subject){
        setSubject(this.subject);
    }

    @Override
    public String toString() {
       return ("name: " + this.name + "\n" + "subject: " +this.subject +
                "\n" + "description: " +  this.description + " \n" + this.dateAndTime
       + "\n" + "-------------------------");
    }
}


