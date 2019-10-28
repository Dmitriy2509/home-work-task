package com.hillel.lecture_4;

public class ForWhile {
    public static void main(String[] args) {

     /*   boolean isStrarted =true;

        while (isStrarted){

            System.out.println("hey");
            isStrarted=false;
            break;



                }*/
     int min =1;
     int max =10;

    /* while(min<=max){

         System.out.println("min: " + min + ", max: " + max);
        // min++;
         max--;

     }*/
        boolean isStrarted =true;
     while(isStrarted){

         System.out.println("min: " + min + ", max: " + max);
         if(min==5){
             isStrarted =false;

         }
         min--;
     }


    }


}
