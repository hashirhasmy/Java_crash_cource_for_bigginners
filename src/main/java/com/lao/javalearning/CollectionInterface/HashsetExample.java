package com.lao.javalearning.CollectionInterface;

import java.util.HashSet;

public class HashsetExample {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add(null);
        hashSet.add("A");
        hashSet.add("D");
        System.out.println("Added hashset values :"+hashSet);
    }
}
