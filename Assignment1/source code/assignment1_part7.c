/**
 * Lukas Krampitz
 * 10 Jan 2023
 * assignment1_part7
 * Define a structure called Date that contains 3 members: year, month, and day. Then:
 *  a. Implement a function called getNextDate that takes a Date parameter and returns a Date which
 *      is 1 day after the date of the input parameter. For example, if the function’s input is equal to
 *      1/6/2022, the function must return 1/7/2022. (Do not consider leap years.)
 *  b. Implement a function that takes two parameters of the Date type and compares them.
 *      i. If the two parameters refer to the same date, the function returns zero,
 *      ii. If the first parameter is a date after the date of the second parameter, it returns +1,
 *      iii. If the first parameter is the date before the date of the second parameter, it returns -1.
 */
#include <stdio.h>

typedef struct Date
{
    int day;
    int month;
    int year;
} Date_t;

Date_t getNextDate(Date_t);
void printDate(Date_t);
int valComp(int num1, int num2);
int compDate(Date_t, Date_t);

int main(void)
{

    // Testing the function
    Date_t testDate1 = {6, 3, 2004};
    Date_t testDate2 = {27, 3, 2004};

    printf("Result: %d", compDate(testDate1, testDate2));

    return 0;
}

/**
 * Takes two parameters of the Date type and compares them
 */
int compDate(Date_t date1, Date_t date2)
{
    int yearDiff, monthDiff, dayDiff; // The value differeneces between the members
    int finalComp;                    // The end result of the comparison

    // get the indevidual member comparisons
    yearDiff = valComp(date1.year, date2.year);
    monthDiff = valComp(date1.month, date2.month);
    dayDiff = valComp(date1.day, date2.day);

    // check if the year is the same
    if (yearDiff)
    {
        // if the year is not 0
        finalComp = yearDiff; // then return the difference value for the year
    }
    else if (monthDiff) // if the year is the same then the month needs to be checked
    {
        // if the month comparison is not 0
        finalComp = monthDiff; // return which month is bigger
    }
    else if (dayDiff) // if the month is the same then the day needs to be compared
    {
        // if the day is not 0
        finalComp = dayDiff;
    }
    else
    {
        // if the rest are all false (0 value) then return 0 as they are all the same
        finalComp = 0;
    }

    return finalComp;
}

/**
 * Comapres two integers. Returns +1 if the first parameter is bigger than the second. Reurns -1 if the first parameter is less than the second. Returns 0if the same.
 */
int valComp(int num1, int num2)
{

    if (num1 == num2)
    {
        return 0;
    }
    else
    {
        return num1 > num2 ? 1 : -1;
    }
}

/**
 * Display a Date_t variable by printing it to the terminal. Use the proper DD/MM/YYYY format.
 */
void printDate(Date_t date)
{
    printf("%d/%d/%d\n", date.day, date.month, date.year);
}

/**
 * Takes a Date parameter and returns a Date which
 * is 1 day after the date of the input parameter.
 */
Date_t getNextDate(Date_t date)
{
    int daysPerMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // new date to return
    Date_t nextDate = date; // set it as the same

    // increment the day
    nextDate.day++;

    // check for month overflow
    if (nextDate.day > daysPerMonth[nextDate.month - 1])
    {
        // reset the day
        nextDate.day = 1;
        // increment the month
        nextDate.month++;

        // now check for month over flow since the month has been modified
        if (nextDate.month > 12)
        {                       // if the month if more than decembre
            nextDate.month = 1; // reset to january 1st.
            nextDate.day = 1;

            // increment the year
            nextDate.year++;
        }
    }

    return nextDate;
}