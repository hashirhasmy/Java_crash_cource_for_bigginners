package com.lao.javalearning.conditionalStatment;

public class If_Else {

    boolean isDamaged=false;

    String power = "Superman";

    public void testIfElseIf(){
        if (power.equals("Spiderman")){
            System.out.println("you think about spiderman");
        } else if (power.equals("Superman")) {
            System.out.println("you think about Superman If else if");
        } else if (power.equals("you think about Ironman ")) {
            System.out.println("you think about Ironman");
        } else {
            System.out.println("nothing thought");
        }
    }



    public void switchCase(){
        switch (power){
            case "Superman" :
                System.out.println("Hi iam Superman switch case");
                break;
            case "Badman" :
                System.out.println("Hi i am Badman");
                break;
            case "Spiderman" :
                System.out.println("Hi iam Spiderman");
                break;
            default:
                System.out.println(power + " can't find the real pearson");
        }
    }



    public static void main(String[] args) {
        //ifelseif example
        If_Else obj = new If_Else();
        obj.testIfElseIf();
        obj.switchCase();

        //ifelse example
        if (obj.isDamaged){
            System.out.println("This is not damaged");
        } else {
            System.out.println("This is damaged if else");
        }
    }
}
