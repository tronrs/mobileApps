/*
Ryan Citron
7/18/2018
Mobile Applications
Homework 3
*/

import java.util.Scanner;

public class CalculateAverage{

  public static void main(String[] args){

    double average = 0;
    double total = 0;
    double inputTemp;
    int n;
    Scanner input = new Scanner(System.in);

    while(true){
      try{

        System.out.println("How many numbers, N, do you want to average?");
        n = input.nextInt();

        if(n <= 0) throw new NegativeNumberException();
        break;

      }
      catch(NegativeNumberException e){

        System.err.println("NegativeNumberException: " + e.getMessage());
        System.err.println("Enter a positive number.");

      }
      catch(Exception e){

        System.err.println(e.getMessage());

      }
    }

    for(int i = 0; i < n; ++i){
      try{

        System.out.println("Enter the number you would like to average.");
        inputTemp = input.nextDouble();
        if(inputTemp <= 0) throw new NegativeNumberException();
        total += inputTemp;

      }
      catch(NegativeNumberException e){

        System.err.println("NegativeNumberException: " + e.getMessage());
        System.err.println("Enter a positive number.");
        --i; // Stay on same iteration.

      }
      catch(Exception e){

        System.err.println(e.getMessage());

      }
    }

    average = total / (double) n;
    System.out.println("Your average of " + n + " numbers is " + average);

  }


}

class NegativeNumberException extends Exception{

  NegativeNumberException(){
    this("N must be greater than 0.");
  }

  NegativeNumberException(String e){
    super(e);
  }

}

/*
The ouput from running the program:
How many numbers, N, do you want to average?
-4
NegativeNumberException: N must be greater than 0.
Enter a positive number.
How many numbers, N, do you want to average?
-57
NegativeNumberException: N must be greater than 0.
Enter a positive number.
How many numbers, N, do you want to average?
3
Enter the number you would like to average.
-3
NegativeNumberException: N must be greater than 0.
Enter a positive number.
Enter the number you would like to average.
3
Enter the number you would like to average.
-5
NegativeNumberException: N must be greater than 0.
Enter a positive number.
Enter the number you would like to average.
5
Enter the number you would like to average.
4
Your average of 3 numbers is 4.0
*/
