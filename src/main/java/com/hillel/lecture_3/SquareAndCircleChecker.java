package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";

        if (circleArea<squareArea) {
            System.out.println("The circle is in the square");
            result = "The circle is in the square";
        } else if (circleArea>squareArea){
            System.out.println("The circle is not in the square");
            result = "The circle is not in the square";
        }
        return result;
    }


    @Step

    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";

        if (circleArea>squareArea) {
            System.out.println("The square is in the circle");
            result = "The square is in the circle";
        } else if (circleArea<squareArea){
            System.out.println("The square is not in the circle");
            result = "The square is not in the circle";
        }

        return result;
    }

}
