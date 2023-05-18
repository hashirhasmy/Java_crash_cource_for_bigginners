package com.lao.javalearning.java_basics;

public class ReturnTypeExample {

    public Integer collectAmount = 500;

    public Integer getCollection (){
        return collectAmount;
    }

    public static void main(String[] args) {
        ReturnTypeExample returnTypeExample = new ReturnTypeExample();
        Integer returnCollectedAmount =returnTypeExample.getCollection();
        System.out.println(returnCollectedAmount);
    }
}
