int clrRed = color(255, 0, 0);
int clrYellow = color(255, 240, 0);
int clrGreen = color(0, 255, 0);
int clrGrey = color(127, 127, 127);

int caseCount = 1;

void setup() {
  background(255);
  size(700, 450);
}

void draw() {
  background(255);

  rectMode(CENTER);
  ellipseMode(CENTER);

  switch(caseCount) {
  case 1:
    delay(1000);
      fill(0);
    rect(350, 225, 125, 275);
    fill(clrRed);
    ellipse(350, 140, 75, 75);
    fill(clrGrey);
    ellipse(350, 225, 75, 75);
    fill(clrGrey);
    ellipse(350, 310, 75, 75);
    caseCount = 2;
    break;

  case 2:
    delay(1000);
      fill(0);
    rect(350, 225, 125, 275);
    fill(clrRed);
    ellipse(350, 140, 75, 75);
    fill(clrYellow);
    ellipse(350, 225, 75, 75);
    fill(clrGrey);
    ellipse(350, 310, 75, 75);
    caseCount = 3;
    break;

  case 3:
    delay(1000);
      fill(0);
    rect(350, 225, 125, 275);
    fill(clrGrey);
    ellipse(350, 140, 75, 75);
    fill(clrGrey);
    ellipse(350, 225, 75, 75);
    fill(clrGreen);
    ellipse(350, 310, 75, 75);
    caseCount = 1;
    break;
  }
}
