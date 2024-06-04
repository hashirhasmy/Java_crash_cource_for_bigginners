package com.lao.javalearning.exersice;

public class findUperandlowerLetter {

    public static void main(String[] args) {
        String word = "Welcome To Hashir Channel";

        String upperLetter = "";
        String lowerLetter = "";
        int upperCount = 0;
        int loweerCount = 0;
        for (int i=0; i<word.length(); i++){
            char letter =word.charAt(i);
            int ascivalue = (int)letter;
            if(ascivalue >= 65 && ascivalue <= 90){
                  upperLetter = upperLetter + String.valueOf(letter);
                upperCount++;
            }else{
                lowerLetter = lowerLetter + String.valueOf(letter);
                if (!String.valueOf(letter).isBlank()) {
                    loweerCount++;
                }
            }
        }
        System.out.println(upperLetter);
        System.out.println(upperCount);
        System.out.println(lowerLetter);
        System.out.println(loweerCount);
    }
}
