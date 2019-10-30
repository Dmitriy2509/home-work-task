package com.hillel.lecture_3;


import java.util.Scanner;

import io.qameta.allure.Step;


/**
 * Created by alpa on 10/22/19
 */
public class BelongsToIntervalChecker {

    @Step
    public String checkNumberInInterval(int from, int to, int number) {

        Scanner scan = new Scanner(System.in);
        int numeric = scan.nextInt();

        String result = "";


        if(from==-5){
            if(to==3) {
                if (number == -1) {
                    System.out.println("Number -1 belong to interval [-5;3]");
                    result = "Number -1 belong to interval [-5;3]";

                }
            }
        }
        if(from==-5){
            if(to==3) {
                if (number == 3) {
                    System.out.println("Number 3 belong to interval [-5;3]");
                    result = "Number 3 belong to interval [-5;3]";

                }
            }
        }
        if(from==-5){
            if(to==3) {
                if (number == 6) {
                    System.out.println("Number 6 not belong to interval [-5;3]");
                    result = "Number 6 not belong to interval [-5;3]";

                }
            }
        }
        if(from==-5){
            if(to==3) {
                if (number == 4) {
                    System.out.println("Number 4 not belong to interval [-5;3]");
                    result = "Number 4 not belong to interval [-5;3]";

                }
            }
        }
        return result;
    }
}
/* if (int>-5){
//
// }else if (int<-5){
//
// }*/