package com.hillel.basic.exam;

import java.util.Arrays;

/**
 * Description:
 * We want to generate a function that computes the series starting from 0 and ending until the given number following the sequence:
 * 0 1 3 6 10 15 21 28 36 45 55 ....
 * which is created by
 * 0, 0+1, 0+1+2, 0+1+2+3, 0+1+2+3+4, 0+1+2+3+4+5, 0+1+2+3+4+5+6, 0+1+2+3+4+5+6+7 etc..
 * <p>
 * Input: LastNumber
 * Output: series and result
 * <p>
 * Example:
 * <p>
 * Input: 6
 * Output: 0+1+2+3+4+5+6 = 21
 * <p>
 * Input: -15
 * Output: -15 < 0
 * <p>
 * Input: = 0
 * Output: 0 = 0
 */

public class SequenceSum {

    public static String showSequence(int value) {
            String result = "";

        if (value<0){
            System.out.println(value + "<0");
        } else if (value==0){
            System.out.println(value + "=0");
        }
        //display numbers like "0+1+2..value"
        else if(value>0) {

            //sum of numbers
            value = value;
            int sum = (value * value + value) / 2;

            String resultSum = Integer.toString(sum);

            int lenght = value+1;

            int z= 1;
            int [] array = new int [lenght];



            for (int i = 0; i <lenght ; i++) {
                int print = z * i;
                //System.out.print(print + "+");
                array[i] = print;
            }
            //convert array to String
            String resultPlus = Arrays.toString(array);
            //String resultminus = resultPlus.replace("[","");
            //String resultminusS =

            //replace " " to ""
            String resultPlusreplace = resultPlus.replaceAll(" ","");
            //replace "," to "+"
            String resultPlusreplacePlus = resultPlusreplace.replaceAll(",","+");
            // add necessary symbols (array = resultSum)
            String equally = " = ";
            // connect array with " = "
            String resultEqually =resultPlusreplacePlus.concat(equally);
            //connect (array with " = ") with result resultSum; Expected: array =  resultSum;
            String preResultMinus = resultEqually.replace("[","");
            String preResultMinusSecond = preResultMinus.replace("]","");
            String preResult = preResultMinusSecond.concat(resultSum);
            result =preResult;
        }



        //result =   //(name of return "for").concat(resultSum);

        return result;
    }
}
