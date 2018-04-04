/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Lesson 4
 *  Exercise 1
 */

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;


public class FileStatistics
{

    //display the file's name, size, and time of last modification
    public static  void main (String[] args)
    {
        Path filePath = Paths.get("Lesson 4/testFile.docx");

        try{

            System.out.println("The file name is " + filePath.getFileName() + ".");

            BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);

            System.out.println("The size of the file is " + attr.size() + ".");

            System.out.println("The file was last modified at " + attr.lastModifiedTime() + ".");
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }

    }

}
