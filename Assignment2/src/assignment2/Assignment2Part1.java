/*
 * Lukas Krampitz
 * Jan 15, 2023
 * Assignment 2 Part 1
 * Implement a program that calculates and prints prime numbers less than 10,000 (use the if-else and 
 * while statements)
 */
package assignment2;

/**
 *
 * @author Tacitor
 */
public class Assignment2Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vars
        final int STOP_VAL = 10000; //The value the search should stop at. This value itself is not checked
        int count = 2; //Keeps track what number we are on. And if the while loop should continue. Start at 2 since 1 is not a prime.
        int i; //a integer used to test against the currrent number to see if i is a factor of it.
        boolean hasFactor; //keeps track if a factor has been found yet

        //loop until the STOP_VAL is reached
        while (count < STOP_VAL) {

            //reset i for this new iteration
            i = 2; //skip 1 as it is always a factor
            //reset hasFactor to false for this new value
            hasFactor = false;

            //loop through all values of i less than the current value (count)
            while (i < count) {

                //test if i is a factor
                if (count % i == 0) {
                    hasFactor = true;
                }

                //check the next i
                i++;
            }

            //print the value if it had no factors
            if (!hasFactor) {
                System.out.println(count);
            }

            //move onto the next number
            count++;
        }

    }

}
