package com.lao.JavaPractice;

public class Day02Questions {
    public static void main(String[] args) {
        String name = "HASHIR";
        //Method 01
//        StringBuilder stringBuilder = new StringBuilder(name);
//        System.out.println(stringBuilder.reverse());

        //Method02
        System.out.println("-------------Reverse a String Value---------------");
        String sameName=name;
        String rev="";

        int len=name.length();  //6

        for (int i=len-1; i>=0; i--){
          rev=rev+name.charAt(i);
        }
        System.out.println("Reverse String is: "+rev);

        if (rev.equals(sameName)){
            System.out.println("parallel String");
        }else {
            System.out.println("not");
        }

        System.out.println("-------------Count number of Digits---------------");

        int number = 1234566780;
        int count=0;

        while (number>0){
            number=number/10;
            count++;
        }
        System.out.println("Number of digits :"+count);


        System.out.println("-------------Count Add and Even number counts of Digits---------------");

        int new_number = 456789;

        int even = 0;
        int odd = 0;

        while (new_number>0){
            int temp=new_number%10;

            if (temp%2==0){
                even++;
            }else {
                odd++;
            }
            new_number=new_number/10;
        }
        System.out.println("Even Count :"+even);
        System.out.println("Odd Count :"+odd);
    }
}
