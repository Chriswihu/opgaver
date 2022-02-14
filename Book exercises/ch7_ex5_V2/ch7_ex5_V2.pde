void drawCar(int x, int y, int theSize, color c) {
  int offset = theSize/4;
  rectMode(CENTER);
  stroke(200);
  fill(c);
  rect(x, y, theSize, theSize/2);
  
  fill(200);
  rect(x - offset, y - offset, offset, offset/2);
  rect(x + offset, y - offset, offset, offset/2);
  rect(x - offset, y + offset, offset, offset/2);
  rect(x + offset, y + offset, offset, offset/2);
} 

void setup() {
  size(600,600);
}

void draw() {
  background(255);
  drawCar(300, 300, 192, color(200,200,0));
  drawCar(150, 225, 96, color(0,200,100));
  drawCar(240, 525, 120, color(200,0,0));
}
