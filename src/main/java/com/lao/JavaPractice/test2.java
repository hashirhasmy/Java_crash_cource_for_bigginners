package com.lao.JavaPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class test2 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 2, 5, 6, 1, 3};
        removeDuplicates(inputArray);
    }
    public static void removeDuplicates(int[] arr){
        HashSet<Integer> uniqueList = new HashSet<>();
        for (int num : arr) {
            uniqueList.add(num);
        }
        System.out.println(uniqueList);
    }

}
