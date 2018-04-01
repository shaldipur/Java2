/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Exercise 2
 */

public class TestPerson
{
    public static void main(String[] args)
    {
        Person[] personRef = new Person[3];

        personRef[0] = new Person("Joe", 555555555);
        personRef[1] = new Person("Mike", 666666666);
        personRef[2] = new Person("William",777777777);

        for(int x = 0; x < personRef.length; ++x){
            System.out.println(personRef[x].toString());
        }
    }
}
