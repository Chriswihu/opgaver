boolean button = false;

int x = 150;
int y = 150;
int w = 300;
int h = 225;

void setup() { 
  size(600,600);
}

void draw() {
  if (mouseX > x && mouseX < x+w && mouseY > y && mouseY < y+h && mousePressed) {
    button = true;
  } else {
    button = false;
  }
  
  if (button) {
    background(255);
    stroke(0);
  } else {
    background(0);
    stroke(255);
  }
  
  fill(175);
  rect(x,y,w,h);
  
}
