package com.lao.javalearning.exersice;

public class pattern {
    //2,1,3,4,7,11,18,29, .....


    public static void main(String[] args) {
        int startNumber = 2;
        int secondnumber = 1;
        int wantedCount = 5;
        int tempValue = 0;

        System.out.println(startNumber + ", " + secondnumber);

            for(int i=startNumber; i< wantedCount; i++){
                tempValue = startNumber + secondnumber;
                System.out.println(", " + tempValue);
                startNumber = secondnumber;
                secondnumber = tempValue;
            }
        }

}
