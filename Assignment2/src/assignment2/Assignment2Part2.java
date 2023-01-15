/*
 * Lukas Krampitz - lkrampit
 * Jan 15, 2023
 * Assignment 2 Part 2
 * Rewrite the Part 1 program using switch-case and for statements.
 */
package assignment2;

/**
 *
 * @author Tacitor
 */
public class Assignment2Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vars
        final int STOP_VAL = 10000; //The value the search should stop at. This value itself is not checked
        int hasFactor; //keeps track if a factor has been found yet

        //loop until the STOP_VAL is reached
        for (int count = 2; count < STOP_VAL; count++) { //Start at 2 since 1 is not a prime.

            //reset hasFactor to false for this new value
            hasFactor = 0;

            //loop through all values of i less than the current value (count)
            for (int i = 2; i < count; i++) { //skip 1 as it is always a factor

                //test if i is a factor
                switch (count % i) {
                    case 0:
                        hasFactor = 1;
                        break;
                }
            }

            //print the value if it had no factors
            switch (hasFactor) {
                case 0:
                    System.out.println(count);
                    break;
            }

        }

    }

}
