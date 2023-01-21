/*
 * Lukas Krampitz - lkrampit
 * Jan 21, 2023
 * Assignment 3 Part 1
 * Implement a Rect class for the concept of rectangle. Each rectangle has the following properties:
 *      - Coordinates of the left and top corner of the rectangle (including X and Y)
 *      - the length
 *      - the width
 * Each rectangle must also have the following methods:
 *      a. getPerimeter, which calculates and returns the perimeter of a rectangle.
 *      b. getArea, which calculates and returns the area of a rectangle.
 *      c. move, that receives two parameters x and y of type int and changes the position of the
 *          rectangle (i.e., the coordinates of the left and top corner of the rectangle) to (x, y).
 *      d. changeSize, which takes a parameter n of type int and set the length and width of the
 *          rectangle to n.
 *      e. print, that prints the information of the rectangle including its coordinates, length, width,
 *          circumference, and area.
 */
package assignment3;

/**
 *
 * @author Tacitor
 */
public class Rect {

    //Attributes
    private int posX; //The and X and Y co-ordinates of the upper left corner
    private int posY;

    private int length; //The and length and width of the rectangle
    private int width;

    /**
     * Main constructor. Defaults the rectangle to bet at (0, 0) and of 1x1
     * length and width.
     */
    public Rect() {
        posX = 0;
        posY = 0;

        length = 1;
        width = 1;
    }

    /**
     * Secondary Constructor. The still defaults to a 1x1 rectangle. But now the
     * position is user defined.
     *
     * @param posX
     * @param posY
     */
    public Rect(int posX, int posY) {
        //call the main constructor
        this();

        //set the given attributes
        this.posX = posX;
        this.posY = posY;

    }

    /**
     * Tertiary constructor. Fully user defined parameters.
     *
     * @param posX
     * @param posY
     * @param length
     * @param width
     */
    public Rect(int posX, int posY, int length, int width) {

        //call the Secondary constructor
        this(posX, posY);

        //set the given attributes
        this.length = length;
        this.width = width;

    }

    /**
     * Calculates and returns the perimeter of a rectangle
     *
     * @return
     */
    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }

    /**
     * Calculates and returns the area of a rectangle
     *
     * @return
     */
    public int getArea() {
        return length * width;
    }

    /**
     * Receives two parameters x and y of type <code>int</code>. Changes the
     * position of the rectangle (i.e., the coordinates of the left and top
     * corner of the rectangle) to (x, y)
     *
     * @param x
     * @param y
     */
    public void move(int x, int y) {
        posX = x;
        posY = y;
    }

    /**
     * Takes a parameter n of type <code>int</code> and set the length and width
     * of the rectangle to n
     *
     * @param n
     */
    public void changeSize(int n) {
        length = width = n;
    }

    /**
     * Prints the information of the rectangle. Including its coordinates,
     * length, width, circumference, and area.
     */
    public void print() {
        System.out.println(toString());
    }

    /**
     * Creates and returns a String representation of the <code>Rect</code>
     * object.
     *
     * @return
     */
    @Override
    public String toString() {
        String result = "Rectangle:"
                + "\nX Position: " + posX
                + "\nY Position: " + posY
                + "\nLength: " + length
                + "\nWidth: " + width
                + "\nPerimeter: " + getPerimeter()
                + "\nArea: " + getArea();

        return result;

    }
}
