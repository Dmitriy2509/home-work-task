package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class LinearEquationChecker {


    @Step
    public int linearEquation(int a, int b) {


//        TODO implements result
        int result = 0;
        if (a == 0 || b == 0) {
            result = 0;

        } else {
            int x = -b / a;
            result = x;
        }

        return result;


    }
}
/*if (a>0 && b>0){
// double x =-b/a;
//result = x;
// } else if (a==0){
// System.out.println("error");
//result =0.0;
// } else if (b==0){
// System.out.println("error");.
//result =0.0;
// }
//return result;
//  }*/