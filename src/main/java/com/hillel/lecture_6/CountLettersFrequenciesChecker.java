package com.hillel.lecture_6;

import io.qameta.allure.Step;
import org.apache.commons.lang.StringUtils;

/**
 * Created by alpa on 11/2/19
 */
public class CountLettersFrequenciesChecker {


    @Step
    public String countLettersFrequencies(String text, char letter) {

//        TODO implements result
        String result = "";

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == letter ) {
                count++;
            }
             result = "Character '" + letter + "' repeated " + count + " times" ;
        }


        //int count =text.length() - text.replace(".","").length();


        //count letters
        //int countOfletters = text.chars().filter(num -> num == '$').count();

        //count a char
        /*int charCount = 0;
        char temp;

        for (int i = 0; i <text.length() ; i++) {

            temp =text.charAt(i);

            if (text.)
            charCount++;
            System.out.println(charCount);
        }*/







        return result;
    }
}
