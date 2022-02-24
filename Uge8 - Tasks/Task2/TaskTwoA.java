class Main{
  public static boolean happy = true;

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   { 
     System.out.println("I don't clap my hands"); 
   }
   upperCase("Hallo!");
   isItUpperCase("Christian");
}


public static boolean iAmHappy()
{
  return happy;
}
//2.b Write a function of two Integers and return their Sum.
public static int getSum(int a, int b) {
  return a + b;
}
// 2.c Write a function that takes a String and returns it in all Uppercase.
public static String upperCase (String text){
  String answer = text.toUpperCase();
  System.out.println(answer);
  return answer;
}
// 2.d Write a function that takes a String and returns true, if the First Letter is uppercase.
public static boolean isItUpperCase (String text) {
  if(Character.isUpperCase(text.charAt(0))){
    System.out.println("The first letter in the Word "+ text +" is an Uppercase");
    return true;
  }
  return false;
}
}


