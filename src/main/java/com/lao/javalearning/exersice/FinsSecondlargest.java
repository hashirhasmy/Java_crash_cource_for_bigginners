package com.lao.javalearning.exersice;

import java.util.*;

public class FinsSecondlargest {

    public static void main(String[] args) {
        Integer[] numbers  = {1,4,45,33,63,55,27,78,11,99};
        int secondlargestValue = findsecondlargesteasyway(numbers);
        System.out.println("Second largest value is :" + secondlargestValue);
    }

    public static Integer findsecondlargestchatgpt(Integer[] arr){
        List<Integer> list = new ArrayList<>();
        List<Integer> copyListValue = new ArrayList<>();
        int count = arr.length;
        int whileCount = 0;
        while (whileCount < count) {
            int smallestValue = Integer.MAX_VALUE;
            int indexToRemove = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < smallestValue) {
                    smallestValue = arr[i];
                    indexToRemove = i;
                }
            }
            arr[indexToRemove] = Integer.MAX_VALUE; // Mark as visited
            list.add(smallestValue);
            whileCount++;
        }
        copyListValue.addAll(list);
        System.out.println(copyListValue);
        return copyListValue.get(count-2);
    }



    public static Integer findsecondlargestusingbublesort(Integer[] arr){

        int count = arr.length;
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        List<Integer> list=Arrays.asList(arr);
        System.out.println(list);
        return list.get(count-2);
    }

    public static Integer findsecondlargesteasyway(Integer[] arr){
        int arraySize = arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[arraySize-2];
    }

}
