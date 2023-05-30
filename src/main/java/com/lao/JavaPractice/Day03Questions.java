package com.lao.JavaPractice;

import java.util.Scanner;

public class Day03Questions {
    public static void main(String[] args) {
        System.out.println("------------Count sum of Digit numbers----------");
        int number = 123589;
        int sum = 0;

        while (number>0){
            sum=sum+number%10;     //   %10 means value eka 10n beduvama ethi vena agaya
            number=number/10;
        }
        System.out.println("Sum of given digits :"+sum);

        System.out.println("------------Find the length of Given String----------");  //Youtube done

        String myName="Hashir";
        System.out.println("length is: "+myName.length());
        char[] charArray=myName.toCharArray();
        int length=0;
        for (Character character:charArray) {
            length++;
        }
        System.out.println("Verify the length :"+length);

        System.out.println("------------Print Triangle pattern using * mark----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of rows & columns");
        int count = scanner.nextInt();
        int row,column=0;

        for (row=0; row<count; row++){
            for (column=0; column<=row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("------------Print Triangle pattern using increment digit value mark----------");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter number of rows & columns");

        int startting_number = 1;
        int limit = scanner1.nextInt();
        int row1;
        int coulumn1;

        for (row1=0; row1<limit;row1++){
            for (coulumn1=0; coulumn1<=row1; coulumn1++){
                System.out.print(startting_number);
                startting_number++;
            }
            System.out.println();
        }

    }
}
