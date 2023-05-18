package com.lao.javalearning.exersice;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Exercise {




    public static void mult(int j) {
        for (int x = 0; x < 5; x++) {
            System.out.println(x*j);
        }
    }


    public static String myname(){
        return "my name is hashir";
    }



    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter value");
        int id = Integer.parseInt(myObj.nextLine());  // Read user input

        for (int x = 0; x < id; x++) {
            System.out.println(x+" * "+id+ " = "+ x*id);
        }
            mult(5);
        System.out.println(myname());


        System.out.println("------------Print Triangle pattern using increment digit value mark----------");
        Scanner scanner= new Scanner(System.in);
        System.out.println("please input a number");
        int count=scanner.nextInt();
        int row=0;
        int column = 0;

        for (row=0; row<count; row++){
            for (column=0; column<=row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
