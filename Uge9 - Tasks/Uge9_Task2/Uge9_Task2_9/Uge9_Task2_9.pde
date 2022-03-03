boolean jobsDone = true;

void setup()
{
  int myArray[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1};
  print(getSumOfAllElementsInArray(myArray));

  if (isJobDone())
  {
    println("\n" + "Job's done!");
  }
}

boolean isJobDone()
{
  return jobsDone;
}

int getSumOfAllElementsInArray(int[] arr)
{
  int sum = 0;
  //add -1 to the end of arr.lenght, since arrays start a 0:
  for (int i = 0; i <= arr.length-1; i++)
  {
    sum += arr[i];
  }
  return sum;
}
