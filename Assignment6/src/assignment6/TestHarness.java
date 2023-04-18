/*
 * Lukas Krampitz
 * Apr 18, 2023
 * 
 */
package assignment6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tacitor
 */
public class TestHarness {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        //System.out.print("Enter a file Path: ");
        //String path = in.nextLine();

        try {
            FileUtils.split("C:\\Users\\Lukas\\OneDrive\\OneDrive - University of Guelph\\Documents\\University of Guelph\\Sem 2\\ENGG1420\\ENGG-1420-src\\Assignment6\\src\\assignment6\\test.txt", 10);

        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e + "\n" + Arrays.toString(e.getStackTrace()));
        }
        //Other
        /*
        try {
            System.out.println(FileUtils.createRandomFile());
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }*/
    }
}
