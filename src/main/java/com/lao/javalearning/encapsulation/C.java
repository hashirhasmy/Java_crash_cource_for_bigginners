package com.lao.javalearning.encapsulation;

public class C {
    public static void main(String[] args) {

        B b = new B();
        A a=b.assignValue();
        System.out.println("name is :"+ a.name);
    }
}
