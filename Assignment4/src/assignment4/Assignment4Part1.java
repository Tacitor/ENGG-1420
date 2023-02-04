/*
 * Lukas Krampitz - lkrampit
 * Feb 4, 2023
 * Assignment 4 Part 1
 * Implement a program that takes a string from input and returns it in summary form. That is, if it has
 * several identical consecutive characters, write one character and then write the number of repetitions of
 * that character. If the number of repetitions is 1, there is no need to mention the number 1. Note that, the
 * letter’s case matter.
 */
package assignment4;

/**
 *
 * @author Tacitor
 */
public class Assignment4Part1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(summarizeString("AaAaaaa"));
    }

    /**
     * Given a string summarize it. That is, if it has several identical
     * consecutive characters, write one character and then write the number of
     * repetitions of that character. If the number of repetitions is 1, there
     * is no need to mention the number 1.
     *
     * @param s The given string to summarize
     * @return the summary as a new String
     */
    public static String summarizeString(String s) {

        StringBuilder summary = new StringBuilder();
        char workingChar = s.charAt(0); //The current character being summarized. Start with the first
        int count = 1; //The counter for the number of uses of a given character

        //loop through the given string
        for (int i = 1; i < s.length(); i++) {

            //check if the char is the same
            if (s.charAt(i) == workingChar) {
                //count it
                count++;
            } else {
                //now the working char needs to be swiched and the old information needs to be recored
                summary.append(workingChar);

                //add the number if needed
                if (count > 1) {
                    summary.append(count);
                }

                //if not the same
                //get the new character
                workingChar = s.charAt(i);

                //count the first instance of this new character
                //also reset the count
                count = 1;
            }
        }

        //add the info from the last working char
        summary.append(workingChar);

        //add the number if needed
        if (count > 1) {
            summary.append(count);
        }

        return summary.toString();
    }

}
