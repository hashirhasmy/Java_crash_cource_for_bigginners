package com.lao.javalearning.MapInterface;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        //To insert element put method is used
        hashMap.put(1,"Hashir"); //ENTRY
        hashMap.put(2,"Harsan");
        hashMap.put(3,"Hasmy");
        hashMap.put(4,"Hasfan");
        System.out.println("MapValues :"+hashMap);

        System.out.println("----------------");
        //To make a copy of existing map
        HashMap<Integer,String> hashMap01 = new HashMap<Integer,String>();
        hashMap01.putAll(hashMap);
        System.out.println("Copy of existing MAP :"+hashMap01);

        System.out.println("----------------");
        //clear to delete map contents
        hashMap01.clear();
        System.out.println("after clear of existing MAP contents :"+hashMap01);

        System.out.println("----------------");
        //to verify key is available in map
        System.out.println("is this available in map :"+hashMap.containsKey(1));

        System.out.println("----------------");
        //to retrieve all the key from map
        System.out.println("what are the keys available :"+hashMap.keySet());

        System.out.println("----------------");
        //Fetch a value
        System.out.println("Fetch a value :"+hashMap.get(1));

        System.out.println("----------------");
        //Fetch all value
        System.out.println("Fetch all value :"+hashMap.values());

        System.out.println("----------------");
        //Fetch all keys and values
        System.out.println("Fetch all keys and value :"+hashMap.entrySet());

    }
}
