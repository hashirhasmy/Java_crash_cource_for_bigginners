package com.lao.javalearning.encapsulation;

public class D {

    public static void main(String[] args) {
        A a = new A();
        a.name="hashirhashir";
        System.out.println(a.name);
        if (a.isIn){
            System.out.println("i am inside");
        }
    }
}
