package com.hillel.lecture_6;

public class SimplestCalc {

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

    public static void exceptTwoArg (double firstArg, double secondArg){

        double result =  firstArg - secondArg;
        System.out.println("Result of exceptTwoArg= " +result);

    }

    public static void multiplyTwoArg (double firstArg, double secondArg){

        double result =  firstArg * secondArg;
        System.out.println("Result of multiplyTwoArg= " +result);

    }

    public static void devideTwoArg (double firstArg, double secondArg){

        double result =  firstArg / secondArg;
        System.out.println("Result of devideTwoArg= " +result);

    }

    public static String toStringResult (double result) {

        //String    changeToString  = " ";

        String changeToString = String.valueOf(result);
        System.out.println(changeToString);

        return changeToString;
    }


}
