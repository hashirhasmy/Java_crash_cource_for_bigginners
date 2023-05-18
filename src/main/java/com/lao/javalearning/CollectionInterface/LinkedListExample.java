package com.lao.javalearning.CollectionInterface;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("name01");
        linkedList.add("name02");
        linkedList.add("name03");
        System.out.println(linkedList);

        System.out.println(linkedList.get(1));
    }
}
