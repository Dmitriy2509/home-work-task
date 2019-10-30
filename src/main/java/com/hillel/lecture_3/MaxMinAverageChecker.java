package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    @Step
    public int getMaxNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;

        if (a>c) {
            System.out.println("max: " +a);

            result = a;
        } else if (c>b) {
            System.out.println( "max: " +c);
            result = c;
        } else {
            System.out.println( "max: " +b);
            result = b;
        }/*else if (result> c) {
            System.out.println(c + " is bigger than " + a + " and "+ b);
         result = c;

        }*/



        return result;
    }

    @Step
    public int getAverageNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if (a>c) {
            System.out.println("average: " +c);

            result =c;
        } else if (b>c) {
            System.out.println( "average: " +c);
            result = c;
        } else if (a>b){
            System.out.println( "average: " +b);
            result = b;
        } else if (b>a){
            System.out.println( "average: " +b);
            result = b;;
        }


        return result;
    }

    @Step
    public int getMinNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;

        if (a<c) {
            System.out.println("min: " +a);

            result = a;
        } else if (c>b) {
            System.out.println( "min: " +b);
            result = b;
        } else {
            System.out.println( "min: " +c);
            result = c;
        }
        return result;
    }
}
