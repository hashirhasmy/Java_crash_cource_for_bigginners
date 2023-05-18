package com.lao.javalearning.overloading;

public class Overload_Main {
    //step 01
    public void talk(Partner partner){
        System.out.println("talk 01");
    }
    public void talk(Parent parent){
        System.out.println("talk 02");
    }
    public void talk(Child child){
        System.out.println("talk 03");
    }

    //step 02
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }


    public static void main(String[] args) {
        Overload_Main overload_main = new Overload_Main();
        //step 01
        Partner partner = new Partner();
        Parent parent = new Parent();
        Child child = new Child();
        overload_main.talk(partner);
        overload_main.talk(parent);
        overload_main.talk(child);

        //step 02
        System.out.println(overload_main.add(10,15));
        System.out.println(overload_main.add(10,15,25));
    }
}
