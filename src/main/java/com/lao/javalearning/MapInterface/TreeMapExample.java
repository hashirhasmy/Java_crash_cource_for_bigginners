package com.lao.javalearning.MapInterface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String,String> treeMap = new TreeMap<String,String>();
        try{
            treeMap.put("Car","BMW");
            treeMap.put("Bike","pulsar");
            treeMap.put(null,"pulsar");
            System.out.println(treeMap);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
