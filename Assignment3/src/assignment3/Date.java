/*
 * Lukas Krampitz - lkrampit
 * Jan 21, 2023
 * Assignment 3 Part 3
 * Implement a Date class for the concept of date. Each date object contains year, month and day.
 * Further, each date object must have the following methods:
 *      a. print, that prints the value of the date in the output.
 *      b. addDays, which takes a parameter n of type int and adds n days to the date.
 *      c. compare, which takes a parameter of type Date and calculates the number of days between the
 *          date of the current object and the input object.
 */
package assignment3;

import java.text.DecimalFormat;

/**
 *
 * @author Tacitor
 */
public class Date {

    //Attributes
    private int day;
    private int month;
    private int year;

    //Static Variables
    protected static int daysPerMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //The days per month in the Gregorian Calendar

    /**
     * Main constructor. Defaults the date to January 1st 1970. This is the day
     * that the Unix time stamp started
     */
    public Date() {
        day = 1;
        month = 1;
        year = 1970;
    }

    /**
     * Secondary constructor. Takes user defined parameters.
     *
     * @param day
     * @param month
     * @param year
     */
    public Date(int day, int month, int year) {
        //call the previous constructor
        this();

        //set the given parameters
        this.day = day;
        this.month = month;
        this.year = year;

    }

    /**
     * Prints the value of the date in the output
     */
    public void print() {
        System.out.println(toString());
    }

    /**
     * Create and return a String representation of the Date. Results in a date
     * in the format (DD/MM/YYYY).
     *
     * @return
     */
    @Override
    public String toString() {

        //Ensure that every day and month with always take up the space of 2 characters
        DecimalFormat twoDigits = new DecimalFormat("00");

        /*Generate and return the string with the formatting.
         * Do not make the year conform to formatting. Any year more or less than 
         * 4 digits does not use the Gregorian calendar and wouldn't make use of this format anyway
         */
        return "(" + twoDigits.format(day) + "/" + twoDigits.format(month) + "/" + year;

    }

    /**
     * Takes a parameter n of type <code>int</code> and adds n days to the date
     *
     * @param n
     */
    public void addDays(int n) {
        //loop the number of times a day should be added
        for (int i = 0; i < n; i++) {
            //increment the date 1 by 1, to ensure it is always a valid date, and always one after the other
            nextDate();
        }
    }

    /**
     * Takes a Date parameter and set it to a date which is 1 day after the date
     * of the input parameter.
     *
     */
    public void nextDate() {

        // increment the day
        day++;

        // check for month overflow
        if (day > daysPerMonth[month - 1]) {
            // reset the day
            day = 1;
            // increment the month
            month++;

            // now check for month over flow since the month has been modified
            if (month > 12) {
                // if the month if more than decembre
                month = 1;
                // reset to january 1st.
                day = 1;

                // increment the year
                year++;
            }
        }
    }

    /**
     * Takes a parameter of type Date and calculates the number of days between
     * the date of the current object and the input object
     *
     * @param otherDate
     * @return
     */
    public int compare(Date otherDate) {
        int yearDiff, monthDiff, dayDiff; // The value differeneces between the attributes
        int totalDays = 0; // The end result of the comparison. The number of days different.

        // get the indevidual attribute comparisons
        yearDiff = valComp(this.year, otherDate.year);
        monthDiff = valComp(this.month, otherDate.month);
        dayDiff = valComp(this.day, otherDate.day);

        //add the days of difference in whole years.
        totalDays += (yearDiff * 365);

        //add the difference in months
        //loop through the number of months different
        for (int i = 0; i < Math.abs(monthDiff); i++) {

            //for each month of difference look up the days in that month and add them
            totalDays += daysPerMonth[Math.min(this.month, otherDate.month) + i];

        }

        //add the difference in days
        totalDays += dayDiff;

        return totalDays;
    }

    /**
     * Compares two integers. Returns a positive value if the first parameter is
     * bigger than the second. Returns a negative value if the first parameter
     * is less than the second. Returns 0 if the same.
     */
    private int valComp(int num1, int num2) {

        if (num1 == num2) {
            return 0;
        } else {
            return num1 - num2;
        }
    }
}
