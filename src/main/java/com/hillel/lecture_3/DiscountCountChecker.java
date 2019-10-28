package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class DiscountCountChecker {

    public double checkDiscountCount(double price) {

//        TODO implements result
        double result = 0.0;
        if (price>=1000){
            price= price *0.85;
            System.out.println("скидка 15%");
            result =price;
        } else {
            System.out.println("скидка не предоставляется");

        }
        return result;
    }
}
