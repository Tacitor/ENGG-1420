/**
 * Lukas Krampitz
 * 10 Jan 2023
 * assignment1_part5
 * Implement a function that takes an integer n as a parameter and checks whether n is a perfect number
 * using the function defined in Question 4. If n is a perfect number, it returns 1, otherwise 0 (a number is
 * a perfect number if it is equal to the sum of its divisors excluding the number itself).
 */
#include <stdio.h>

long long int divisorSum(int);
int isPerfect(int);

int main(void)
{

    // Testing the function
    printf("Ans: %d", isPerfect(496));

    return 0;
}

/**
 * Takes an integer n as a parameter and checks whether n is a perfect number.
 * If n is a perfect number, return 1, otherwise 0.
 */
int isPerfect(int n)
{
    return (divisorSum(n) - n) == n ? 1 : 0;
}

/**
 * Takes an integer n as a parameter and calculates and returns the sum of all
 * divisors of n.
 */
long long int divisorSum(int n)
{
    int sum = 0; // an accumulator to hold the sum

    // loop through all the numbers including an less than num and check if it is a factor (divisor)
    for (int i = n; i >= 1; i--)
    {
        // check for perfect divisability (no remainder)
        if (n % i == 0)
        {
            // then sum it up
            sum += i;
        }
    }

    // return the result
    return sum;
}