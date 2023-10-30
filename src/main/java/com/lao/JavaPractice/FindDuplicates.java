package com.lao.JavaPractice;

import java.util.ArrayList;

public class FindDuplicates {

    public static void main(String[] args) {  //Youtube done
        int[] inputArray = {1, 2, 3, 4, 2, 5, 6, 1, 3};
        ArrayList<Integer> test = FindDuplicates(inputArray);
        System.out.println(test);
        //String dummyCkeck = whileLoopTest();
        System.out.println("<<<<<<<<<<<<---------->>>>>>>>>>>>>>>>>");
        //findDuplicatesonArray();
    }

    public static ArrayList<Integer> FindDuplicates(int[] arr) {
        ArrayList<Integer> removeDuplicates = new ArrayList<>();
        ArrayList<Integer> findDuplicates = new ArrayList<>();
        for (int num : arr) {
            if (!removeDuplicates.contains(num)) {
                removeDuplicates.add(num);
            } else {
                findDuplicates.add(num);
            }
        }
        return removeDuplicates;
    }

    public static String whileLoopTest(){
        String value = "null";
        boolean isServicable = true;

        while (isServicable){
            for (int i=0; i<5; i++){
                System.out.println("name is : "+i);
                isServicable = false;
            }
        }
        return value;
    }

    public static void findDuplicatesonArray(){
        String arr[] ={"hashir","harsan","java","hashir","hasfan","hasfan"};

        boolean flag = false;
        for (int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate elemet is :" + arr[i]);
                    flag = true;
                }
            }
        }
        if(flag==false){
            System.out.println("duplicates nt found");
        }



    }


}
