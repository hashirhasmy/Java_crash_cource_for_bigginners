package com.lao.JavaPractice;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        name("testAutomation");  //you tube done
//        int x = 50;
//        int y = 10;
//        x = 100;
//        System.out.println(x=x+y);
//        System.out.println(x=x-y);
//        System.out.println("-------");
    }

    public static void name(String typed_name){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] chartArray = typed_name.toCharArray();
        for (Character c:chartArray) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
