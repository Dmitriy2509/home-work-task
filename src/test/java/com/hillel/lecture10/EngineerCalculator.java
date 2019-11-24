package com.hillel.lecture10;

import io.qameta.allure.Step;

public class EngineerCalculator extends CalculatorAbstaract {

    @Override
    public void plus(double a, double b) {
        System.out.println("a+b=" + (a+b));

    }

    @Override
    public void minus(double a, double b) {
        System.out.println("a-b="+ (a-b));

    }

    @Override
    public void multiply(double a, double b) {
        System.out.println("a*b=" + (a*b));
    }

    @Override
    public void divide(double a, double b) {
        System.out.println("a/b=" + (a/b));

    }

    @Override
    public void sqrt(double a) {
        System.out.println(Math.sqrt(a));


        }
    public void valueOfCos  (double degree) {

        double cosOfAngle = Math.cos(degree);

        System.out.println("cos "+ degree+ " = " + cosOfAngle);

    }
    public void valueOfSin (double degree){

        double sinOfAngle = Math.sin(degree);

        System.out.println("sin "+ degree+ " = " + sinOfAngle);
    }

    public void kilogramsToPounds(double kilograms) {
//

        double pounds = kilograms * 2.20462;
        System.out.println(kilograms + " kilograms = "+ pounds+ " pounds");
    }


    public void poundsToKilograms(double pounds) {


        double kilograms = pounds / 2.20462;
        System.out.println(pounds + " pounds = "+ kilograms+ " kilograms");
    }


}
