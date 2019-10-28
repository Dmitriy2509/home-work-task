package com.hillel.lecture_4;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Написать программу, которая считает сумму двух колонок. Если
 * одна из колонок больше, вывести, какая именно больше. Если
 * колонки одинаковы - вывести результат в виде:
 * | row_1 | row_2 | sum |
 * | 2 | 5 | 7 |
 */
public class RowSumTestTask {

    public static void main(String[] args) {

        int [] column1 = { 12, 645, 65, 8763, 1353, 1351, 62};
        int sumOfColumn1 = IntStream.of(column1).sum();
        System.out.println(sumOfColumn1);
        int [] column2 = { 15, 878, 8631, 32, 1237, 781, 125};
        int sumOfColumn2 = IntStream.of(column2).sum();
        System.out.println(sumOfColumn2);
        int sumOfColumns = sumOfColumn1+ sumOfColumn2;
        System.out.println(sumOfColumns);

        if( sumOfColumn2<sumOfColumn1){
            System.out.println("sumOfColumn1 is bigger than sumOfColumn2");
        } else if (sumOfColumn2>sumOfColumn1){
            System.out.println("sumOfColumn2 is bigger than sumOfColumn1 ");
        } else if (sumOfColumn2==sumOfColumn1) {
            System.out.println(sumOfColumn1+ " " + sumOfColumn2 + " " + sumOfColumns );
        }
       // System.out.println(Arrays.toString(column1));
    }



}
