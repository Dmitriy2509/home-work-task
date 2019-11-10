package com.hillel.Lecture7;

public class Lecture7 {

    public static void main(String[] args) {

        Phone IPhone = new Phone("Iphone");

       /* Object object = new Object();
        object.equals();
        object.toString();
        object.hashCode();*/
        IPhone.call();

        IPhone.setBrand("IPhone");
        IPhone.setModel("11 Pro");
        IPhone.setModel("IOS");
        IPhone.setHeight(300);
        IPhone.setWeight(200);

        //System.out.println(Phone.);



        //System.out.println(IPhone.getModel(IPhone.getModel()));


        Phone samsung = new Phone();

        samsung.setBrand("IPhone");
        samsung.setModel("11 Pro");
        samsung.setModel("IOS");
        samsung.setHeight(45);
        samsung.setWeight(20);

        System.out.println(samsung.getModel());





    }
}
