package com.hillel.lecture_4;

public class ForContinueLoopExample {
    public static void main(String[] args) {
        String [] students = {"Steve", "Igor", "Anna", "Viktor", "Bob"};

        for(int i =0; i<students.length; i=i+2){
            System.out.println("i:"+i);
            String student = students[i];
            System.out.println("Student: " + students[i]);
            if (student.equals("Viktor")){
                continue;

            }
        }
        }
}
