package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class NumberInWordChecker {

    @Step
    public String getNumberIfElse(int number) {
        //        TODO implements result
        String result = "";
        if (number == 1) {
            System.out.println("ONE");
            result =  "ONE";
        } else if (number == 2) {
            System.out.println("TWO");
            result =  "TWO";
        } else if (number == 3) {
            System.out.println("THREE");
            result = "THREE";
        } else if (number == 4) {
            System.out.println("FOUR");
            result = "FOUR";
        } else if (number == 5) {
            System.out.println("FIVE");
            result = "FIVE";
        } else if (number == 6) {
            System.out.println("SIX");
            result = "SIX";
        } else if (number == 7) {
            System.out.println("SEVEN");
            result = "SEVEN";
        } else if (number == 8) {
            System.out.println("EIGHT");
            result = "EIGHT";
        } else if (number == 9) {
            System.out.println("NINE");
            result = "NINE";
        } else if (number==100){
            System.out.println("OTHER");
            result = "OTHER";
        }



        return result;
    }

    @Step
    public String getNumberSwitchCase(int number) {
        //        TODO implements result
        String result = "";
        switch (number) {

            case 1:
                System.out.println("ONE");
                result =  "ONE";
                break;
            case 2:
                System.out.println("TWO");
                result =  "TWO";
                break;
            case 3:
                System.out.println("THREE");
                result = "THREE";
                break;
            case 4:
                System.out.println("FOUR");
                result = "FOUR";
                break;
            case 5:
                System.out.println("FIVE");
                result = "FIVE";
                break;
            case 6:
                System.out.println("SIX");
                result = "SIX";
                break;
            case 7:
                System.out.println("SEVEN");
                result = "SEVEN";
                break;
            case 8:
                System.out.println("EIGHT");
                result = "EIGHT";
                break;
            case 9:
                System.out.println("NINE");
                result = "NINE";
                break;
            case 100:
                System.out.println("OTHER");
                result = "OTHER";
        }



        return result;
    }
}
