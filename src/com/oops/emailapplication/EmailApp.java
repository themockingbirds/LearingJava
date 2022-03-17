package com.oops.emailapplication;

import java.util.Scanner;
//https://www.youtube.com/watch?v=U3Ibvu0htNs&t=630s
//https://codegym.cc/projects/games/com.codegym.games.snake
public class EmailApp {
    public static void main(String[] args) {
        Email[] newEmp=new Email[100];
        String firstName,lastName;
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        int i=0,totalNoOfEmp=0;
        System.out.print("""
                --------------------------------------------------
                                New Employee Database
                --------------------------------------------------
                """);
        do{
            System.out.println("""
                    Press 1 - > To Generate Email For New Recruiters
                    Press 2 - > To Display All Recruiters Records
                    Press 3 - > To Exit
                    --------------------------------------------------
                    """);
            System.out.print("Input : ");
            switch(sc.nextInt()){
                case 1-> {
                    System.out.print("Input First Name and Last Name: ");
                    firstName=sc.next();
                    lastName=sc.next();
                    newEmp[i]=new Email(firstName,lastName);
                    System.out.print("""
                --------------------------------------------------
                """);

                    newEmp[i].setAlternateEmail(firstName+lastName+"@gmail.com");
                    newEmp[i].showInfo();
                    i++;
                    totalNoOfEmp=i;
                    System.out.print("""
                   --------------------------------------------------
                    """);
                }
                case 2->{

                    for(int j=0;j<totalNoOfEmp;j++){
                        newEmp[j].showInfo();
                        System.out.println("--------------------------------------------------");
                    }

                }

                case 3-> {
                    System.out.println("Exiting program...");
                    flag=false;
                }
                default -> System.out.println("Invalid Inpute, Please Enter correct value.\n__");
            }
        }while(flag);
    }
}
