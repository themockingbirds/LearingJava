package com.oops.emailapplication;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Email {
   private String firstName,lastName,dept,password,email,alternateEmail;
   private int mailBoxCapacity=500;
   private int defaultPasswordLength=10;

   //constructor to receive firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

       // System.out.println("Email Created\n"+this.firstName+" "+this.lastName);

        this.dept=setDept();
        //System.out.println("Department: "+this.dept);

        this.password=this.randomPassword(defaultPasswordLength);
        //System.out.println("Password: "+this.password);

        //set email-> firstname.lastname@department.company.com
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+this.dept+".company.com";
        //System.out.println("Email: "+email);

        this.showInfo();
    }

    //generate random password.
    private String randomPassword(int length){
        String  passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$%^*!";
        char[] password = new char[length];
        for(int i = 0; i< length; i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }

    private String setDept(){
        System.out.print("""
        Department Codes- >
        -----------------------------
        1 For Sales
        2 For Development
        3 For Accounts
        0 For None
        -----------------------------
        Enter Your Department :\040""");
        boolean flag=false;
        do {
            Scanner sc = new Scanner(System.in);
            int deptChoice = sc.nextInt();
            switch (deptChoice) {
                case 1 -> {
                    return "Sales";
                }
                case 2 -> {

                    return "Development";
                }
                case 3 -> {

                    return "Accounts";
                }
                case 0 -> {

                    return "None";
                }
                default -> {
                    System.out.println("Invalid Input, Input again");
                    flag=true;
                }
            }
        }while(flag);
        return null;
    }
    //set the mailbox capacity
    public void  setMailBoxCapacity(int capacity){
        this.mailBoxCapacity=capacity;
    }

    //set alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail=alternateEmail;
    }
    //change the password
    public void changePassword(String password){
        this.password=password;
    }

    public String getAlternateEmail() { return alternateEmail; }
    public int getMailBoxCapacity() { return mailBoxCapacity; }
    public String getPassword() { return password; }

    public void showInfo(){
        System.out.printf("""
                First Name : %s      Last Name : %s
                Department : %s
                Company New Email : %s
                """,this.firstName,this.lastName,this.dept,this.email);
        System.out.printf("""
                Alternate Email: %s
                Default Password : %s
                Mailbox Capacity : %d
                """,this.alternateEmail,this.password,this.mailBoxCapacity,this.getPassword());
    }
}
