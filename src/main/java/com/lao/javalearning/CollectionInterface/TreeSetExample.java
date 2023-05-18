package com.lao.javalearning.CollectionInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(2);
        numbers.add(48);
        System.out.println(numbers.first());
        System.out.println(numbers.last());
        System.out.println(numbers.subSet(48,50));
        System.out.println("verify insertion order treeset ascending order :"+numbers);
        System.out.println("Comperator return null if element sorted in a default natural order :"+numbers.comparator());
        System.out.println("Descending order :"+numbers.descendingSet());

        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
