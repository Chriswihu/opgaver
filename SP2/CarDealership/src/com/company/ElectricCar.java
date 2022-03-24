package com.company;

public class ElectricCar extends ACar
{
    private int batteryCapacity;
    private int maxRange;
    private int kmPrL = 0;
    private int whPrKm;
    private int fee;

    public ElectricCar(int batteryCapacity, int maxRange,String registrationNumber,String make,String model,int numberOfDoors)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWH()
    {
        return batteryCapacity;
    }

    public int getMaxRange()
    {
        return maxRange;
    }

    public int getWhPrKm()
    {
        return batteryCapacity / maxRange;
    }

    public double getKmPrL()
    {
        return (getWhPrKm()/91.25)/100;
    }

    public int getRegistrationFee()
    {
        if (getKmPrL() > 20 && getKmPrL() < 50)
        {
            fee = 330;
        }
        else if (getKmPrL() > 15 && getKmPrL() < 20)
        {
            fee = 1050;
        }
        else if (getKmPrL() > 10 && getKmPrL() < 15)
        {
            fee = 2340;
        }
        else if (getKmPrL() > 5 && getKmPrL() < 10)
        {
            fee = 5500;
        }
        else if (getKmPrL() < 5)
        {
            fee = 10470;
        }
        return fee;
    }

    @Override
    public String toString()
    {
        return "ElectricCar{" +
                "Battery Capacity = " + batteryCapacity + "\n" +
                "Max Range = " + maxRange + "\n" +
                "Make = " + Make + "\n" +
                "Model = " + Model + "\n" +
                "Number of doors = " + NumberOfDoors + "\n";
    }
}
