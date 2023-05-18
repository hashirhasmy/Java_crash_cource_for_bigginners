package com.lao.javalearning.overiding;

public class Child extends Parent{

    @Override
    public void talk(){
        System.out.println("verify overide");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.talk();

        //Parentclass ref = new Childclass();
        Parent parent1 = new Child();
        parent1.prop();
        parent1.talk();









    }

}
