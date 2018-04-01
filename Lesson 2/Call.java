/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Exercise 3 and 4
 */

public class Call
{
    public static  void main (String[] args){


        //array of Phones
        Phone[] phones = new Phone[2];

        phones[0] = new IPhone();
        phones[1] = new Samsung();

        //array of Person
        Person[] personRef = new Person[3];

        personRef[0] = new Person("Joe", 5551234);
        personRef[1] = new Person("Bob", 5554444);
        personRef[2] = new Person("Sally",5551111);


        //Prompt the user to make a call by allowing the user to select phone and person.
        for(int x = 0; x < phones.length; ++x){
            for(int y = 0; y < personRef.length; ++y){
                 phones[x].call(personRef[y]);
            }


        }

    }
}
