public class Main 
{ 
	public static void main(String[] args)
	{
		Person christoffer = new Person("Christoffer", "Humlebaek", 28);
		System.out.println("Hello, my name is " + christoffer.getFullName() + ", I am " + christoffer.getAge() + " years old.");

	}
}