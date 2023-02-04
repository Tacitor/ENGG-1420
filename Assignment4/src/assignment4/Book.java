/*
 * Lukas Krampitz - lkrampit
 * Feb 4, 2023
 * Assignment 4 Part 3
 * Implement a Book class for the concept of book. Each book has a title, author name, number of pages,
 * year of publication and price. It is assumed that the names of the authors of the book are of type String in
 * which the names of different authors are separated by commas (e.g., “Paul Dietel, Harvey Dietel”).
 * Implement at least 3 suitable constructors for this class. Next, implement the following methods in this
 * class:
 *      a) getTitleInTitleCase method that returns the title of the book in Title Case format. TitleCase means
 *          that the first letter of each word in the string is uppercase, and the rest of the letters are lowercase,
 *          (e.g., if the title of the book is “java how to program”, the method returns “Java How To Program”).
 *      b) contains method that receives a parameter of type String and returns true if the book title contains that
 *          string, otherwise false. For example, if the input parameter is “Java” and the title of book is “Java How
 *          To Program” this method returns true.
 *      c) printAuthors method that prints the name of each author on a separate line.
 */
package assignment4;

/**
 *
 * @author Tacitor
 */
public class Book {

    //Attributes
    private String title;
    private String authorName;
    private int numPages; //The number of pages in the book
    private int pubYear; //The year of publication
    private int price;

    /**
     * Primary constructor. The book needs at the very least a title and author
     *
     * @param title
     * @param authorName
     */
    public Book(String title, String authorName) {
        setTitle(title);
        this.authorName = authorName;

    }

    /**
     * Secondary constructor. Now includes the number of pages.
     *
     * @param title
     * @param authorName
     * @param numPages
     */
    public Book(String title, String authorName, int numPages) {
        this(title, authorName);
        this.numPages = numPages;

    }

    /**
     * Tertiary constructor. Takes all attributes.
     *
     * @param title
     * @param authorName
     * @param numPages
     * @param pubYear
     * @param price
     */
    public Book(String title, String authorName, int numPages, int pubYear, int price) {
        this(title, authorName, numPages);
        this.pubYear = pubYear;
        this.price = price;

    }

    /**
     * Prints the name of each author on a separate line
     */
    public void printAuthors() {
        char[] workingAuthors = authorName.toCharArray(); //make a copy of the authors String
        StringBuilder printOutput = new StringBuilder("\nThe Authors:\n");

        //loop through the working char array of the authors
        for (int i = 0; i < workingAuthors.length; i++) {

            //check for a comma
            if (workingAuthors[i] == ' ' && workingAuthors[i - 1] == ',') { //check for a space after a comma
                
                printOutput.append("\n");
            } else {
                //add the char 
                printOutput.append(workingAuthors[i]);
            }
        }

        //print the StringBuilder
        System.out.println(printOutput.toString());
    }

    /**
     * Receives a parameter of type String and returns true if the book title
     * contains that string, otherwise false.
     *
     * @param s
     * @return
     */
    public boolean contains(String s) {
        return title.contains(s);
    }

    /**
     * Since the title is always in title case return it as is
     *
     * @return
     */
    public String getTitleInTitleCase() {
        return title;
    }

    /**
     * Take a given String s, and return a new string in title case.
     *
     * @param s
     * @return
     */
    public static String stringToTitleCase(String s) {
        String sLower = s.toLowerCase();
        StringBuilder titleCase = new StringBuilder(); //start off the builder with with the current string in all lowercase

        //loop through the string
        for (int i = 0; i < sLower.length(); i++) {

            //check if this letter need to be capitalized
            if (i == 0 || sLower.charAt(i - 1) == ' ') { //check if the start of the string or after a space
                //send the capital letter
                titleCase.append((char) ((int) (sLower.charAt(i)) - 32));
            } else {
                //add the char as is
                titleCase.append(sLower.charAt(i));
            }

        }

        return titleCase.toString();
    }

    /**
     * Accessor for the title.
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * Mutator for the title
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = stringToTitleCase(title);
    }

    /**
     * Accessor for the authorName.
     *
     * @return
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Mutator for the authorName
     *
     * @param authorName
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * Accessor for the numPages.
     *
     * @return
     */
    public int getNumPages() {
        return numPages;
    }

    /**
     * Mutator for the numPages
     *
     * @param numPages
     */
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    /**
     * Accessor for the pubYear.
     *
     * @return
     */
    public int getPubYear() {
        return pubYear;
    }

    /**
     * Mutator for the pubYear
     *
     * @param pubYear
     */
    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    /**
     * Accessor for the price.
     *
     * @return
     */
    public int getPrice() {
        return price;
    }

    /**
     * Mutator for the price
     *
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

}
