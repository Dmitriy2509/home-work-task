package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class PassFailChecker {

    @Step
    public String checkNumber(int number) {
        String result = "" ;
//        TODO implements result
        if(number >= 50){

            System.out.println("Done");
            System.out.println("PASS");
            result = "PASS";
        } else {

            System.out.println("Done");
            System.out.println("FAIL");
            result = "FAIL";
        }



        return result;
    }
}
