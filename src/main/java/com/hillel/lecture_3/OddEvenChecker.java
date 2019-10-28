package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class OddEvenChecker {


    public String checkNumber(int number) {

        String result = "";

        if (number % 2 == 0){

            System.out.println("Even Number");
            System.out.println("BYE");
            result = "Even Number";
        } else{

            System.out.println("Odd Number");
            System.out.println("BYE");
            result = "Odd Number";
        }
//        TODO implements result


        return result;
    }
}
