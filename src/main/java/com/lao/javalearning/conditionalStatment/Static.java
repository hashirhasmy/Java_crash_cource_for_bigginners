package com.lao.javalearning.conditionalStatment;

public class Static {

     int  process = 50;

    public static void test01(){
        System.out.println("test01method");
    }

    public void test02(){
        test01();
        System.out.println(process);
        System.out.println("test02method");
    }

    public static void main(String[] args) {
        Static aStatic = new Static();
        aStatic.test02();







    }
}
