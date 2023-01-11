/**
 * Lukas Krampitz
 * 10 Jan 2023
 * assignment1_part1
 * Implement a program to take a four-digit number from input and print it in reverse order.
 */
#include <stdio.h>

#define SIZE 4

int main(void)
{

    char num_str[SIZE + 1]; // A char for 4 numbers and a delimeter at the end

    printf("Please enter a four-digit number: ");
    scanf("%s", num_str); // read in the number as a string of characters

    // loop through the number backwards
    for (int i = 0; i < SIZE; i++)
    {
        printf("%c", num_str[SIZE - 1 - i]);
    }

    // print a new line to ensure good formatting
    printf("\n");

    return 0;
}