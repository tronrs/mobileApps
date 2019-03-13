/*
Ryan Citron
7/16/2018
Mobile Applications
Homework 2
*/

public class Rational{

  private int top;
  private int bottom;

  // Constructor with two parameters top and bottom.
  Rational(int top, int bottom){

    this.top = top;
    this.bottom = bottom;

  }

  // Constructor with one parameter wholeNumber.
  Rational(int wholeNumber){

    this.top = wholeNumber;
    this.bottom = 1;

  }

  // Constructor with no parameter. Initializes to 0.
  Rational(){

    this.top = 0;
    this.bottom = 1;

  }

  // This method adds two rational numbers together and returns a
  // new rational number
  public static Rational add(Rational r1, Rational r2){
    Rational newRational = new Rational();

    // This finds the common bottom correctly without reduction
    newRational.top = r1.top * r2.bottom + r1.bottom * r2.top;
    newRational.bottom = r1.bottom * r2.bottom;

    return newRational;

  }

  // This method subtracts two rational numbers ( r1 - r2 ) and returns a
  // new rational number
  public static Rational subtract(Rational r1, Rational r2){
    Rational newRational = new Rational();

    // This finds the common bottom correctly without reduction
    newRational.top = r1.top * r2.bottom - r1.bottom * r2.top;
    newRational.bottom = r1.bottom * r2.bottom;

    return newRational;

  }

  // This method multipies two rational numbers together and returns a
  // new rational number
  public static Rational multiply(Rational r1, Rational r2){
    Rational newRational = new Rational();

    newRational.top = r1.top * r2.top;
    newRational.bottom = r1.bottom * r2.bottom;

    return newRational;

  }

  // This method divides two rational numbers together and returns a
  // new rational number
  public static Rational divide(Rational r1, Rational r2){
    Rational newRational = new Rational();

    newRational.top = r1.top * r2.bottom;
    newRational.bottom = r1.bottom * r2.top;

    return newRational;


  }

  // Getters and Setters
  public int getNumerator(){ return this.top;}
  public void setNumerator(int top){ this.top = top;}
  public int getDenominator(){ return this.bottom;}
  public void setDenominator(int bottom){ this.bottom = bottom;}

  public boolean equals(Rational other){

    return (this.top * other.bottom == this.bottom * other.top);

  }

  public String toString(){

    return (this.top + "/" + this.bottom);

  }

}

/*
Output from running the test code:
Number is: 0/1
Number is: 5/1
Number is: 1/4
Rational1's numerator is: 0
Rational1's denominator is: 1
Changing rational1's numerator.
Rational1 is : 3/1
Chaning rational1's denominator.
Rational1 is: 3/4
rational1 is equal to rational2: false
Rational is equal to a copy of rational2: true
Adding 1/4 and 3/4: 16/16
Adding 3/4 and 5/1: 23/4
Subtracting 3/4 - 1/4: 8/16
Subtracting 5/1 - 3/4: 17/4
Multiplying 1/4 * 3/4: 3/16
Dividing 5/1 by 1/2: 10/1
*/
