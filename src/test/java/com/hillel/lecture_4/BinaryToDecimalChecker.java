package com.hillel.lecture_4;

import io.qameta.allure.Step;

/package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {




        @Step
        public int fromDecimalToBinary ( int value){


//        TODO implements result

            String result = "";
            //int result = 0;
            //result = Integer.toBinaryString(value);
            //int a = 2;
            result= Integer.toBinaryString(value);
            //result = Integer.toString(value,2);
           // result = Integer.toString(value, 2);

            return result;
        }

        @Step
        public int fromBinaryToDecimal ( String value){

//        TODO implements result
            int result = 0;
            result = Integer.parseInt(value,2);
            //int result = Integer.parseInt(value,2);
            return result;
        }
    }
