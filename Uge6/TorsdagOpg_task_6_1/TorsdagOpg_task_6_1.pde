int a = (int)random(11);
int b = (int)random(11);
String result = "";


void setup() {
  if (a == 10 || b == 10 || a+b == 10) {
    result = " Success";
   
  } else {
    result = "Failure";
    
  }
  println(a);
  println(b);
  println(result);
}
