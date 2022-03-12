package com.basic.rock_paper_scissor;

import java.util.Random;
import java.util.Scanner;

public class RPS_v1 {
    public static void main(String[] args) {
        int round = 1,i=0;
        String player1;
        int userScore=0 , compScore = 0, userArmor, compArmor;
        int[] userS =new int[3];
        int[] oopS =new int[3];
        Random rnd = new Random(); //to generate random numbers

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Your User Name: ");
        player1 = sc.nextLine();
        //Welcome Screen--
        hLine();
        System.out.printf("%21s, %s\n","Hello",player1);
        System.out.printf("%50s","Welcome to  the world of Rock  Paper & Scissor\n");
        hLine();
        //Games Start
        while (round <=3) {
            System.out.printf("%25s -> %s\n","Round",round); hLine();
            System.out.println("Choose your armor -> \n\t0.-> rock\t1.-> Paper\t2.-> Scissor");

            //User Input---
            do{
                System.out.print("Input\t->\t");
                userArmor = sc.nextInt();
                if(userArmor==0 ||userArmor==1||userArmor==2)
                    break;
                else
                    System.out.println("!!Please Input 0 For Rock,1 For Paper & 2 For Scissor!! \t");
            }while(true);

            switch (userArmor) {
                case 0 -> System.out.println(player1 +" : "+userArmor+" -> Rock");
                case 1 -> System.out.println(player1 +" : "+userArmor+" -> Paper");
                case 2 -> System.out.println(player1 +" : "+userArmor+" -> Scissor");
                default -> System.out.println("INVALID");
            }

            //Computer Input
            compArmor = rnd.nextInt(3);
            switch (compArmor) {
                case 0 -> System.out.println("Computer : "+compArmor+" -> Rock");
                case 1 -> System.out.println("Computer : "+compArmor+" -> Paper");
                case 2 -> System.out.println("Computer : "+compArmor+" -> Scissor");
            }
            if(userArmor==compArmor){
                System.out.println("Oops, It's a tie");
            }else if((userArmor==0 && compArmor==2) || (userArmor==2)&&(compArmor==1) || (userArmor==1 && compArmor==0)){
                userScore++;
                userS[i]++;
            }else{
                compScore++;
                oopS[i]++;
            }
            //Score Boards
            System.out.println("Round "+round+" Scores: \n\t"+player1+": "+userScore+"\tComputer: "+compScore);
            hLine();
            round++;
            i++;
        }
        //Score Board

        System.out.printf("%30s\n","Score Board");
        i=0;
        for(round=1;round<=3;round++){
            System.out.println("Round "+round+" Score ->");
            System.out.println(player1+" : "+userS[i]+"\t Computer : "+oopS[i]);
            System.out.println();
            i++;
        }

        hLine();
        if(compScore<userScore){
            System.out.printf("%10s Congrats !! ~"+player1+" WIN~ !!","");

        }else if (compScore>userScore){
            System.out.printf("%10sCongrats !! ~Computer"+" WIN~ !!","");
        }else{
            System.out.printf("%25s!! You Both Are Very Tough !!","");
        }
    }
    static void hLine(){
        for(int i=0;i<=50;i++)
            System.out.print("-");
        System.out.println();
    }
}


