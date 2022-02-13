size(800,600);  
fill(0);

int startX = 5;
int startY = 5;
int w = 20;
int u = 10;
int space = 5;
int n = 10;

for (int i = 0; i <= n; ++i) 
{
  for (int j = 0; j <= i; ++j) 
  {
    rect (startX + (i-1) * (w+space), startY + (j-1) * (u + space), w, u);
  }
 
}
