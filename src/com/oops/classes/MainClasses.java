package com.oops.classes;

public class MainClasses {
    public static void main(String[] args) {
        System.out.println("Main Class");
        Class2 obj=new Class2();
        obj.sayHii();
        System.out.println(obj.sum());
        int num=obj.sum();
        num+=1;
        System.out.println("New value of 'num' variable: "+num);
    }
}

class Class2{
    void sayHii(){
        System.out.println("Hello, I am a Class2");

    }
    int sum(){
        return 5+6;
    }
}