package com.lao.JavaPractice;

import java.util.Scanner;

public class Day01Questions {

    public static void main(String[] args) {
        //01) Swapping two numbers
        System.out.println("-----------------Swapping two numbers--------------------"); //Youtube done
        int a=10,b=50;

        System.out.println("Before Swapping :"+a+","+b);

        //Method 01
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println("After Swapping 01 :"+a+","+b);

        //Method 02
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("After Swapping 02 :"+a+","+b);

        //Method 03
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After Swapping 03 :"+a+","+b);

        System.out.println("----------------Reverse a Integer Value---------------------"); //Youtube done

        //02) Reverse a number Method 01
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        int num = sc.nextInt();

        int rev=0;
        while (num != 0){
            rev=rev*10 + num%10;  //0 + 4=4
            num=num/10;
        }
        System.out.println("After rev :"+rev);

        //Method 02 to Reverse
//        StringBuffer stringBuffer=new StringBuffer(String.valueOf(num));
//        System.out.println(stringBuffer.reverse());

    }
}
