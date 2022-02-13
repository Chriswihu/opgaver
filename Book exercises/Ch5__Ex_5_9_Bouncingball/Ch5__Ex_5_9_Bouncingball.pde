// Exercise 5-9: Rewrite Example 5-6 so that the ball not
// only moves horizontally, but vertically as well.
// Can you implement additional features, such as changing
// the size or color of the ball based on certain
// conditions?
// Can you make the ball speed up or slow down in
// addition to changing direction?

float x = 0;
float speed = 1;

void setup() {
  size(200, 200);
}

void draw() {
  background(255);

  // Tilføj den aktuelle hastighed til x-placeringen.
  x = x + speed;

  // Husk, || betyder "eller".
  if ((x > width) || (x < 0)) {
    // Hvis objektet når en af kanterne, ganges hastigheden med -1.2 for at vende den rundt 20% hurtigere.
    speed = speed * -1.2;
  }

  // Vis cirkel på x placering
  stroke(255);
  fill(0);
  ellipse(x, 100, 32, 32);
}
