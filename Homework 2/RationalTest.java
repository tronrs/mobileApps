/**
 * RationalTest.java
 *
 */

public class RationalTest
{

   public static void main(String[] args)
   {
      Rational rational1 = new Rational();
      System.out.println("Number is: " + rational1);

      Rational rational2 = new Rational(5);
      System.out.println("Number is: " + rational2);

      Rational rational3 = new Rational(1, 4);
      System.out.println("Number is: " + rational3);

      System.out.println("Rational1's numerator is: "
			 + rational1.getNumerator());
      System.out.println("Rational1's denominator is: "
			 + rational1.getDenominator());

      System.out.println("Changing rational1's numerator.");
      rational1.setNumerator(3);
      System.out.println("Rational1 is : " + rational1);

      System.out.println("Chaning rational1's denominator.");
      rational1.setDenominator(4);
      System.out.println("Rational1 is: " + rational1);

      System.out.println("rational1 is equal to rational2: "
			 + rational1.equals(rational2));

      Rational rational2copy = new Rational(rational2.getNumerator(),
				   rational2.getDenominator());
      System.out.println("Rational is equal to a copy of rational2: "
			 + rational2.equals(rational2copy));

      System.out.println("Adding 1/4 and 3/4: "
			 + Rational.add(rational1, rational3));
      System.out.println("Adding 3/4 and 5/1: "
			 + Rational.add(rational1, rational2));

      System.out.println("Subtracting 3/4 - 1/4: "
			 + Rational.subtract(rational1, rational3));
      System.out.println("Subtracting 5/1 - 3/4: "
			 + Rational.subtract(rational2, rational1));

      System.out.println("Multiplying 1/4 * 3/4: "
			 + Rational.multiply(rational1, rational3));

      System.out.println("Dividing 5/1 by 1/2: "
			 + Rational.divide(rational2, new Rational(1,2)));
   }
} // RationalTest

