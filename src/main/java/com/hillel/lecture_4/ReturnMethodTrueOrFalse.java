package com.hillel.lecture_4;

public class ReturnMethodTrueOrFalse {

    public static void main(String[] args) {

        methodReturnTrueOrFalseIfNumberIsEvenOrOdd(2.5);
        /*int [] data = {1, 3,462 , 362};
        int result = sumOfArray(data);
        System.out.println(result);*/



    }
    public static String methodReturnTrueOrFalseIfNumberIsEvenOrOdd (double number){
        String message="";

        if (number%2==0){

             message = "true";

        }else {

            message = "false";
        }

        return message;


    }





}
