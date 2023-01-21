/*
 * Lukas Krampitz - lkrampit
 * Jan 21, 2023
 * Assignment 3 Part 4
 * Implement a program to create an object of type Date and use its various methods.
 */
package assignment3;

/**
 *
 * @author Tacitor
 */
public class DateTestHarness {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //Make two test objects
        Date dateTest = new Date(4, 3, 2020);
        Date date2 = new Date(2, 1, 2021);

        //Test the printing
        dateTest.print();
        date2.print();

        //Test adding days
        dateTest.addDays(31 + 30 + 31);

        //See if it changed correctly
        dateTest.print();

        //reset the dates for testing
        dateTest = new Date(7, 3, 2011);
        date2 = new Date(30, 1, 2009);

        //test the comparing
        System.out.println(dateTest.compare(date2));

    }

}
