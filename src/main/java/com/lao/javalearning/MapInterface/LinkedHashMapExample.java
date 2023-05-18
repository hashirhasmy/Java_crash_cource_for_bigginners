package com.lao.javalearning.MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("Ironman","Hashir");
        linkedHashMap.put("Badman","Harsan");
        linkedHashMap.put("superman","Hasfan");
        System.out.println("Linkedhashmap keys and values :"+linkedHashMap);

        System.out.println("---------------------------");

        HashMap<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("Ironman","Hashir");
        hashMap.put("Badman","Harsan");
        hashMap.put("superman","Hasfan");
        System.out.println("Hashmap keys and values :"+hashMap);
    }
}
