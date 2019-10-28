package com.hillel.lecture_4;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    public String getReversString(String value) {

//        TODO implements result
        String result = "";

        char [] reverseArray  = value.toCharArray(); //change value to char type

        for (int i = reverseArray.length-1; i<=0; i--){


            System.out.print(reverseArray[i]);

            //result = ;
        }

        return result;
    }

}
