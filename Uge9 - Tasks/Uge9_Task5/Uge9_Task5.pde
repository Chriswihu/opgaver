//5.a - Creating a double Array, for setting up a matrix like grid:
int[][] board = { {1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8} };

int sideLength = 40;
int i;
int j;

void setup()
{
  //5.b - setting up the Draw space
  size(350, 350);

  //5.c - loop for both arrays, assigning a Variable 0 or 1, differentiating between the two:
  for (int i = 0; i<board.length; i++) {
    for (int j = 0; j<board[i].length; j++) {
      println("board[" + i + "][" + j + "] = "
        + board[i][j]);
    }
  }
}

void draw()
{
  //5.d - drawing each square as their own rect object:
  //5.e - filling in each square, based on their assigned variable, creating the chess board:
  for (int i = 0; i<8; i++) {
    for (int j = 0; j<8; j++) {
      if ((i + j + 1) % 2 == 0) {
        fill(255, 255, 255); // white
      } else {
        fill(0, 0, 0); // black
      }
      rect(i*sideLength, j*sideLength, sideLength, sideLength);
    }
  }
}
