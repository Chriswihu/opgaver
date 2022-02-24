public class Person 
{
	//1. Fields
	private String firstName;
	private String lastName;
	private int age;

	//constructor
	public Person(String fn, String ln, int ag)
	{
	this.firstName = fn;
	this.lastName = ln;
	this.age = ag;
	}

	//3. methods
	public String getFullName()
	{
		return this.firstName + " " + lastName;
	}

	public String getFirstName()
	{
		return this.firstName;
	}

	public String getLastName()
	{
		return this.lastName;
	}

	public void changeName(String newFirstName, String newLastName)
	{
		this.firstName = newFirstName;
		this.lastName = newLastName;
	}
	public int getAge()
	{
		return this.age;
	}
}