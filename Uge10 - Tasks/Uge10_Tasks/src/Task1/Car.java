package Task1;

public class Car
{
    private String Make;
    private String Model;
    private int Year;
    private String Body;
    private String Driver;

    public Car(String make, String model, int year, String body)
    {
        this.Make = make;
        this.Model = model;
        this.Year = year;
        this.Body = body;
    }

    public String getDriver()
    {
        return Driver;
    }
    public void setDriver(String newDriver)
    {
        this.Driver = newDriver;
    }

    @Override
    public String toString()
    {
        return "Make: " + Make + "\nModel: " + Model + "\nYear: " + Year + "\nBody: " + Body + "\n\n" + Driver;
    }
}
