size(600,600);
background(255);

float w = 30;

while(width > w) {
  stroke(0);
  
  fill(0 + w);
  //ellipseMode(CORNER);
  ellipse(300, 300, 600-w, 600-w);
  
  w = w + 30;
}
