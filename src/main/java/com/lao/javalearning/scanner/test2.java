package com.lao.javalearning.scanner;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        String value = "yy";



        Scanner scanner = new Scanner(System.in);
        System.out.println("enter mark");
        value = scanner.nextLine();
        if (value.equals("yy")){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
    }
}
