package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DivisorChecker {

    @Step
    public String checkDivisor(int divisor, int number) {
        //        TODO implements result
        String result = "";

        if (divisor%number ==0 || number%divisor ==0 ){
            System.out.println("число а является делителем числа b");
            result = "число а является делителем числа b";
        } else {
            System.out.println("число  не а является делителем числа b");
            result = "число а не является делителем числа b";
        }
        return result;
    }
}
