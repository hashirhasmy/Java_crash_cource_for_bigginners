package com.lao.JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {   //Youtube done
        int[] inputArray = {1, 2, 3, 4, 2, 5, 6, 1, 3};
        ArrayList<Integer> test = removeDuplicates(inputArray);
        System.out.println(test);

    }
    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int num : arr) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        return uniqueList;
    }
}

