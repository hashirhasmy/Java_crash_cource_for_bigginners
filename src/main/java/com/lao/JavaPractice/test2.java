package com.lao.JavaPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class test2 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 2, 5, 6, 1, 3};
        removeDuplicates(inputArray);
    }
    public static void removeDuplicates(int[] arr){  //Youtube done
        HashSet<Integer> uniqueList = new HashSet<>();
        for (int num : arr) {
            if (uniqueList.add(num)==false){
                System.out.println("Duplicate is : "+num);
            }
        }
        System.out.println("After Remove Duplicates, showing Elemets :"+uniqueList);
    }

}
