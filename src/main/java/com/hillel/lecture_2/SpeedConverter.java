package com.hillel.lecture_2;

/**
 * Created by alpa on 10/17/19
 */
public class SpeedConverter {

    public double speedKmToMi(double speedKm) {
//        TODO implements result

        double miles = speedKm * 0.62139999999999995;
        //double result = 0.0;
        return miles;
    }

    public double speedMiToKm(double speedMi) {
//        TODO implements result

        double kilometers = speedMi * 1.60926939169617;
        //double result = 0.0;
        return kilometers;
    }

}
