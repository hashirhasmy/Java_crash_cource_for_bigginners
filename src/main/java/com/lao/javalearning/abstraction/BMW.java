package com.lao.javalearning.abstraction;

public class BMW extends Car implements upcomingProjectInterface,interface2 {

    @Override
    public void engineStatus(){
        System.out.println("BMW engine nice");
    }

    public static void main(String[] args) {
        Car car = new BMW();
        car.engineStatus();
        car.partialImplementaion();

        upcomingProjectInterface upcomingProjectInterface = new BMW();
        upcomingProjectInterface.animalSound();
    }


    @Override
    public void testImp() {

    }

    @Override
    public void animalSound() {
        System.out.println("animal sound");
    }

    @Override
    public void run() {

    }
}
