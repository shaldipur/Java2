/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Lesson 3
 *  Exercise 2
 */

import java.util.Scanner;

public class Calculator {

    public static  void main (String[] args)
    {
        int numerator;
        int denominator;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a numerator >> ");
        int num = input.nextInt();

        System.out.println("Enter a denominator >> ");
        int den = input.nextInt();

         try{
            double result = num/den;
            System.out.println("The result is " + result + ".");
         }
         catch(Exception e)
         {
             ZeroInputError zie = new ZeroInputError();
             zie.getMessage();
         }

    }
}
