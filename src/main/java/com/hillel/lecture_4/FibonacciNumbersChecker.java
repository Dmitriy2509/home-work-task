package com.hillel.lecture_4;

/**
 * Created by alpa on 10/25/19
 */
public class FibonacciNumbersChecker {


    public int[] getFibonacciNumbers(int number) {

//        TODO implements result
        int n0= 0;
        int n1 = 1;
        int n2;

        int[] result = { };
        for (int i=0; i<number; i++ ) {
            n2=n0;

            n0=n1;
            n1=n2;

        }




        return result;
    }

}
