package com.hillel.lecture10;

public class ClassTest {
    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        simpleCalculator.plus(15.0,3.5);
        simpleCalculator.minus(15.0,3.5);
        simpleCalculator.multiply(15.0,3.5);
        simpleCalculator.divide(15.0,3.5);
        simpleCalculator.sqrt(16.0);

        FinanceCalculator financeCalculator = new FinanceCalculator();

        financeCalculator.convertUsdToUah(27.2);
        financeCalculator.creditCalculator(23000.75);

        BookkeepingCalculator bookkeepingCalculator = new BookkeepingCalculator();
        bookkeepingCalculator.salaryOfEmployee(10000, 15);
        bookkeepingCalculator.tax(10000);

        EngineerCalculator engineerCalculator = new EngineerCalculator();
        engineerCalculator.valueOfCos(90);
        engineerCalculator.valueOfSin(90);
        engineerCalculator.kilogramsToPounds(50);
        engineerCalculator.poundsToKilograms(50);

        ProgrammableCalculator programmableCalculator = new ProgrammableCalculator();
        programmableCalculator.rasingToPower(8,4);
        programmableCalculator.sumOfNumbers(2,15,17.85,1025.43,5907.65);

    }
}
