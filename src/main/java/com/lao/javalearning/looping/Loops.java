package com.lao.javalearning.looping;

public class Loops {

    public static void main(String[] args) {

        //for loop
        for (int time=0;time <3; time++ ) {
            System.out.println("For loop test");
        }

        //while loop
        int times=0;
        while(times<10){
            System.out.println("While loop test");
            times++;
        }

        //do while loop
        int times_new= 0;
        do{
            System.out.println("Do while");
            times_new++;
        }while (times_new<2);

    }
}
