/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Lesson 3
 *  Exercise 1
 */


import java.util.Scanner;


public class ThrowArrayException
{


    public static  void main (String[] args){

        String[] names = new String[10];

        names[0] = "Mike";
        names[1] = "Henry";
        names[2] = "George";
        names[3] = "John";
        names[4] = "Joe";
        names[5] = "Ben";
        names[6] = "Dave";
        names[7] = "Tim";
        names[8] = "Brian";
        names[9] = "Tom";



        Scanner input = new Scanner(System.in);

        System.out.println("Enter an array index >> ");
        String index = input.nextLine();

        int x = Integer.parseInt(index);

            try {
                System.out.println("The name associated with the array index is " + names[x] + ".");
            } catch (Exception e) {
                System.out.println(("The error is " + e.toString() + ". " + index + " is outside the bounds of the array."));
            }
            input.close();
    }

}
