package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Car car = new DieselCar("TKD-563","Ford","Fiasta",2,25,false);
        Car car1 = new ElectricCar(400,200,"KSP-572","Tesla","S1",2);
        Car car2 = new GasolineCar("WQA-246","Kia","Picanto",5,11);
        Car car3 = new DieselCar("HGQ-253","Toyota","Yaris",2,25,false);
        Car car4 = new GasolineCar("JKC-723","Mercedes","Jena",4,15);
        Car car5 = new ElectricCar(800,500,"LOB-927","Mercedes","El-Jeep",2);

        FleetOfCars fleetOfCars = new FleetOfCars();
        fleetOfCars.addCar(car);
        fleetOfCars.addCar(car1);
        fleetOfCars.addCar(car2);
        fleetOfCars.addCar(car3);
        fleetOfCars.addCar(car4);
        fleetOfCars.addCar(car5);
        System.out.println(fleetOfCars.toString());
        System.out.println("Total Registration Fee for the entire fleet is: " + fleetOfCars.getTotalRegistrationFeeForFleet());
    }

}
