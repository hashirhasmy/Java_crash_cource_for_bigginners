package com.lao.JavaPractice;

public class interview {
    public static void main(String[] args) {
        int count = 5;

        for (int i = 0; i<count; i++){
            for(int j = 5; j>i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k<i*2-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("<<<<<<<<<<<,To clerify true false statment >>>>>>>>>");

        if (age(30)){
            System.out.println("clerify true false statement 1 :" + age(15));
        }else {
            System.out.println(age(30));
        }


    }

    public static boolean age(int c){
        if(c>=10 && c<=20){
            return true;
        }else {
            return false;
        }
    }



}
