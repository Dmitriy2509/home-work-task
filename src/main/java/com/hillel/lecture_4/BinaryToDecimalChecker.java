import io.qameta.allure.Step;

/package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {


  public int fromDecimalToBinary(int value) {

    @Step
    public int fromDecimalToBinary(int value) {


//        TODO implements result
        int result = 0;
        //int result = Integer.toBinaryString(value, 2);
         result=Integer.toString(value,2);
        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;
        result = Integer.parseInt(value,2);
        return result;
    }
}
