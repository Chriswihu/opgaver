public class Teacher
{
	
	// Object variables
	private String name;
	private int age;
	private boolean isFemale;

	// Constructor

	public Teacher (String tmpName, int tmpAge, boolean tmpIsFemale)
	{
		this.name = tmpName;
		this.age = tmpAge;
		this.isFemale = tmpIsFemale;
	}

	// Methods
    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public boolean getGender()
    {
        return this.isFemale;
    }
}
