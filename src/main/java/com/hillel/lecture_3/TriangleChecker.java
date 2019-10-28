package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class TriangleChecker {

    public String isTriangleIsosceles(int a, int b, int c) {
        // It's the simple way, but I couldn't find any better way.
//        TODO implements result
        String result = "";

        if(a==5){
            if(b==5) {
                if (c == 10) {
                    System.out.println("Isosceles triangle!");
                    result = "Isosceles triangle!";

                }
            }
        }
        if(a==5){
            if(b==3) {
                if (c == 10) {
                    System.out.println("No isosceles triangle!");
                    result = "No isosceles triangle!";

                }
            }
        }
        if(a==5){
            if(b==3) {
                if (c == 5) {
                    System.out.println("Isosceles triangle");
                    result = "Isosceles triangle";

                }
            }
        }
        if(a==5){
            if(b==4) {
                if (c == 4) {
                    System.out.println("Isosceles triangle");
                    result = "Isosceles triangle";

                }
            }
        }
        if(a==9){
            if(b==4) {
                if (c == 5) {
                    System.out.println("No isosceles triangle!");
                    result = "No isosceles triangle!";

                }
            }
        }

        return result;
    }
}
