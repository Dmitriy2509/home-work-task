package com.hillel.lecture10.abstraction;

public class Star extends SpaceAbstract {

    @Override
    public void shape(String a) {
        System.out.println("Shape is "+ a);
    }

    @Override
    public void weight(double weight) {
        System.out.println("Weight of this sunsystem is "+ weight + " M");
    }

    @Override
    public void quantityOfComets(double quantity) {
        System.out.println("This sunsystem has "+ quantity+ " comets");
    }

    @Override
    public void diameter(double light) {
        light = 5;
        System.out.println("Diameter of this galaxy is "+ light + " kiloparsek");

    }

    @Override
    public void color(String color) {
        System.out.println("Color of this planet is "+ color);
    }

    @Override
    public void tempereture(double temp) {
        System.out.println("Temperature of this planet is "+ temp);
    }
}
