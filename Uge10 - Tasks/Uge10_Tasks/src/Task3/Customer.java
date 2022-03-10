package Task3;

public class Customer
{
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    public Customer(String first, String last, String user, int ID)
    {
        this.firstName = first;
        this.lastName = last;
        this.userName = user;
        this.id = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString()
    {
        return "Name: " + firstName + " " + lastName + "\nUsername: " + userName + "\n ID: " + id;
    }
}
