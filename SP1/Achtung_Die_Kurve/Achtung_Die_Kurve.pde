boolean dead;

float posX=random(15, 785), posY=random(15, 785);
float xSpeed=0, ySpeed=0;

float prevAngle;


void setup() {
  background(0);
  size(800, 800);
  frameRate(25);
  /*
  stroke(0, 0, 0);
   rect(5, 5, 490, 490);
   
   dead = false;
   */
}

void draw() {

  /*dead = get((int)posX, (int)posY);
   if (!dead) {
   point(posX, posY);
   } else {
   text("Game Over", 350, 350);
   */

  posX += xSpeed;
  posY += ySpeed;

  fill(255, 0, 0);
  noStroke();
  ellipse(posX, posY, 15, 15);
  smooth();

  if (keyPressed) {
    if (keyCode == UP) {
      xSpeed = 3;
      ySpeed = 3;
    }
  }

  if (keyPressed) {
    if (keyCode == LEFT)
      turnLeft(10);
    else if (keyCode == RIGHT)
      turnRight(10);
  }
  if (posY > height || width < posX) {
    posY = height;
    textAlign(CENTER);
    textSize(50);
    fill(255);
    text("Game Over", width/2, height/2);
  }
}

void turnRight(float angle) {
  float angle2 = radians(angle) + prevAngle;
  prevAngle = angle2;
  xSpeed = cos(angle2) * 3;
  ySpeed = sin(angle2) * 3;
}

void turnLeft(float angle) {
  float angle2 = prevAngle - radians(angle);
  prevAngle = angle2;
  xSpeed = cos(angle2) * 3;
  ySpeed = sin(angle2) * 3;
}
