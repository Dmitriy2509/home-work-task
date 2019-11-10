package com.hillel.lecture_7;

/**
 * Created by alpa on 11/8/19
 */
public class FractionNumber {

    public static void main(String[] args) {
        sumTwoArg(10,5.7);
        exceptTwoArg(10,5.7);
        multiplyTwoArg(10,5.7);
        devideTwoArg(10,5.7);
        toStringResult(12.5);


    }


    public static double sumTwoArg (double firstArg, double secondArg){

        double result =  firstArg + secondArg;
        System.out.println("Result of sumTwoArg= " +result);
        return result;
    }

    public static double exceptTwoArg (double firstArg, double secondArg){

        double result =  firstArg - secondArg;
        System.out.println("Result of exceptTwoArg= " +result);
        return result;

    }

    public static double multiplyTwoArg (double firstArg, double secondArg){

        double result =  firstArg * secondArg;
        System.out.println("Result of multiplyTwoArg= " +result);
        return result;
    }

    public static double devideTwoArg (double firstArg, double secondArg){

        double result =  firstArg / secondArg;
        System.out.println("Result of devideTwoArg= " +result);
        return result;
    }

    public static String toStringResult (double result) {

        //String    changeToString  = " ";

        String changeToString = String.valueOf(result);
        System.out.println(changeToString);

        return changeToString;
    }


}
