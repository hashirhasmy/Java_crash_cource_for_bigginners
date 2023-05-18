package com.lao.javalearning.constructor;

public class NoArgConstructor {

    int testint;
    String stringtest;

    NoArgConstructor(){
        testint = 10;
        stringtest = "Agmi";
        System.out.println("my name is" + testint + "" + stringtest);
    }

    public static void main(String[] args) {
        NoArgConstructor noArgConstructor = new NoArgConstructor();
    }
}
