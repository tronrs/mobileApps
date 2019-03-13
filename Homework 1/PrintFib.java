/*
Ryan Citron
Mobile Applications
7/11/2018
Homework 1
*/

import java.util.Scanner;
/** This class prints out the Fibonacci sequence to all numbers greater than 2. It uses a scanner to receive the total number of prints the user would like to see. We also use a seperate function to go through the Fibonacci sequence.*/
public class PrintFib{

	public static void main(String[] args){

		// First integer of the sequence
		final int FIB_ZERO = 0;
		// Second integer of the sequence
		final int FIB_ONE = 1;
		// Create a new scanner for input
		Scanner input = new Scanner(System.in);
		// Keeps track of the Fibonacci value
		int fibValue = 1;
		// Keeps track of the last Fibonacci value
		int fibLast = 0;

    System.out.println("How many Fibonacci numbers would you like to see?");

		// Get the next integer input
		int n = input.nextInt();

		// Print out the first two numbers in the sequence
		if(n > 0)System.out.println(FIB_ZERO);
		if(n > 1)System.out.println(FIB_ONE);
		// Prints out the rest of the sequence using the fib method
		for(int i = 2; i < n; i++){
			System.out.println(fib(i));
		}

	}
	/** Quick recursive method to get the value of the Fibonacci sequence.*/
	public static int fib(int n){
	    if(n < 2) return n;
		return fib(n-1) + fib(n-2);
	}
}

/*

Ryans-MacBook-Pro:Homework 1 tronrs$ java PrintFib
How many Fibonacci numbers would you like to see?
5
0
1
1
2
3
Ryans-MacBook-Pro:Homework 1 tronrs$ java PrintFib
How many Fibonacci numbers would you like to see?
10
0
1
1
2
3
5
8
13
21
34

*/
