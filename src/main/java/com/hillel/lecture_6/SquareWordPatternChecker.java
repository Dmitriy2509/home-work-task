package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {

//        TODO implements result
        String result = "";

        //result =word.substring(1) + word.substring(0,1);
        result =word.substring(1) + word.substring(0,1);
        return result;
    }


}
