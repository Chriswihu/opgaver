public class Datamatik
{
	public static void main(String[] args)
	{
		Teacher tobias = new Teacher("Tobias", 39, false);
		System.out.println(tobias.getName() + " " + tobias.getAge() + " " + tobias.getGender());
        
        Student christian = new Student("Christian", 28, false, 5);
        System.out.println(christian.getName() + " " + christian.getAge() + " " + christian.getGender() + " " + christian.getDatamatikerTeam());
        
        Student niels = new Student("Frederik", 25, false, 3);
        System.out.println(niels.getName() + " " + niels.getAge() + " " + niels.getGender() + " " + niels.getDatamatikerTeam());
	}
}