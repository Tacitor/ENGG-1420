/*
 * Lukas Krampitz
 * 30th Jan 2023
 * Demo for the Lab in Week 4
 */
package labweek4;

/**
 *
 * @author Lukas
 * @version 1.0.0
 */
public class MulNum {

    /**
     * The Main method. This makes call to the rest of the program. Declares two
     * variables a and b of type <code>int</code>.
     *
     * @param args the command line arguments
     * @see mulNum(int a, int b)
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(mulNum(a, b));
    }

    /**
     * Multiply two values together.
     *
     * @param a - The left side of the multiplication.
     * @param b - The right side of the multiplication. The value of
     * <code>a</code> will be multiplied by the value of <code>b</code>.
     * @return The result of the multiplication of <code>a</code> by
     * <code>b</code>.
     */
    public static int mulNum(int a, int b) {
        return a * b;
    }

}
