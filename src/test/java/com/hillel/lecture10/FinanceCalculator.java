package com.hillel.lecture10;

public class FinanceCalculator extends CalculatorAbstaract {


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

    public void creditCalculator(double lendMoney){
        //
        double payBack = lendMoney + lendMoney*0.62;
        System.out.println("If You want to take " + lendMoney+ " You will have to pay " + payBack+ " UAH"  +" until this date of next year");

    }
    // help to understand how much You will pay for goods on the foreign website

    public void convertUsdToUah(double usd){

        double uah = usd * 24.3;

        System.out.println("If You want to buy it, You will have to pay " + uah + " UAH");

    }

}
