package com.hillel.lecture_4;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    public int[] fromMinToMax(int[] values) {

//        TODO implements result
        int[] result = new int[0];
        //sort by bubble sort
        for (int i= values.length-1; i>0; i--){
            for (int j =0; j<1; j++){
                if(values[j]> values[j+1]){
                    int tmp = values[j];
                    values[j] =values[j+1];
                    values[j+1]= tmp;
                }

            }
        }

        return result;
    }

    public int[] fromMaxToMin(int[] values) {

//        TODO implements result
        int[] result = new int[0];

        return result;
    }
}
