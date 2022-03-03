void setup()
{
  //4.e - creating a function for to Integer Variables, running through a Fibinacci sequence:
  Fibonacci(1, 1);
}

void Fibonacci(int a, int b)
{
  int sum = a + b;
  a = b;
  System.out.print(sum + " ");
  if (sum < 10000)
  {
    Fibonacci(a, sum);
  }
}
