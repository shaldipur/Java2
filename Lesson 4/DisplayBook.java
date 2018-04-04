/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Lesson 4
 *  Exercise 3
 */


import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;


public class DisplayBook
{
    public static  void main (String[] args)
    {
        Path file = Paths.get("Lesson 4/favoriteBook.txt");

        /* If file doesn't exist, prompt user for book title name.
         * Then create the new file and write the title into it.
         */

        if (Files.notExists(file))
        {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a book title >> ");
            String title = input.next();

            byte[] data = title.getBytes();
            OutputStream output = null;


            try
            {
                output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
                output.write(data);
                output.flush();
                output.close();
            }
            catch(IOException e)
            {
                System.out.println("IO Exception");
            }

        }


        /*read the contents of the file*/
        try{

            BufferedReader reader = new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(new File("Lesson 4/favoriteBook.txt")))));

            String line = null;

            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }

        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }

    }
}
