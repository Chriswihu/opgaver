size(800,600);
fill(0);

int startX = 10;
int startY = 10;
int sizeX = 10;
int sizeY = 10;
int distX = 5;
int n = 16;

int posX = startX;
int count = 1;

while(count <= n)
{ 
  rect(posX, startX, sizeX, sizeY);
  posX = posX + sizeX + distX;
  count++;  
}
