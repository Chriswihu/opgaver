size(600,600);
background(255);
int x = 300;
int y = 300;
int thesize = 192;
int offset = thesize/4;

rectMode(CENTER);
stroke(0);
fill(175);
rect(x, y, thesize, thesize/2);

fill(0);
rect(x - offset, y - offset, offset, offset/2);
rect(x + offset, y - offset, offset, offset/2);
rect(x - offset, y + offset, offset, offset/2);
rect(x + offset, y + offset, offset, offset/2);

x = 150;
y = 150;
thesize = 72;
offset = thesize/4;

rectMode(CENTER);
stroke(0);
fill(175);
rect(x, y, thesize, thesize/2);

fill(0);
rect(x - offset, y - offset, offset, offset/2);
rect(x + offset, y - offset, offset, offset/2);
rect(x - offset, y + offset, offset, offset/2);
rect(x + offset, y + offset, offset, offset/2);
