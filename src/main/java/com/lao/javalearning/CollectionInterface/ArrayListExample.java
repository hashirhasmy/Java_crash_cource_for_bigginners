package com.lao.javalearning.CollectionInterface;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample {

    public static void arrayListTest(){
        ArrayList<String> arrayLis = new ArrayList<String>();
        arrayLis.add("Hashir01");
        arrayLis.add("Hashir02");
        arrayLis.add("Hashir03");
        arrayLis.add("Hashir04");
        System.out.println("Print added values to arrayList :"+arrayLis);


        System.out.println("Get the 0 position value :"+arrayLis.get(0));
        System.out.println("Verify false value :"+arrayLis.indexOf("65456"));

        ArrayList<String> anotherList = new ArrayList<String>();
        anotherList.addAll(arrayLis);
        System.out.println("Adding all the values from previous list :"+anotherList);
        anotherList.clear();
        System.out.println("Verifying clear method :"+anotherList);


        arrayLis.remove(0);
        System.out.println("Verifying removing only one element from array :"+arrayLis);

//        arrayLis.set(0,"HashieSet01");
//        System.out.println(arrayLis);

        System.out.println("Verifying erray list empty :"+arrayLis.isEmpty());

        int size = arrayLis.size();
        System.out.println("Verify size of the arraylist :"+size);
        System.out.println("-------------");
        for (String string:arrayLis) {
            System.out.println("using for each: "+string);
        }
        System.out.println("-------------");
        for (int i = 0; i<arrayLis.size(); i++){
            System.out.println("using for loop: "+arrayLis.get(i));
        }
        System.out.println("-------------");
        ListIterator<String> list_iterator=arrayLis.listIterator();
        while (list_iterator.hasNext()){
            System.out.println(list_iterator.next());
        }
        while (list_iterator.hasPrevious()){
            System.out.println(list_iterator.previous());
        }
    }

    public static void main(String[] args) {
        arrayListTest();
    }
}
