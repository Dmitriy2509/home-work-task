package com.hillel.lecture_4;

public class Method {
    public static void main(String[] args) {


       /* double result = 25d+273.16;
        System.out.println("Celsius to Kelvin: "+ result);*/
        celsiusToKelvin(10d);
        //metersToKilometers ();
        double kilometers = metersToKilometers(500d);
        distanceCompare(kilometers);

        if (kilometers>0.7){

            System.out.println("Correct distance!");
        }else if(kilometers<0.5){
            System.out.println("Excellent distance!");

        }
        else{
            System.out.println("Bad distance!");
        }
        System.out.println(kilometers);

    }

    public static void  celsiusToKelvin(double celsius) {
        double result = celsius + 273.16;
        System.out.println("Celsius to Kelvin: "+ result);

    }

    public static double metersToKilometers (double meters){
        double result = meters/1000d;
        System.out.println("Meters to kilometers: "+ result);

        return result;
    }

    public static String distanceCompare(double kilometers){
        String message;

        if (kilometers>0.7){

            message ="Correct distance!";
        }else if(kilometers<0.5){
            message="Excellent distance!";

        }
        else{
            message="Bad distance!";
        }
       return  message;
    }

}
