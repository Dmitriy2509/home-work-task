package com.hillel.lecture_4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая выводит все числа Фибоначчи до заданного числа
 */
public class FibonacciNumbersTestTask {

    private FibonacciNumbersChecker fibonacciNumbersChecker = new FibonacciNumbersChecker();

    @Test
    public void fromDecimalToHexadecimalTest() {
        int[] expectedResult = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987 };

        assertEquals(fibonacciNumbersChecker.getFibonacciNumbers(20), expectedResult) ;
    }
}
/*;
        int n0 = 0 ;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");

        for (int i = 3; i <=100500 ; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
            if (n2==number){
                break;*/