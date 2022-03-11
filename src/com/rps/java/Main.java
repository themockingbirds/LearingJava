package com.rps.java;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r = 1, p = 2, s = 3; //where  r= rock, p=paper, s= scissor
        int round = 0;
        //System.out.println("There  will be 5 round");
        String player1, computer;
        int userScore=0 , compScore = 0, userArmor, compArmor;
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Your User Name: ");
        player1 = sc.nextLine();
        System.out.println("---------------------------------------------------------");
        System.out.println("\t\tHello, " + player1);
        System.out.println("\tWelcome to  the world of Rock  Paper & Scissor");

        System.out.println("---------------------------------------------------------\n");
        while (round <= 5) {
            round++;
            System.out.println("Round " + round + "\n------------------\n");
            System.out.println("Choose your armor -> \n  1.\trock\n  2.\tPaper\n  3.\tScissor\n");
            System.out.print("Input\t->\t");
            userArmor = sc.nextInt();
            compArmor = rnd.nextInt(2);
            compArmor += 1;
            System.out.println("Computer: "+compArmor);

            if (compArmor == 1 && userArmor == 2) {
                userScore++;
            } else if (compArmor == 2 && userArmor == 1) {
                compScore++;
            } else if (compArmor == 1 && userArmor == 3) {
                compScore++;
            } else if (compArmor == 3 && userArmor == 1) {
                compScore++;
            } else if (compArmor == 2 && userArmor == 2) {
                compScore++;
            } else {
                System.out.println("Equal Terms");
            }
            System.out.println("Current Score: \n\t"+player1+": "+userScore+"\n\tComputer: "+compScore);
        }
    }
}
