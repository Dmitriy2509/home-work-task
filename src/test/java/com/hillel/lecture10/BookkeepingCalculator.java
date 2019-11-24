package com.hillel.lecture10;

public class BookkeepingCalculator extends CalculatorAbstaract{

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

    public void salaryOfEmployee (double salary, double workDays){

        double salaryForMonth = (salary/21)*workDays;
        System.out.println("Your salary for this month: " + salaryForMonth);

    }

    public void tax(double salary){

            double payTax = salary* 0.195;

        System.out.println("You tax is " + payTax );
    }

}
