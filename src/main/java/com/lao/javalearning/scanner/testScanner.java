package com.lao.javalearning.scanner;

import java.util.Scanner;

public class testScanner {

    static int num = 5;

    static testScanner obj01;
    public static void main(String[] args) {


        //obj01.num = 87;
        System.out.println(num);
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username , id, Salarry");
        String userName = myObj.nextLine();  // Read user input
        int id = myObj.nextInt();  // Read user input
        Double salary = myObj.nextDouble();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        System.out.println("id is: " + id);  // Output user input
        System.out.println("salary is: " + salary);  // Output user input

    }
}

