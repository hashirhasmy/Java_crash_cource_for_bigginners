package com.lao.javalearning.abstraction;

public interface interfacejava8 {
    void test01();
    default void test02(){
        System.out.println("mu name is hashir");
    }
}
