public class Datamatik
{
    //5.a - Creating the String Array with 10 names given in the Array, called Student.
    public static String [] students = {"Tobias", "Christian", "Nikolaj", "Chris", "Mathilde", "Per", "Sofie", "Siri", "John", "Gustav"};
    {
        System.out.println(students);
    }

    //5.b - Return the Array name based on it's indexed position.
    public static void main(String[] args)
    {
        getStudentName(students, 2);
        int num= getIndex(students, "Chris");
        System.out.println(num);
    }

    //5.c - Return the index position of a name, by going through the list of Students.
    public static void getStudentName(String[] students, int s)
        {

           System.out.println(students[s]);

        }
        public static int getIndex(String[] students, String k)
        {
            for(int i = 0; i < students.length; i++)
            {
                if(students[i]==k)
                {
                    return i;
                }
            }
            return 0;
        }

}