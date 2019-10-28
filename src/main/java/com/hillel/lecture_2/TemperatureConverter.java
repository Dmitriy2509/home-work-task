package com.hillel.lecture_2;

/**
 * Created by alpa on 10/17/19
 */
public class TemperatureConverter {

    public double celsiusToFahrenheit(double celsius) {
//       TODO implements result Convert Celsius to Fahrenheit

        double fahrenheit = celsius*9/5 + 32;
        //double result = 0.0;
        return fahrenheit;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
//        TODO implements result convert Fahrenheit to Celsius

        double celsius = (fahrenheit - 32) * 5 / 9;
        //double result = 0.0;
        return celsius;
    }

    public double celsiusToKelvin(double celsius) {
//        TODO implements result convert Celsius to Kelvin

        double kelvin = celsius + 273.16;
        //double result = 0.0;
        return kelvin;
    }
}
