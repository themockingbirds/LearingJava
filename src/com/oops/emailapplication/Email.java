package com.oops.emailapplication;
import java.util.Scanner;

/*
Input First Name, LastName, dept
create email- fnln@dept.comp.com
set default password - randomly.
mailbox capacity
alt-email- fnln@gmail.com

 */
public class Email {
    private final String firstName;
    private final String lastName;
    private final String dept;
    private final String defaultPassword;
    private final String email;
    private String alternateEmail;
    private final int mailBoxCapacity=500;
    private final int defaultPasswordLength=15;
    //constructor to receive firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        dept=setDept();
        defaultPassword=this.randomPassword(defaultPasswordLength);
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+dept+".company.com";
    }
    //assign department of new emp
    private String setDept(){
        Scanner sc = new Scanner(System.in);

        System.out.print("""
        Department Codes - >
        --------------------------------------------
        1. For Sales         2. For Development
        3. For Accounts      0. For None
        --------------------------------------------
        Enter Your Department :\040""");
        do {
            int deptChoice = sc.nextInt();
            switch (deptChoice) {
                case 1 -> {return "Sales";}
                case 2 -> {return "Development";}
                case 3 -> {return "Accounts";}
                case 0 -> {return "None";}
                default -> System.out.println("Invalid Input, Input again");
            }
        }while(true);
    }
    //generate random password.

    private String randomPassword(int length){
        String  passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#$%^*!";
        char[] password = new char[length];
        for(int i = 0; i< length; i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return  new String(password);
    }

    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail=alternateEmail;
    }

    public void showInfo() {
        System.out.printf("""
                First Name : %s      Last Name : %s
                Department : %s
                Company New Email : %s
                Alternate Email: %s
                Default Password : %s
                Mailbox Capacity : %d
                """, firstName, lastName, dept, email,
                alternateEmail, defaultPassword, mailBoxCapacity);
    }
}
