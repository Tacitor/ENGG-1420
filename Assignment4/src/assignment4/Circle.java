/*
 * Lukas Krampitz - lkrampit
 * Feb 4, 2023
 * Assignment 4 Part 6
 * 6. Define a method named add in the Circle class that takes a parameter of type Circle and adds its radius to
 * the radius of the current object (the object on which the method is called). Then,
 *      a. Define a method called addAll in this class that takes an array of elements of type Circle as a
 *          parameter and adds the radius of all these circles to the radius of the current object.
 */
package assignment4;

/**
 *
 * @author Tacitor
 */
public class Circle {

    //Attributes
    private int radius;

    /**
     * Primary constructor. Creates a unit circle of size 1.
     */
    public Circle() {
        setRadius(1);
    }

    /**
     * Secondary constructor. Has a defined radius
     *
     * @param radius
     */
    public Circle(int radius) {
        this();
        setRadius(radius);
    }

    /**
     * Mutator for the radius of the circle. Ensure the radius is always
     * positive and non zero.
     *
     * @param radius
     */
    public void setRadius(int radius) {
        //ensure the given radius will not be set to 0
        if (radius != 0) {
            //set the radius and ensure it is positive
            this.radius = Math.abs(radius);
        }
    }

    /**
     * Accessor for the radius.
     *
     * @return
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Takes a parameter of type Circle and adds its radius to the radius of the
     * current object
     *
     * @param other
     */
    public void add(Circle other) {
        radius += other.radius;
    }

    /**
     * Takes an array of elements of type Circle as a parameter and adds the
     * radius of all these circles to the radius of the current object
     *
     * @param a
     */
    public void addAll(Circle[] a) {
        //loop over all the circles
        for (Circle c : a) {
            //add up the circles
            this.add(c);
        }
    }

}
