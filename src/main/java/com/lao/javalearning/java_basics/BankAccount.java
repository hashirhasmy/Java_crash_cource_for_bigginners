package com.lao.javalearning.java_basics;

public class BankAccount {

    Long longValue = 45654646454l;
    Integer smallValue = 123;
    String name = "account name";

    public void getName() {
       System.out.println("A/C name: "+name);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.getName();

    }
}
