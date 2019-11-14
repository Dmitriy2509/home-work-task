package com.hillel.lecture_6;



public class StaticStringMethod {

    String name = new String("Martin");

    int age = 30;

    //String stringAge = String.copyValueOf(age);

    public static void formatString (String[] args, int data){
        String.format("Result %d, %s", 30.0, "Bob");

        String [] students = {"Mark", "Igor", "Anna"};

        String join = String.join(",","Mark", "Igor", "Anna");
        System.out.println("Students: " + join);
        String join1 = String.join(",",students);


    }





}
