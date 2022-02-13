size(600,600);
background(255);

for (int w = 30; w < 601; w = w + 30) {
  stroke(0);
  
  fill(0 + w);
  
  ellipse(300, 300, 600-w, 600-w);
}
