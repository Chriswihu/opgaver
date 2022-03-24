package com.company;

public class GasolineCar extends AFuelCar
{
    private int fee;

    protected GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrL) {
        super(registrationNumber, make, model, numberOfDoors, kmPrL);
    }

    @Override
    public String getFuelType()
    {
        return "GasolineCar";
    }
    public int getRegistrationFee()
    {
        if (kmPrL > 20 && kmPrL < 50)
        {
            return fee = 330;
        }
        else if (kmPrL > 15 && kmPrL < 20)
        {
            return fee = 1050;
        }
        else if(kmPrL > 10 && kmPrL < 15)
        {
            return fee = 2340;
        }
        else if(kmPrL > 5 && kmPrL < 10)
        {
            return fee = 5500;
        }
        else if(kmPrL > 5)
        {
            return fee = 10470;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "GasolineCar{" +
                "Make = " + Make + "\n" +
                "Model = " + Model + "\n" +
                "Number of doors = " + NumberOfDoors + "\n";
    }
}
