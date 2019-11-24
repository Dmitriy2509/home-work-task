package com.hillel.lecture10;

public class SimpleCalculator extends CalculatorAbstaract {

    double a =15.0;
    double b = 3.5;

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
}
