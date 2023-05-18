package com.lao.javalearning.string;

public class StringBufferLearning {

    public static void main(String[] args) {
        String name = "Hashir";
        System.out.println(name.concat("Hasmy"));
        System.out.println(name);

        StringBuffer name1 = new StringBuffer("Mohamed");
        System.out.println(name1.append("Harsan"));
        System.out.println(name1);

        StringBuilder stringBuilder =new StringBuilder("StringBuilder");
        System.out.println(stringBuilder.append("01"));
        System.out.println(stringBuilder);
    }
}
