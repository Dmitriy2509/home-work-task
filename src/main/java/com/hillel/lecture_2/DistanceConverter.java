package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter {

    @Step
    public double metersToInches(double meters) {
//        TODO implements result

        double inches = meters * 39.37;
        //double result = 0.0;
        //return result;
        return inches;
    }

    @Step
    public double inchesToMeters(double inches) {
//        TODO implements result

        double meters = inches/39.37;
        //double result = 0.0;
        return meters;
    }

    @Step
    public double milesToKilometres(double miles) {
//        TODO implements result

        double kilometers = miles * 1.609;
        //double result = 0.0;
        return kilometers;
    }

    @Step
    public double kilometresToMiles(double kilometres) {
//        TODO implements result

        double miles = kilometres / 1.609;
        //double result = 0.0;
        return miles;
    }
}
