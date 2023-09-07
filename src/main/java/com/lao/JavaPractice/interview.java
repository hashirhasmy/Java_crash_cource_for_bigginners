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
    }
}
