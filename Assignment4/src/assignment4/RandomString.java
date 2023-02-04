/*
 * Lukas Krampitz - lkrampit
 * Feb 4, 2023
 * Assignment 4 Part 2
 * Implement a RandomString class that has a method called nextString that takes a parameter n of type int
 * and returns a random string of length n characters. The random string can only contain lowercase and
 * uppercase letters of the English alphabet, digits 0 to 9, and cannot start with a digit. To implement this
 * class, you can use java.util.Random class.
 * 
 */
package assignment4;

/**
 *
 * @author Tacitor
 */
public class RandomString {

    /**
     * A Private constructor so that this class cannot be instantiated
     */
    private RandomString() {

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(nextString(10));
    }

    /**
     * Returns a random string of length n characters.
     *
     * @param n - length of string to return.
     * @return - A random string.
     */
    public static String nextString(int n) {

        int charRanges[][] = new int[][]{{48, 10}, {65, 26}, {97, 26}}; //The ASCII vaue ranges that can be used in the random string. It can be any n by 2 array. As many ranges as required. Each range is an array of size 2. In each range array index 0 is the inclusive start of the range. And index 1 is the inclusive size of the range.
        int selectedRange; //the range to pick the random char from
        char randChar;

        //Make the stringBuilder
        StringBuilder randString = new StringBuilder();

        //loop as many times as the requested number of characters
        for (int i = 0; i < n; i++) {
            //to ensure an even distrobution of numbers, upper, and lower case character first select which range
            selectedRange = (int) (Math.random() * charRanges.length);

            //Now the range has been selected, select an ascii char value from within the selected range
            randChar = (char) ((int) (Math.random() * charRanges[selectedRange][1]) + charRanges[selectedRange][0]);

            //add the char
            randString.append(randChar);
        }

        return randString.toString();

    }

}
