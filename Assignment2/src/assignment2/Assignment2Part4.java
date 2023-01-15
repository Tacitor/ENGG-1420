/*
 * Lukas Krampitz - lkrampit
 * Jan 15, 2023
 * Assignment 2 Part 4
 * Implement a program that calculates the sum of numbers entered by the user until user enters zero (use
 * while and break statement).
 */
package assignment2;

import javax.swing.JOptionPane;

/**
 *
 * @author Tacitor
 */
public class Assignment2Part4 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int userInputNum; //Stores the input given from the user
        int sum = 0; //sum is an accumulator variable the will keep track of the running sum of number given

        //loop forever
        while (true) {

            //try catch to make sure the user does not give bad data
            try {

                userInputNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number (0 to quit):", "Input Required", JOptionPane.QUESTION_MESSAGE));

                //check if the user gave a 0
                if (userInputNum == 0) {
                    //break out of the loop
                    break;
                }

                //if the user did not wish to exit the loop sum the value
                sum += userInputNum;

            } catch (NumberFormatException e) {
                //Tell the user they have given bad input
                System.out.println("ERROR: Please enter a valid numebr\n" + e);
            }

        }

        //Display the result
        System.out.println("The sum of all your numbers is: " + sum);

    }

}
