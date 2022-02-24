String s = "Press any Key to start.\n Use Left & Right to steer.";

float posX=random(50, 750), posY=random(50, 750);
float xSpeed=0, ySpeed=0;
boolean lost = false;
float prevAngle;

void setup() {
  background(0);
  size(800, 800);
  frameRate(25);
  reset();
}


void draw() {
  posX += xSpeed;
  posY += ySpeed;

  fill(255, 0, 0);
  noStroke();
  ellipse(posX, posY, 15, 15);
  smooth();

  textAlign(CENTER);
  textSize(40);
  fill(255);
  text(s, width/2, 40, 5);


  if (keyPressed == false) {
    fill(255);
  } else {
    fill(0);
  }

  if (keyPressed) {
    if (keyCode == LEFT)
      turnLeft(10);
    else if (keyCode == RIGHT)
      turnRight(10);
  }
  if (posY > height-15) {

    fill(255);
    text("Game Over", width/2, height/2);
    noLoop();
    lost = true;
  }
}
void keyPressed() {
  reset();
  loop();
}

void reset() {
  float posX=random(50, 750), posY=random(50, 750);
  float xSpeed=0, ySpeed=0;
  boolean lost = false;
  float prevAngle;
  
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
