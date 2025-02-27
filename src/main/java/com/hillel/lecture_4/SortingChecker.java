package com.hillel.lecture_4;

import io.qameta.allure.Step;

import java.util.Arrays;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

//        TODO implements result
        int[] result = new int[values.length];


        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i] > values[i + 1]) {
                    isSorted = false;

                    buf = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = buf;

                    result[i] = values[i];
                }

            }

        }
        return result;
    }

    @Step
    public int[] fromMaxToMin(int[] values) {

//        TODO implements result
        int[] result = new int[values.length];
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

                    result[i]=values[i];
                }
            }



        }
        return result;
    }
}
