/*
 * Lukas Krampitz
 * Mar 20th 2023
 * Make my own LinkedList
 */
package linkedlist;

import java.util.ArrayList;

/**
 *
 * @author Lukas
 */
public class LinkedList {

    //Attributes
    Node start;

    //Primary (default) constructor. Sets up a new empty LinkedList
    public LinkedList() {
        start = null; //init the first element to be 0
    }

    /**
     * Secondary constructor. Initialize from an ArrayList.
     *
     * @param a
     */
    public LinkedList(ArrayList<Integer> a) {
        append(a);
    }

    public void append(int data) {
        //check if the first element has been used
        if (start == null) {
            //add the data to the end of the LinkedList (in this case the start is the end)
            start = new Node(null, data, null);
        } else {
            //find the end Node
            Node oldEnd = findEndNode(start);

            //add it into the end
            Node newEndNode = new Node(oldEnd, data, null);

            //assign the chain
            oldEnd.next = newEndNode;

        }
    }

    public final void append(ArrayList<Integer> a) {

        //check the size of the arrayList
        int len = a.size();

        //if there are any elements copy them over.
        if (len > 0) {
            //check if this LinkedList has been started
            if (start == null) {
                //set the first equal to the first
                start = new Node(null, a.get(0), null);
            }

            //just add onto the end
            Node oldEnd = findEndNode(start);
            Node newEnd = oldEnd;

            //loop over the ArrayList
            for (int i = 1; i < len; i++) {

                newEnd = new Node(oldEnd, a.get(i), null);

                //point oldEnd to the newEnd
                oldEnd.next = newEnd;

                //progress the old end by 1
                oldEnd = newEnd;

            }
        }
    }

    /**
     * Given a Node in a LinkedList, find the ending node. Follow the chain of
     * nodes until the end is reached.
     *
     * @param n
     * @return
     */
    private Node findEndNode(Node n) {
        //check if it is an ending node
        if (n.next == null) {
            //then this is the end
            return n;
        } else {
            //go deeper
            return findEndNode(n.next);
        }
    }

    /**
     * Print out all the elements of the Linked List.
     */
    public void printAll() {
        //print an opening bracket.
        System.out.print("[");

        // Add the first element if it is not null
        if (start != null) {
            System.out.print(start.data);

            Node currentNode = start.next;

            //loop through until the end is found
            while (currentNode != null) {
                //add a comma and the data
                System.out.print(", " + currentNode.data);

                //get the next node
                currentNode = currentNode.next;

            }
        }

        //print the closing bracket
        System.out.println("]");

    }

    /**
     * Nested Node class
     */
    private final class Node {

        //Attributes
        private final Node prev;
        private Node next;
        private int data;

        /**
         * Primary Constructor
         *
         * @param prev
         * @param data
         * @param next
         */
        private Node(Node prev, int data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        LinkedList l;

        int nums[] = new int[]{23, 43456, 567, 34, 123, 45, 456, 567, 35, 241, 3, 34};
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            a.add(nums[i]);
        }

        l = new LinkedList(a);

        l.printAll();
    }

}
