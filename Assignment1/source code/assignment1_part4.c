/**
 * Lukas Krampitz
 * 10 Jan 2023
 * assignment1_part4
 * Implement a function that takes an integer n as a parameter and calculates and returns the sum of all
 * divisors of n. For example, if n = 6 then this function must return 12.
 */
#include <stdio.h>

long long int divisorSum(int);

int main(void)
{

    // Testing the function
    printf("Ans: %lld", divisorSum(6));

    return 0;
}

/**
 * Takes an integer n as a parameter and calculates and returns the sum of all
 * divisors of n.
 */
long long int divisorSum(int num)
{
    int sum = 0; // an accumulator to hold the sum

    // loop through all the numbers including an less than num and check if it is a factor (divisor)
    for (int i = num; i >= 1; i--)
    {
        // check for perfect divisability (no remainder)
        if (num % i == 0)
        {
            // then sum it up
            sum += i;
        }
    }

    // return the result
    return sum;
}