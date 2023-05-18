package com.lao.javalearning.abstraction;

public class Benz extends Car {

    @Override
    public void engineStatus(){
        System.out.println("Benz engine nice");
    }

    public static void main(String[] args) {
        Benz benz = new Benz();
        benz.engineStatus();
    }

}
