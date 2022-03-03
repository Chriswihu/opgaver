package com.company;

import java.util.Random;



public class Main {

    public static void main(String[] args)
    {
        //4.a - Parameter for Division, when compared to given Integers:
        System.out.println("\nDividedable by 2: ");
        for(int i = 1; i <= 100; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }

        }

        System.out.println("\n");

        //4.b - adding given array to Main:
        //4.c - return a random element from the previously given array:
        int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
        Random r = new Random();
        int randomNum = r.nextInt(arr.length);
        System.out.println("Random variable \n" + arr[randomNum] + "\n");

        //4.d - add function for running Recursion on a given Integer
        System.out.println("Recursion for a given Integer" + "\n");
        num(8);
    }
    public static void num(int n)
    {
        if(n < 0)
        {
            System.out.println("Done");
        }
        else
        {
            System.out.println(n);
            n--;
            num(n);
        }
    }
}
