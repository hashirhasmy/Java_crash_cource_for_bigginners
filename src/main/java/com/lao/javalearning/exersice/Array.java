package com.lao.javalearning.exersice;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        String[][] a = {{"myname","benz"},{"test","jjj"},{"tdd"}};
//        System.out.println(a.length);


        int [][] c = {{4,78,99,88,36},{25,46}};
        System.out.println(c.length);

        for (int i = 0; i <c.length; i++){
            for (int j =0; j<c[i].length; j++){
                System.out.println(c[i][j]);
            }
        }


        int [][] y = new int[3][2];

        y[0][0] = 50;
        y[0][1] = 100;

        y[1][0] = 100;
        y[1][1] = 100;

        y[2][0] = 100;
        y[2][1] = 100;

        for (int h = 0; h <=2; h++){
            for (int k =0; k<=1; k++){
                System.out.println(y[h][k]);
            }
        }


        System.out.println("next one");

        // Initialize an array with some elements
        int[] arr = { 1, 2, 3, 4, 5 };

        // Value to be deleted
        int valueToDelete = 3;

        // Find the index of the value to be deleted
        int indexToDelete = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToDelete) {
                indexToDelete = i;
                break;
            }
        }

        // If the value was found, delete it from the array
        if (indexToDelete != -1) {
            for (int i = indexToDelete; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Resize the array
            int[] newArr = new int[arr.length - 1];
            System.arraycopy(arr, 0, newArr, 0, arr.length - 1);

            // Print the new array
            System.out.println(Arrays.toString(newArr));
        } else {
            System.out.println("Value not found in array");
        }


    }
 }
