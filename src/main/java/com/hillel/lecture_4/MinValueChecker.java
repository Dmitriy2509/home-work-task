package com.hillel.lecture_4;

import io.qameta.allure.Step;

import java.util.Arrays;

/**
 * Created by alpa on 10/25/19
 */
public class MinValueChecker {

    @Step
    public int getValue(int[] values) {

//        TODO implements result
        int result = 0;
        /*int min = values[0];
        for(int i=0; i<=values.length; i++){
           if(values[i]<min) {
               min = values[i];
           }
            System.out.println(min);
        result= min;
        }*/
        /*int min = values [0];
        for (int i=0; i<values.length; i++ ){

            if(values[i]<min){
                min= values[i];
                //result= min;
            }*/

        Arrays.sort(values);
        int min = values[0];
        System.out.println(min);
        result =min;
        return result;
    }

}
