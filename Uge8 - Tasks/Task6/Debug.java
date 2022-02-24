/*
 *
 * Hvis du kompilerer programmet får du 7 fejl.
 * Kan du fixe programmet så det kan køre og
 * outputtet bliver:
 * "7 is the smallest!"
 *
 * 
 */
public class Debug {
  public static void main(String[] args) 
  {
    int a = 7;
    int b = 42;
    System.out.println(minimum(a,b) + " is the Smallest");
  }
  public static int minimum(int a, int b) {
    int smaller;
    if(a < b) 
    {
      smaller = a;
    } 
    else 
    {
      smaller = b;
    }
    return smaller;
  }
  
}