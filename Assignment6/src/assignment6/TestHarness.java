/*
 * Lukas Krampitz
 * Apr 18, 2023
 * 
 */
package assignment6;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tacitor
 */
public class TestHarness {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a file Path: ");
        String path = in.nextLine();

        try {
            System.out.println("Size: " + FileUtils.length(path));;

        } catch (PathNotAFolderException | FileNotFoundException e) {
            System.err.println("ERROR: " + e + "\n" + Arrays.toString(e.getStackTrace()));
        }
    }
}
