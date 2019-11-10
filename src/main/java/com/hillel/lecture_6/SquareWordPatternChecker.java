package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {

//        TODO implements result
        String result = word;

        //result =word.substring(1) + word.substring(0,1);
        //result =word.substring(1) + word.substring(0,1);

        String words = word;

        for (int i = 1; i < word.length(); i++) {

            words = words.substring(1)+ words.charAt(0);
            result= result + ", " + words;


        }
        return result;
    }


}
