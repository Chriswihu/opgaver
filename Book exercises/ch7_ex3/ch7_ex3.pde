int x = 0;
int speed = 1;

void setup() {
  size (600,600);
}

void draw() {
  background(255);
  
  x = x + speed;
  
  if ((x > width) || (x < 0)) {
    speed = speed * -1;
  }
  
  stroke(0);
  fill(175);
  ellipse(x, 300, 96, 96);
}
