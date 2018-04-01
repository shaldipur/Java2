/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Exercise 2
 */


public class Person
{
    //set fields
    String name;
    int phoneNumber;

    //initialize fields in constructor
    public Person(String name, int phoneNumber){

        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString()
    {
        return name + "," + phoneNumber;
    }

}
