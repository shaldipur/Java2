/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Exercise 1
 */

public class Samsung implements Phone
{
    @Override
    public void call(Person person) {
        System.out.println(person.getName() + " will call Samsung with " + person.getPhoneNumber() + ".");
    }

    @Override
    public void end(){
        System.out.println("End Samsung.");
    }

    @Override
    public void text(){
        System.out.println("Text Samsung");
    }
}
