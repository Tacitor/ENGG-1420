/*
 * Lukas Krampitz - lkrampit
 * Jan 15, 2023
 * Assignment 2 Part 3
 * Consider the following code snippet (code indentation has been intentionally removed):
 *  if ( y == 8 )
 *  if ( x == 5 )
 *  System.out.println( "@@@@@" );
 *  else
 *  System.out.println( "#####" );
 *  System.out.println( "$$$$$" );
 *  System.out.println( "&&&&&" );
 * a. Modify the above code so that its output is specific for x = 5 and y = 8
 * b. Modify the above code again so that its output is different for x = 5 and y = 8
 * c. Modify the above code so that its output is specific for x = 5 and y = 7
 * Note that the only action allowed to change the first code is to add { and }. After making the necessary changes, indent the resulting code.
 */
package assignment2;

/**
 *
 * @author Tacitor
 */
public class Assignment2Part3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println("Sub-Part A:");
        printPartA(5, 8);
        
        System.out.println("\nSub-Part B:");
        printPartB(5, 8);

        System.out.println("\nSub-Part C:");
        printPartC(5, 7);

    }

    /**
     * Display the desired output for Assignment 2 Part 3 Sub-Part B
     *
     * @param x
     * @param y
     */
    public static void printPartC(int x, int y) {
        //The code actualy does not need any braces added to recieve the desired output for x = 5 and y = 8.
        //Braces of course make the code more readable and indentation does too.
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            }
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }

    /**
     * Display the desired output for Assignment 2 Part 3 Sub-Part B
     *
     * @param x
     * @param y
     */
    public static void printPartB(int x, int y) {

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }
    }

    /**
     * Display the desired output for Assignment 2 Part 3 Sub-Part A
     *
     * @param x
     * @param y
     */
    public static void printPartA(int x, int y) {
        //The code actualy does not need any braces added to recieve the desired output for x = 5 and y = 8.
        //Braces of course make the code more readable and indentation does too.
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
            }
        }
        System.out.println("$$$$$");
        System.out.println("&&&&&");
    }

}
