/*
 * Lukas Krampitz - lkrampit
 * Feb 4, 2023
 * Assignment 4 Part 4
 * Implement a Program class and inside its main method, read the information of a book from the input and
 * then use different methods of the Book class defined in Question 3.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author Tacitor
 */
public class Program {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String title;
        String authorName;
        int numPages; //The number of pages in the book
        int pubYear; //The year of publication
        int price;

        //wrap the input in a try catch satement incase of bad user input
        try {
            //Setup the input scanner
            Scanner scanner = new Scanner(System.in);

            //Read in the information from the user
            System.out.print("Enter the title of the book: ");
            title = scanner.nextLine();
            System.out.print("Enter the author(s) of the book: ");
            authorName = scanner.nextLine();
            System.out.print("Enter the number of pages of the book: ");
            numPages = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the year of publication of the book: ");
            pubYear = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the price of the book: ");
            price = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, authorName, numPages, pubYear, price);

            System.out.println(book.getTitleInTitleCase());
            System.out.println("Does the title contain the string \"Java\": " + book.contains("Java"));

            book.printAuthors();
            System.out.println("\nAuthor name: " + book.getAuthorName());
        } catch (NumberFormatException e) {
            System.out.println("ERROR: That is not a valid number,\n" + e);
        }
    }

}
