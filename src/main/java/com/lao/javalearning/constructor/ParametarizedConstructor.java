package com.lao.javalearning.constructor;

public class ParametarizedConstructor {

    String test01 ;
    String test02;

    ParametarizedConstructor(String animalname, String animalfood){
        this.test01=animalname;
        this.test02=animalfood;
    }

    public void testParam01(){
        System.out.println("Animal details :"+test01+" "+test02);
    }
    public void testParam02(){
        System.out.println("Animal details :"+test01+" "+test02);
    }


    public static void main(String[] args) {
        ParametarizedConstructor obj = new ParametarizedConstructor("Elephant","Tree");
        obj.testParam01();

        ParametarizedConstructor obj1 = new ParametarizedConstructor("Lion","Meals");
        obj1.testParam01();
    }
}
