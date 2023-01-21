/*
 * Lukas Krampitz - lkrampit
 * Jan 21, 2023
 * Assignment 3 Part 2
 * Implement a Program class and create an objects of type Rect inside its main 
 * method and use its various methods
 */
package assignment3;

/**
 *
 * @author Tacitor
 */
public class Program {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //Create the Rect object
        Rect myRect = new Rect(10, 25, 8, 21); //Set the corner to be at (10, 25) and make it of length 8 and width 21

        //Test the perimeter
        System.out.println("The perimeter is: " + myRect);

    }

}
