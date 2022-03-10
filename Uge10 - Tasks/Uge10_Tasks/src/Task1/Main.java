package Task1;

public class Main
{
    public static void main(String[] args)
    {
        Driver chris = new Driver("Christoffer", 28);
        Car car = new Car("Volvo", "480", 1993, "Sedan");
        Car car2 = new Car("Nisan", "25", 2005,"Sedan");
        car.setDriver(chris.toString());
        car2.setDriver(chris.toString());
        System.out.println(car);
        System.out.println(car2);
    }
}
