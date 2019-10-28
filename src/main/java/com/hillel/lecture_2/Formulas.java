package com.hillel.lecture_2;

import static java.lang.Math.E;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    public double calculate9Formula(double x) {
        // double result = 0.0;
//        TODO implement formula 9

        double yFirst = Math.pow(1.1d *E, -x) + Math.abs(Math.cos(Math.sqrt(Math.PI*x)))-3d/8d;
        //Math.pow(1.1e, -x)
        return yFirst;
    }

    public double calculate10Formula(double x) {
        //double result = 0.0;
//        TODO implement formula 10
        double ySecond = 1d/3d * Math.sqrt(Math.abs(Math.sin(x )))*Math.cbrt(Math.pow(E , 0.12d*x));
        return ySecond;
    }

    public double calculate11Formula(double x) {
        // double result = 0.0;
        double yThird = 2d*Math.PI*x-Math.abs(Math.sin(Math.sqrt(10.5d*x)))*1d/Math.cbrt(Math.pow(x,2d))+1d/7d;
//        TODO implement formula 11
        return yThird;
    }

    public double calculate12Formula(double x) {
        //double result = 0.0;
//        TODO implement formula 12
        double yForth = Math.log(Math.sqrt(Math.abs(2d-x))+1.2d)*1d/2d+ Math.pow(E, -x)+  Math.cbrt(2d/x);
        return yForth;
    }

    public double calculate13Formula(double x) {
        //double result = 0.0;
//        TODO implement formula 13
        double yFifth = Math.pow(Math.pow(E, -2d + x), 1/5) * 1/Math.sqrt(Math.pow(x, 2)+Math.pow(x, 4)+ Math.log(Math.abs(x-3.14)));
        return yFifth;
    }
}
