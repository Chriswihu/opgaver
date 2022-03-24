package com.company;

abstract public class AFuelCar extends ACar
{
    protected int kmPrL;
    protected String fuelType;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrL)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrL = kmPrL;
    }

    public abstract String getFuelType();

    public double getKmPrL()
    {
        return kmPrL;
    }

    @Override
    public String toString()
    {
        return null;
    }
}

