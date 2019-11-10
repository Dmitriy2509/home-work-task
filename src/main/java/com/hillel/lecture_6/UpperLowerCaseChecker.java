package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = "";

        result = word.toUpperCase();
        return result;
    }

    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = "";

        result = word.toLowerCase();

        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {

//        TODO implements result
        String result = "";

        String[] arrayString = sentence.split("\\.");
        //result = sentence.substring(0,1).toUpperCase()+ sentence.substring(1);

        for (int i = 0; i < arrayString.length; i++) {

            arrayString[i]=arrayString[i].trim();
            arrayString[i] =arrayString[i].substring(0,1).toUpperCase() + arrayString[i].substring(1);

        }

        result = String.join(". ", arrayString);

        if(sentence.charAt(sentence.length()-1)== '.'){

            result=result + ".";
        }

        return result;
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {

//        TODO implements result
        String result = "";

        String s="";
        s=s+sentence.substring(0,1).toUpperCase();
        for (int i = 1; i <sentence.length() ; i++) {

            if(" ".equals(sentence.substring(i-1,i))){

                s=s+sentence.substring(i,i+1).toUpperCase();
            } else{
                s=s+sentence.substring(i,i+1);
            }

        }


        return result;
    }
}
