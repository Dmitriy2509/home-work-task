package com.hillel.lecture_4;

/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {

    public static void main(String[] args) {

        for( double i = 0; i <= 360; i = i+ 10 ){

            System.out.println("sin " + i + "" + " = " +Math.sin(i));

            }
        }
    }
// Result isn't correct, but I can't change it.




