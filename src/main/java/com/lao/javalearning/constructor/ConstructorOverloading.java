package com.lao.javalearning.constructor;

public class ConstructorOverloading {


    ConstructorOverloading(){
        System.out.println("This is don't know car name");
    }

    ConstructorOverloading(String carName){
        System.out.println("Car name is "+ carName);
    }



    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading();
        ConstructorOverloading obj1 = new ConstructorOverloading("Tesla");
    }
}
