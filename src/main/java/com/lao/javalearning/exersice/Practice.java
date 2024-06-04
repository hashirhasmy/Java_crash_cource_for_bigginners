package com.lao.javalearning.exersice;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        Integer a[] = {34,12,2,6,45};
        int secondlengthValue=test(a);
        System.out.println(secondlengthValue);
    }

    public static Integer test(Integer[] arr){

        List<Integer> list = new ArrayList<>();
        List<Integer> listcopy = new ArrayList<>();
        int whileCount = 0;
        int arrleangth =arr.length;
        while (whileCount<arrleangth){
            int indextoremove= 0;
            int smallestvalue = Integer.MAX_VALUE;
            for (int i=0; i<arrleangth; i++){
                if (arr[i] < smallestvalue){
                    smallestvalue = arr[i];
                    indextoremove = i;
                }
            }
            arr[indextoremove] = Integer.MAX_VALUE;
            whileCount++;
            list.add(smallestvalue);
        }

        listcopy.addAll(list);
        System.out.println(listcopy);
        int secondlengthValue=listcopy.get(arrleangth-2);
        return secondlengthValue;
    }
}
