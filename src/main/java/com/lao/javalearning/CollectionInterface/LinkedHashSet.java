package com.lao.javalearning.CollectionInterface;

import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set linkedHashset = new java.util.LinkedHashSet<String>();
        linkedHashset.add("A");
        linkedHashset.add("b");
        linkedHashset.add("C");
        linkedHashset.add("C");
        linkedHashset.add("10");
        linkedHashset.remove("10");
        System.out.println(linkedHashset);
    }
}
