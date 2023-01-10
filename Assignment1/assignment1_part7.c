/**
 * Lukas Krampitz
 * 10 Jan 2023
 * assignment1_part7
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
int compDate(Date_t, Date_t);

int main(void)
{

    // Testing the function
    Date_t testDate1 = {31, 12, 2022};

    return 0;
}

/**
 * Takes two parameters of the Date type and compares them
 */
int compDate(Date_t date1, Date_t date2)
{
    int yearDiff, monthDiff, dayDiff; //The value differeneces between the members


    return 5;
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