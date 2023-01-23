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
        setLength(length);
        setWidth(width);

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
        setPosX(posX);
        setPosY(posY);

    }

    /**
     * Mutator for the X Co-ordinate of the Rectangle.
     *
     * @param posX
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * Accessor for the X Co-ordinate of the Rectangle.
     *
     * @return
     */
    public int getPosX() {
        return posX;
    }

    /**
     * Mutator for the Y Co-ordinate of the Rectangle.
     *
     * @param posY
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * Accessor for the Y Co-ordinate of the Rectangle.
     *
     * @return
     */
    public int getPosY() {
        return posY;
    }

    /**
     * Mutator for the length of the Rectangle.
     *
     * @param length
     */
    public void setLength(int length) {
        //check for a 0 value
        if (length == 0) {
            //set the length to 1
            this.length = 1;
        } else {
            //if another value is given make sure it is positive
            this.length = Math.abs(length);
        }
    }

    /**
     * Accessor for the length dimension of the Rectangle.
     *
     * @return length
     */
    public int getLength() {
        return length;
    }

    /**
     * Mutator for the width of the Rectangle.
     *
     * @param width
     */
    public void setWidth(int width) {
        //check for a 0 value
        if (width == 0) {
            //set the width to 1
            this.width = 1;
        } else {
            //if another value is given make sure it is positive
            this.width = Math.abs(width);
        }
    }

    /**
     * Accessor for the width dimension of the Rectangle.
     *
     * @return width
     */
    public int getWidth() {
        return width;
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
     * Takes an object of type <code>Rect</code> as a parameter and compares it
     * with the current rectangle. If the area of the current object is larger
     * than the area of the parameter object, return true and otherwise return
     * false.
     *
     * @param otherRect
     * @return
     */
    public boolean isBiggerThan(Rect otherRect) {
        return this.getArea() > otherRect.getArea();
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
                + "\nCircumference: " + getPerimeter()
                + "\nArea: " + getArea();

        return result;

    }
}
