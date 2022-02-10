int x = (int)random(1,31);
int y = (int)random(1,31);
int z = (int)random(1,31);

void setup() {
  if ((x+y+z) == 30) {
    println("Success!");
  } else if (x == 10 || x == 20 || x == 30) {
    println("Failure!");
  } else if (y == 10 || y == 20 || y == 30) {
    println("Failure!");
  } else if (z == 10 || z == 20|| z == 30) {
    println("Failure!");
  } else if ((x+y+z) != 30) {
    println("Failure!");
  }
  println(x);
  println(y);
  println(z);
}
