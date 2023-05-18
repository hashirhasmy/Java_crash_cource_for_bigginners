package com.lao.javalearning.constructor;

public class SuperKeywordChild extends SuperKeywordParent {

    public SuperKeywordChild(){
        //super();  --> we can't see this key word
        System.out.println("this is child");
    }

    public static void main(String[] args) {
        SuperKeywordChild obj = new SuperKeywordChild();
    }

}
