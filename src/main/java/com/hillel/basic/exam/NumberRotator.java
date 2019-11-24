package com.hillel.basic.exam;

import java.util.Arrays;
import java.util.OptionalLong;

/**
 * Take a number: 56789. Rotate left, you get 67895.
 * Keep the first digit in place and rotate left the other digits: 68957.
 * Keep the first two digits in place and rotate the other ones: 68579.
 * Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains
 * only one digit which rotated is itself.
 * <p>
 * You have the following sequence of numbers:
 * 56789 -> 67895 -> 68957 -> 68579 -> 68597
 * and you must return the greatest: 68957.
 * <p>
 * Calling this function max_rot (or maxRot or ... depending on the language)
 * max_rot(56789) should return 68957
 */

public class NumberRotator {

    public static long rotate(long n) {

        String nToLong =Long.toString(n);

        String first = nToLong.substring(1)+ nToLong.charAt(0);
        //67895
        //result
        long number = Long.parseLong(first);

        String second =first.charAt(0) +first.substring(2,first.length())+first.charAt(1);
        //68957
        long number2 = Long.parseLong(second);

        String third = second.substring(0,2)+ second.substring(3,second.length())+ second.charAt(2);
        //68579
        long number3 =Long.parseLong(third);

        String fourth = third.substring(0,2)+third.charAt(2)+ third.charAt(4)+ third.charAt(3);
        //68597
        long number4=Long.parseLong(fourth);

        /*long [] result = {number, number2, number3, number4};
        OptionalLong number= Arrays.stream(result).max();*/
        long halfnumber= Math.max(number,number2);
        long halfnumber2 =Math.max(number3, number4);
        long result =Math.max(halfnumber,halfnumber2);



        return result;
    }
}

// String nFirst =String.valueOf(n);
//convert to String
//String nToString = String.valueOf(n);

        /*
        String nToLong =Long.toString(n);

        String first = nToLong.substring(1)+ nToLong.charAt(0);
        //67895

        String second =first.charAt(0) +first.substring(2,4)+first.charAt(1);
        //68957

        String third = second.substring(0,1)+ second.substring(3,4)+ second.charAt(2);
        //68579
        String fourth = third.substring(0,2)+ third.charAt(4)+ third.charAt(3);
        //68597
           */

        /*for (int i = 1; i < n.; i++) {

        }*/

            /*nToString = nToString.substring(1) + nToString.charAt(0);
            String result = nFirst + ", " + nToString;
            nToString = nToString.substring(1) + nToString.charAt(0);
            String result = nFirst + ", " + nToString;*/
