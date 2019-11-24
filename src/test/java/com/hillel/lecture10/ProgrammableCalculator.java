package com.hillel.lecture10;

public class ProgrammableCalculator extends CalculatorAbstaract {

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

    public void rasingToPower (double number, double power){

        double result = Math.pow(number, power);
        System.out.println("number "+ number+ " in power "+ power + " = " + result);

    }

    public void sumOfNumbers (double a, double b, double c, double d, double e){

        double sum =a+b+c+d+e;
        System.out.println("a"+"+b"+ "+c"+"+d"+"+e=" + sum);

    }


}
