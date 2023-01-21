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
        Rect secondRect = new Rect(1, 1, 5, 17);

        //Test the perimeter
        System.out.println("The perimeter is: " + myRect.getPerimeter());

        //Test the area
        System.out.println("The area is: " + myRect.getArea());

        //Move it
        myRect.move(60, 57);

        //Change the size to a 4 by 4 square
        myRect.changeSize(4);

        //add a new line for spacing
        System.out.print("\n");
        myRect.print(); //show the updated rectandgle

        //Try out the new Mutators from Part 5
        myRect.setPosX(11);
        myRect.setPosY(26);
        myRect.setLength(-7);
        myRect.setWidth(-21);

        //add a new line for spacing
        System.out.print("\n");
        //Test the print method and to see if the mutators worked
        myRect.print();

        //See which one is bigger
        System.out.println("\nIs myRect bigger than secondRect? " + myRect.isBiggerThan(secondRect));

    }

}
