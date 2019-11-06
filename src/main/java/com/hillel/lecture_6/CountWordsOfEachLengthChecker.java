package com.hillel.lecture_6;

import io.qameta.allure.Step;
import org.apache.commons.lang.StringUtils;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

//        TODO implements result
        int result = 0;

        if (sentence.length() !=0){

            result++;

            for (int i = 0; i < sentence.length(); i++) {


                if(sentence.charAt(i) == wordLength){

                    result++;
                }

            }

        }


        return result;
    }


}
//