package com.hillel.lecture_7;

import com.hillel.lecture_2.FormulasTestTask;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Write class to represent FractionNumbers
 * This class should contain two fields.
 * This class should contain methods to perform basic math operations:
 * plus, minus, multiply, divide
 * Also, this class should have toString method to print numbers into standard output
 * Add tests for check functionality of FractionNumber class
 */
public class FractionNumbersTestTask {

    FractionNumber calc = new FractionNumber();

    @Test

     public void sumTwoArgTest(){

        double firstArg =10;
        double secondArg= 5.7;
        double expectedResult =15.7;

        assertEquals(calc.sumTwoArg(firstArg,secondArg),expectedResult);

    }

    @Test

    public void exceptTwoArgTest(){

        /*double firstArg =10;
        double secondArg= 5.7;*/
        double expectedResult = 4.3;

        assertEquals(calc.exceptTwoArg(10,5.7),expectedResult);

    }

    @Test

    public void multiplyTwoArgTest(){

        //double expectedResult = 57;

        assertEquals(calc.multiplyTwoArg(10,5.7),57.0);
    }

    @Test

    public void devideTwoArgTest(){

        assertEquals(calc.devideTwoArg(10,5),2.0);
    }

    @Test

    public void toStringResultTest(){

        assertEquals(calc.toStringResult(15),"Result=15.0");
    }





}
