package com.hillel.Lecture7;

public class Phone {

    private String model;
    private String brand;
    private String os;
    private double width;
    private double height;
    private int  weight;


    public Phone(String model, String brand, String os, double width, double height, int weight) {
        this.model = model;
        this.brand = brand;
        this.os = os;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public Phone(){

    }

    public Phone(String brand){
    this.brand=model;

    }

    public String getModel(){

        return  this.model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setModel(String model){

        this.model= model;



    }

    public void call(){
        System.out.println("I call You from my " + model);
    }
    @Override
    public String toString() {
        return  "Phone(brand=" + brand+")";
    }
}
