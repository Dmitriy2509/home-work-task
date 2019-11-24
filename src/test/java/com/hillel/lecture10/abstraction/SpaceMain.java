package com.hillel.lecture10.abstraction;

public class SpaceMain {

    public static void main(String[] args) {

        Space space = new Space();

        space.shape("Round");
        space.weight(550000);
        space.quantityOfComets(9);
        space.diameter(5);
        space.color("Green");
        space.tempereture(-450);


        SunSystem sunSystem = new SunSystem ();

        sunSystem.shape("Elipse");
        sunSystem.weight(250000);
        sunSystem.quantityOfComets(3);
        sunSystem.diameter(2.3);
        sunSystem.color("Orange");
        sunSystem.tempereture(-278);

        Star star= new Star();

        star.shape("Always changes");
        star.weight(27522);
        star.quantityOfComets(0);
        star.diameter(0.123);
        star.color("Black");
        star.tempereture(7200);









    /*
    Space galaxy= new Space();

    galaxy.shape("round");
    galaxy.weight(550000);
    galaxy.diameter(5);
    galaxy.distance(10,2);

    SunSystem sunSystem = new SunSystem();

    sunSystem.quantityOfPlanets(8);
    sunSystem.weight(1.0014);
    sunSystem.quantityDwarfPlanet(5);
    sunSystem.quantityOfSatelites(415);
    sunSystem.quantityOfComets(3441);

    Star star = new Star();

    star.color("orange");
    star.lengthOfWave(5970-6220);
    star.tempereture(7200);
    star.weight(75600000);

    */
    }
}