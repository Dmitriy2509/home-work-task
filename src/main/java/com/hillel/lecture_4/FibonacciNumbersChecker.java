package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {

        //int [] result = new ;

        /*int [] result;
        result = new int[20];*/

        int[] result = new int[number];

//       TODO implements result

        int n0 = 0;
        int n1 = 1;
        int n2;
        result[0] = n0;
        result[1] = n1;

        System.out.print(n0 + " " + n1 + " ");

        for (int i = 2; i <number; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
            result[i] = n0;

        }

       return result;
    }
}


