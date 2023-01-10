/**
 * Lukas Krampitz
 * 10 Jan 2023
 * assignment1_part3
 */
#include <stdio.h>

#define SIZE 5

int main(void)
{

    // Vars
    int nums[SIZE];
    int smallest = 0, biggest = 0; // The indexes of the largest and smallest values in the array. Default to 0 and then varify

    // Get input
    printf("Please enter the %d numbers one at a time:\n", SIZE);
    // loop through and scan in the numbers
    for (int i = 0; i < SIZE; i++)
    {
        scanf("%d", &nums[i]);
    }

    // Check for the smallest and biggest values
    for (int i = 0; i < SIZE; i++)
    {
        // check for the biggest
        if (nums[i] > nums[biggest])
        {
            biggest = i; // if the new value is bigger set it as the new biggest
        }
        else if (nums[i] < nums[smallest]) //check for the smallest
        {
            smallest = i; // if the new value is bigger set it as the new biggest
        }
    }

    //print out the values
    printf("The largest value entered was %d, and the smallest was %d.", nums[biggest], nums[smallest]);

    return 0;
}