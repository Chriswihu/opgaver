int input = 0;
int inputMinus = -20;
int halfPos = (input/2);
int halfMin = (inputMinus/2);
String six = "six";
String half2 = "half";

void setup() {
  for (int i = 0; i <= input; i++)
    if ( i == 6) {
      println(six);
    } else if (halfPos == i) {
      println(half2);
    } else {
      println(i);
    }
for (int o = 0; o >= inputMinus; o--)
  if ( o == -6) {
    println(six);
  } else if (halfMin == o) {
    println(half2);
  } else {
    println(o);
  }
}
