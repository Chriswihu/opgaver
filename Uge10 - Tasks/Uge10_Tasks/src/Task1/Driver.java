package Task1;

public class Driver
{
    private String Name = "";
    private int Age = 0;

    public Driver(String name, int age)
    {
        this.Name = name;
        this.Age = age;
    }

    @Override
    public String toString()
    {
        return "Is driven by:\nName: " + Name + "\nAge: " + Age + "\n";
    }

}


