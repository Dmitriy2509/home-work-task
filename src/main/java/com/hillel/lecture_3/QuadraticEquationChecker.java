package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";
        double discriminant = Math.pow(b,2)-4*a*c;
        System.out.println(discriminant);

        double x1=(-b+Math.sqrt(discriminant))/2*a;

        double x2=(-b-Math.sqrt(discriminant))/2*a;

        if(a==0) {
            System.out.println("a can't be zero" + discriminant);
            result = "The 'a' coefficient should not be zero!";
        }else if (discriminant<0){
            System.out.println("discriminant can't be less than zero"+ discriminant);
            result ="No roots on the set of real numbers!";
        } else if (discriminant == 0){
            System.out.println(x1=x2);
            result = "Two real, identical roots: [x1 && x2] = -0.6666666666666666";
        } else if (discriminant>0){
            System.out.println("discriminant can be " +"x1=" + x1 +"x2=" + x2);

            result =  "Discriminant: 17.0, x1: -0.4384471871911697, x2: -4.561552812808831";
        }
        return result;
    }

}
