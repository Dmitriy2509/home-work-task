package com.hillel.lecture_4;

/**
 * Написать программу, которая выводит все символы (char) в промежутке от 135 до 255
 */
public class PrintCharTestTask {

    public static void main(String[] args) {


        showCharsBetweenTwoNumbers(135,255);

    }
    public static void showCharsBetweenTwoNumbers(int fromTheNumber, int toTheNumber){


        for(int i=fromTheNumber; i<=toTheNumber; i++) {
            System.out.println(i);
        }
    }



}
