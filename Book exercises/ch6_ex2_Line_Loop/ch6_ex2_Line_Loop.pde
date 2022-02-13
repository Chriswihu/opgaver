size(600,600);
background(255);

int y = 240;
int x = 150;
int spacing = 12;
int len = 60;

int endLegs = 450;

stroke(0);

while (x <= endLegs) {
  line (x, y, x, y+len);
  x = x + spacing;
}
