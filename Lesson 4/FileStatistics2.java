/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Lesson 4
 *  Exercise 2
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import static java.lang.Math.toIntExact;

public class FileStatistics2
{

    //display the file's name, size, and time of last modification
    public static  void main (String[] args)
    {
        Path filePathTextFile = Paths.get("Lesson 4/Quote.txt");
        Path filePathWordFile = Paths.get("Lesson 4/Quote.docx");
        
        try{

            BasicFileAttributes attrTxtFile = Files.readAttributes(filePathTextFile, BasicFileAttributes.class);
            BasicFileAttributes attrDocFile = Files.readAttributes(filePathWordFile, BasicFileAttributes.class);

            System.out.println("The size of the text file is " + attrTxtFile.size() + ".");
            System.out.println("The size of the Word file is " + attrDocFile.size() + ".");

            int docFileSize = toIntExact(attrDocFile.size());
            int textFileSize = toIntExact(attrTxtFile.size());

            double docFilePercentage = (((double)docFileSize)/(docFileSize + textFileSize)) * 100;
            String docFileResult = String.format("%.2f", docFilePercentage);
            double txtFilePercentage = (((double)textFileSize)/(docFileSize + textFileSize)) * 100;
            String txtFileResult = String.format("%.2f", txtFilePercentage);

            System.out.println("The ratio of the Word file size to the text file size is " + docFileResult + ":" + txtFileResult + ".");

        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }

    }

}
