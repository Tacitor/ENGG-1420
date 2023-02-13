/*
 * Lukas Krampitz - lkrampit
 * Feb 4, 2023
 * Assignment 4 Part 5
 * Implement a program that reads a string from the input and assumes that the input string contains several
 * email addresses separated by semicolons, commas, or space. Then, by using regular expressions
 *      a. Print the number of email addresses that have the _ character.
 *      b. Print the number of email addresses associated with Gmail.
 * 
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author Tacitor
 */
public class Assignment4Part5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //Test email string:
        //te_st@gmail.com;fox@b_ruh.com:jim@aol.com s_am@gmail.com

        String emailInput;
        Scanner scanner = new Scanner(System.in);
        String underScorePatternBefore = "\\w*_\\w*@\\w*.\\w*"; //pattern with an _ before the @
        String underScorePatternAfter = "\\w*@\\w*_\\w*.\\w*"; //pattern with an _ after the @
        String gmailPattern = "\\w*@gmail.com";
        String seperatorPattern = "[: ;]";
        int numAddress = 1;

        //prompt the user
        System.out.print("Please enter the email addresses. \nSeparate multiple addresses with a semicolon, comma, or space: ");
        //get the input
        emailInput = scanner.nextLine();

        //loop through the input and count the total number of addresses
        for (int i = 0; i < emailInput.length(); i++) {
            //check if the current char is a one of the seperator characters
            //grabe the single char, turn it into a string, and run the regex on it
            if ((emailInput.charAt(i) + "").matches(seperatorPattern)) {
                //count it
                numAddress++;
            }

        }

        //create an array of size numAddress after counting. Put 1 address into each index
        String[] addresses = new String[numAddress];

        //reset the count
        numAddress = 0;
        //var to keep track of where the last address started
        int lastStart = 0;
        //loop through the input again and put the addresses into the array
        for (int i = 0; i < emailInput.length(); i++) {
            //check if the current char is a one of the seperator characters
            //grabe the single char, turn it into a string, and run the regex on it
            if ((emailInput.charAt(i) + "").matches(seperatorPattern)) {
                //this means we have reached the end of the address
                //take the substring and save it into the array
                addresses[numAddress] = emailInput.substring(lastStart, i); //don't include the seperator

                //count it
                numAddress++;

                //move the start of the next address
                lastStart = i + 1;
            }

        }

        //grab the last email that doesn't have the seperator after it
        addresses[numAddress] = emailInput.substring(lastStart);

        //reset numAddess again. Now it will hold the number of addresses that match the requirment
        numAddress = 0;
        //new counter for gmails
        int numGmail = 0;

        //loop through the addresses
        for (String address : addresses) {
            //check for either an undersore before or after the @ symbol
            if (address.matches(underScorePatternBefore) || address.matches(underScorePatternAfter)) {
                numAddress++;
            }

            //check for gmails
            if (address.matches(gmailPattern)) {
                numGmail++;
            }
        }

        System.out.println("Number of addresses with an \'_\': " + numAddress);
        System.out.println("Number of Gmail addresses: " + numGmail);
    }
}
