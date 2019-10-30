package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class NumberCompareChecker {

    @Step
    public String getGreatestNumber(int a, int b) {
        String result = "";
        if (a<b) {
            System.out.println("The number " + b + " has the greatest value");
            result = "Number 27 has greatest value!";
        } else if (a>b) {
            System.out.println("The number " + a + " has the greatest value");
            result = "Number -3 has greatest value!";
        } else if (a==b){
            System.out.println("a=b");
            result = "Numbers 19 and 19 are equals!";
        }
//        TODO implements result


        return result;
    }
}
