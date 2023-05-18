package com.lao.javalearning.scanner;

import java.util.Scanner;

public class ScanExm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number and second number");
        int firstnum = scanner.nextInt();
        int secondnum = scanner.nextInt();
        System.out.println("1) ekathu karanna");
        System.out.println("2) adu karanna");
        System.out.println("3) bedanna karanna");
        System.out.println("4) vedi karanna");
        int input = scanner.nextInt();

        if(input==1){
            System.out.println(firstnum + secondnum);
        } else if (input==2) {
            System.out.println(firstnum - secondnum);
        }else if (input==3) {
            System.out.println(firstnum / secondnum);
        }
        else if (input==3) {
            System.out.println(firstnum / secondnum);
        }else if (input==4) {
            System.out.println(firstnum + " * "+ secondnum + " = " +firstnum * secondnum);
        }

    }

}
