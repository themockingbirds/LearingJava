package com.oops.schoolmgmtsys;


public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid = 0;
    private int feesTotal = 30000;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(this.feesPaid);
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getFeesPaid() {
        return this.feesPaid;
    }

    public int getFeesTotal() {
        return this.feesTotal;
    }

    public int getRemainingFees() {
        return this.feesTotal - this.feesPaid;
    }

    public String toString() {
        return "Student's name :" + this.name + " Total fees paid so far $" + this.feesPaid;
    }
}
