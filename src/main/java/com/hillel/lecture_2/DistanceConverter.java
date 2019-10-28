package com.hillel.lecture_2;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter {

    public double metersToInches(double meters) {
//        TODO implements result

        double inches = meters * 39.37;
        //double result = 0.0;
        //return result;
        return inches;
    }

    public double inchesToMeters(double inches) {
//        TODO implements result

        double meters = inches/39.37;
        //double result = 0.0;
        return meters;
    }

    public double milesToKilometres(double miles) {
//        TODO implements result

        double kilometers = miles * 1.609;
        //double result = 0.0;
        return kilometers;
    }

    public double kilometresToMiles(double kilometres) {
//        TODO implements result

        double miles = kilometres / 1.609;
        //double result = 0.0;
        return miles;
    }
}
