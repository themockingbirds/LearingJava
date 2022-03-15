package com.oops;

import java.util.Scanner;

public class GetterSetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArithmeticOperation ao=new ArithmeticOperation();
        System.out.print("Input num1 : ");
        ao.setNum1(sc.nextInt());
        System.out.print("Input num1 : ");
        ao.setNum2(sc.nextInt());

        int sum=ao.getNum1()+ ao.getNum2();
        int sub=ao.getNum1()-ao.getNum2();
        int pro=ao.getNum1()*ao.getNum2();
        int quo=ao.getNum1()/ao.getNum2();
        int rem=ao.getNum1()%ao.getNum2();
        System.out.println("--Basic Mathematics Operations--");
        System.out.printf("""
               sum: %d      sub: %d
               
               div: %d(quo) %d(rem) 
               
               pro: %d
                """,sum,sub,quo,rem,pro);
    }
}

class ArithmeticOperation {
    int num1,num2;

    public int getNum1() { //getter for num1
        return num1;
    }

    public void setNum1(int num1) { //setter for num1
        this.num1 = num1;
    }

    public int getNum2() { //getter for num2
        return num2;
    }

    public void setNum2(int num2) { //setter for num2
        this.num2 = num2;
    }
}
