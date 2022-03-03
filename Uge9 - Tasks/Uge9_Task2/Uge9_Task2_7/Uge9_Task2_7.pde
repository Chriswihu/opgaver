boolean jobsDone = true;
int sum;
//moved the declaration of the sum as an Integer, to the top as a global varible:

void setup()
{
  int myArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
  println(getSumOfElementsInArray(myArray));

  if (isJobDone())
  {
    println("Job's done!");
  }
}

int getSumOfElementsInArray(int[] arr)
{
  for (int i = 0; i < arr.length; i++)
  {
    sum = arr[i];
  }
  return sum;
}

boolean isJobDone()
{
  return jobsDone;
}
