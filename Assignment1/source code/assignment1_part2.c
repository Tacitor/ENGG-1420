/**
 * Lukas Krampitz
 * 10 Jan 2023
 * assignment1_part2
 */
#include <stdio.h>

int main(void)
{

    // Vars
    int a, b, ans;
    char ch;
    _Bool error = 0;

    // Get input
    printf("Please enter number a, followed by b, and then an operator (eg. 4,5,+): ");
    scanf("%d,%d,%c", &a, &b, &ch);

    // Check what operations is needed and do the calculation
    if (ch == '+')
    {
        ans = a + b;
    }
    else if (ch == '-')
    {
        ans = a - b;
    }
    else if (ch == '*')
    {
        ans = a * b;
    }
    else if (ch == '/')
    {
        ans = a / b;
    }
    else
    {
        ans = 0;
        error = 1;
    }

    // Display the result
    if (!error)
    {
        printf("The result of %d %c %d is: %d", a, ch, b, ans);
    }
    else
    {
        printf("ERROR: please enter a valid operator from (+, -, *, and /)");
    }

    return 0;
}