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

        String [] words  = sentence.split("[^a-zA-Z]");

        int  size = words.length, length =wordLength, count = 0;


        for (int i = 0; i < size; i++) {


            if (words[i].length() ==length){

                ++count;

            }
            result = count;
        }
        return result;

         /* for (int i = 0; i < sentence.length(); i++) {
            for (int j = 0; j < wordLength; j++) {

                if (sentence.length()== wordLength) {
                    count++;
            }

            }*/


        /*for (int i = 0; i < sentence.length(); i++) {
            if

        }*/
        /*if (sentence.length() !=0){

            result++;*/

            /*for ( sentence.length():wordLength ){

                if (sentence.length())
            }*/

            /*for (int i = 0; i < sentence.length(); i++) {


                if(sentence.charAt(i) == wordLength){

                    result++;
                }

            }

        }*/

            /*Use this one.
           String words [] = sentence.split("[^a-zA-Z]");

           int i, size = wordLength, count = 0;


        for (int i = 0; i < size; i++) {


            if (words[i].length() ==wordLength){

             ++count;

            }

            result = count;
        }*/

        //return result;
    }


}
