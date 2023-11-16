package com.lao.JavaPractice;

import java.util.Scanner;

public class Day04Questions {
    public static void main(String[] args) {

        System.out.println("--------Find the largest number from 3 numbers----------"); //Youtube done

        Scanner sc01 =new Scanner(System.in);
        System.out.println("Enter 01 st number");
        int a = sc01.nextInt();
        System.out.println("Enter 02 nd number");
        int b = sc01.nextInt();
        System.out.println("Enter 03 rd number");
        int c = sc01.nextInt();

        if (a>b && a>c){
            System.out.println(a + ":Largest number");
        } else if (b>a && b>c) {
            System.out.println(b + ":Largest number");
        }else {
            System.out.println(c + ":Largest number");
        }

        System.out.println("--------Doing sum for 2 numbers and increase the count----------");  //Ignored

        int n1=0,n2=1,sum=0;
        System.out.print(n1+" "+n2);
        for (int i=2; i<7;i++){
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
        System.out.println();

        System.out.println("--------Check given number is prime or not----------"); //Youtube done
        int num = 4;
        int count=0;

        if (num>1)
        {
            for (int i = 1; i<=num; i++)
            {
                if (num % i == 0)
                    count++;
            }
            if (count==2)
            {
                System.out.println("prime number");
            }else
            {
                System.out.println("Not a prime number");
            }
        }else {
            System.out.println("Not a prime number");
        }



    }
}
