/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Lesson 3
 *  Exercise 2
 */


public class ZeroInputError extends Exception {

    public String getMessage() {

        System.out.println("Error! Can't divide by zero!");

        return null;
    }


}
