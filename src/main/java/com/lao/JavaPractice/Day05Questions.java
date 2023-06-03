package com.lao.JavaPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Day05Questions {

    Integer[] givenArray = {3, 5, 9, 12, 63, 2};

    public void findSmallest() {
        int smaallest = Integer.MAX_VALUE;

        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] < smaallest) {
                smaallest = givenArray[i];
            }
        }
        System.out.println("Smallest value using for loop is: " + smaallest);
    }

    public void usingarrayfindsmallest() {
        Arrays.sort(givenArray);
        System.out.println("Smallest value using Array is : " + givenArray[0]);
    }

    public void usingCollectionfindthesmallest() {
        //Collections class can only sort objects that implement the List interface.
        List<Integer> list = Arrays.asList(givenArray);
        Collections.sort(list);
        int smallest = list.get(0);
        System.out.println("smallest value using collection is: " + smallest);
    }

    public static void main(String[] args) {
        System.out.println("--------Find the smallest number from given array----------"); //Youtube done
        Day05Questions day05Questions = new Day05Questions();
        //Method 01
        day05Questions.findSmallest();
        //Method 02
        day05Questions.usingarrayfindsmallest();
        //Method 03
        day05Questions.usingCollectionfindthesmallest();

        System.out.println("--------Genarate Reandomn numbers----------");
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println(randomNumber);

        System.out.println("--------find the factorial number of digit count (5: 1*2*3*4*5)----------");

        int num = 5;
        int factorial=1;

        for(int i=1 ; i<=num; i++){
            factorial  = factorial*i;
        }
        System.out.println("Factorial number is :" + factorial);

        System.out.println("--------find the sum of Elements in  Arrays----------");
        int [] b = {5,9,12,45,12};
        int sum1 =0;
        int sum2 = 0;
        //Method 01 using for loop
        for (int i =0 ; i<=b.length-1; i++){
            sum1 = sum1+b[i];
        }
        //Method 2 using for each loop
        for (int value:b) {
            sum2 = sum2+value;
        }
        System.out.println("Sum of array using for loop:"+sum1+"\nSum of array using for each loop :"+sum2);

        System.out.println("--------Print Even & Odd Numbers from an Array----------");

        int [] c = {1,2,3,4,5,6};
        System.out.println("print even");
        for (int even:c) {
            if (even%2 == 0)
                System.out.println(even);
        }
        System.out.println("print odd");
        for (int odd:c) {
            if (odd%2 != 0)
                System.out.println(odd);
        }

        System.out.println("--------How to reverse the words in a sentence----------");
        String word = "My name is Hashir";
        String rev="";

        String[] splitWords=word.split(" ");
        int count = splitWords.length;
        System.out.println("split count"+count);

        for(int i= splitWords.length-1; i>=0; i--){
            rev=rev+splitWords[i]+" ";
        }
        System.out.println("After spit :" + rev);
    }
}
