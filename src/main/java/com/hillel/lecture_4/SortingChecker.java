package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

//        TODO implements result
        int[] result = new int[0];

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < values.length-1; i++) {
                if(values[i] > values[i+1]){
                    isSorted = false;

                    buf = values[i];
                    values[i] = values[i+1];
                    values[i+1] = buf;
                    result=values[i];
                }
            }
        }
        //sort by bubble sort
       /* for (int i= values.length; i>0; i--){
            for (int j =0; j<1; j++){
                if(values[j]> values[j+1]){
                    int tmp = values[j];
                    values[j] =values[j+1];
                    values[j+1]= tmp;
                     result =  values ;
                }
                result =  values;
            }result =  values;
        }result =  values;*/

        return result;
    }

    @Step
    public int[] fromMaxToMin(int[] values) {

//        TODO implements result
        int[] result = new int[0];
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < values.length-1; i++) {
                if(values[i] < values[i+1]){
                    isSorted = false;

                    buf = values[i];
                    values[i] = values[i+1];
                    values[i+1] = buf;
                    result=values[i];
                }
            }
        }
        return result;
    }
}
