void setup() {
  float num = 10;
  println("The number is: " + num);
  randomizer(num);
  println("The number is: " + num);
}

void ranomizer(float newmun) {
  newnum = newnum + random(-2, 2);
  println("The new number is: " + newnum);
}

void setup() {
  println("a");
  funtion1();
  println("b");
}

void draw() {
  println("c");
  funtion2();
  println("d");
  funtion1();
  noLoop();
}

void function1() {
  println("e");
  println("f");
}

void funtion2() {
  println("g");
  funtion1();
  println("h");
}
