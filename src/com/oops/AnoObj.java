package com.oops;

public class AnoObj {
    int i;
//int i=7;
    public AnoObj(){
        //i=10;
    }
    public AnoObj(int i) {
        this.i = i;
    }



    public static void main(String[] args) {
        new AnoObj(5).show();
        new AnoObj().show();
        new AnoObj().i=1;
        new AnoObj().show();

    }
    void show(){
        System.out.println("i: "+i );
    }
}
