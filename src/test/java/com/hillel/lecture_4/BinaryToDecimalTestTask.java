package com.hillel.lecture_4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Написать программу, которая перевод десятичные числа в двоичные и наоборот.
 */
public class BinaryToDecimalTestTask {

    private BinaryToDecimalChecker binaryToDecimalChecker = new BinaryToDecimalChecker();

    @Test
    public void fromDecimalToBinaryTest() {
        String expectedResult = "1010011010";

        assertEquals(binaryToDecimalChecker.fromDecimalToBinary(666), expectedResult) ;
    }

    @Test
    public void fromBinaryToDecimalTest() {
        int expectedResult = 777;

        assertEquals(binaryToDecimalChecker.fromBinaryToDecimal("1100001001"), expectedResult) ;
    }

}
/* I broke the methods of this test. I write my code here.
fromDecimalToBinary
int result =0;
//I used method
int result = Integer.toBinaryString(666);
return result;

romBinaryToDecimal
int result =0;

int result = Integer.parseInt(1100001001,2);
return result;
 */