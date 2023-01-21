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
     * Main Constructor. The defaults to a rectangle at position (1, 1). But the
     * dimensions is user defined.
     *
     * @param length
     * @param width
     */
    public Rect(int length, int width) {
        posX = 1;
        posY = 1;

        //set the given attributes
        this.length = length;
        this.width = width;

    }

    /**
     * Secondary constructor. Fully user defined parameters.
     *
     * @param posX
     * @param posY
     * @param length
     * @param width
     */
    public Rect(int posX, int posY, int length, int width) {

        //call the Primary constructor
        this(length, width);

        //set the given attributes
        this.posX = posX;
        this.posY = posY;

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
