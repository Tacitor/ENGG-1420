/*
 * Lukas Krampitz - lkrampit
 * Feb 4, 2023
 * Assignment 4 Part 6
 * 6. Define a method named add in the Circle class that takes a parameter of type Circle and adds its radius to
 * the radius of the current object (the object on which the method is called). Then,
 *      a. Define a method called addAll in this class that takes an array of elements of type Circle as a
 *          parameter and adds the radius of all these circles to the radius of the current object.
 * 
 * 7. Implement a main method in the Circle class and create an array of 100 circles with radiuses of 1 to 100.
 * Further, create a circle C with a random radius (between 10 and 1000), and add the first 100 circles to
 * circle C using the addAll method. Before and after this operation, print the value of the radius of the circle C.
 * 
 * 8. In the Circle class, implement a method called decompose, which can be used to decompose a circle into
 * its constituent circles. For example, if we have a circle object with radius 12, by calling the decompose
 * method on it, an array must be returned that contains 2 circles with radius 2 and one circle with radius 3.
 * Or if we call this method on a circle object with a radius of 120, we should return an array containing 5
 * circle objects. The first 3 elements of this array are circles with radius 2, the fourth element is a circle with
 * radius 3 and the fifth element is a circle with radius 5.
 */
package assignment4;

import java.util.ArrayList;
import java.util.Arrays;

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

    /**
     * @param args
     */
    public static void main(String[] args) {
        //create the array
        Circle circles[] = new Circle[100];

        //create the circle of random radius from 10 - 1000. Make sure to include both 10 and 1000
        Circle C = new Circle((int) (Math.random() * (1000 - 10 + 1)) + 10);

        System.out.println("The Circle C has a radius of: " + C.getRadius());

        //set the radii
        for (int i = 0; i < circles.length; i++) {
            //initialize the circle
            circles[i] = new Circle(i + 1);
        }

        //add the circles all together
        C.addAll(circles);

        System.out.println("The Circle C has a radius of: " + C.getRadius());

        Circle decompTest = new Circle(120);
        System.out.println(Arrays.toString(decompTest.decompose()));
    }

    /**
     * Decompose a circle into its constituent circles. For example, if we have
     * a circle object with radius 12, by calling the decompose method on it, an
     * array must be returned that contains 2 circles with radius 2 and one
     * circle with radius 3.
     *
     * @return
     */
    public Circle[] decompose() {
        Circle decompCircles[]; // The final array of circles that will be returned.
        ArrayList<Integer> radNums = new ArrayList<>(); //An ArrayList that contains the radius values of the circles.

        //variables to control the loop
        int rad = this.radius; //the portion of the radius there is left to divide up into prime factors
        int d = 2; //the current divisor being used. Start at 2 as the smallest possible prime factor.

        //find the values of the radii of the circles
        while (rad > 1) { //keep looping as long as there is a partial radius left
            //check if d is a divisor of rad
            if (rad % d == 0) {
                //if it is store it
                radNums.add(d);

                //take out the value of d from the partial
                rad /= d;
            } else {
                //increment d to get to a larger value to possible be a divisor
                d++;
            }
        }

        //init the array
        decompCircles = new Circle[radNums.size()];

        //loop through all the divisors
        for (int i = 0; i < decompCircles.length; i++) {
            decompCircles[i] = new Circle(radNums.get(i));
        }

        return decompCircles;
    }

    /**
     * Display the circle as a representation by just the radius.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Radius: " + radius;
    }

}
