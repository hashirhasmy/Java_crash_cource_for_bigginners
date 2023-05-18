package com.lao.javalearning.string;

public class StringLearning {

    public static void main(String[] args) {
        String name ="hashir";
        System.out.println(name.trim());
        System.out.println(name.isEmpty());
        System.out.println(name.equals("test"));
        System.out.println(name.equalsIgnoreCase("HasHir"));
        System.out.println(name.length());
        System.out.println(name.contains("ha"));
        System.out.println(name.concat("Mohamed"));
        System.out.println(name.replace("ha","HA"));


        String name1 = "test,yoy,hhhh";
        String[] string = name1.split(",");
        for (String spliting:string) {
            System.out.println(spliting);
        }
    }
}
