package com.lao.javalearning.abstraction;

public class java8interfacetest implements interfacejava8 {


    @Override
    public void test01() {
        System.out.println("i have implemented a method");
    }

    @Override
    public void test02() {
        interfacejava8.super.test02();
    }
}
