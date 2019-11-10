package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result
        boolean isValid = false;



        char[] lower = code.toCharArray();
        for(int i=0; i < lower.length; i++){


            if(Character.isLowerCase( lower[i])){
                return isValid;
        }

        String[] parts = code.split(" ");
        String part1 = parts[0];
        part1 = part1.replaceAll("[^0-9]", "");
        String part2 = parts[1];

        char[] charPart1 = part1.toCharArray();

        String first = Character.toString(charPart1[0]);
        String second = Character.toString(charPart1[1]);
        String third = Character.toString(charPart1[2]);
        String forth = Character.toString(charPart1[3]);
        String fifth = Character.toString(charPart1[4]);
        String sixth = Character.toString(charPart1[5]);



        String firstFactor = first + second;
        String secondFactor = third + forth;
        String thirdFactor = fifth + sixth;

        int z = Integer.parseInt(firstFactor);
        int x = Integer.parseInt(secondFactor);
        int q = Integer.parseInt(thirdFactor);
        int k = z * x * q;
        String res = Integer.toString(k);

        if (res.equals(part2)){
            isValid = true;

        return isValid;
    }
}


        return isValid;
    }
}
