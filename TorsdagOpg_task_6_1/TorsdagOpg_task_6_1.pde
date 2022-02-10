int a = (int)random(11);
int b = (int)random(11);



void setup() {
  if (a == 10 || b == 10 || a+b == 10) {
    println("Success!");
    println(a);
    println(b);
  } else {
    println("Fail!");
    println(a);
    println(b);
  }
}
