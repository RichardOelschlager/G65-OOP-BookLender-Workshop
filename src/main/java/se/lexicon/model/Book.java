package se.lexicon.model;


/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        this.id = generateBookId();
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public Book(String title, String author, Person borrower) {
        this.id = generateBookId();
        this.title = title;
        this.author = author;
        this.available = false;
        this.borrower = borrower;
    }

    private String generateBookId() {
        return "B" + (int)(Math.random() * 10000);
    }

    public String getBookInformation() {
        if(borrower != null){
            return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + available + ", Borrower: " + borrower.getPersonInformation() ;
        }
        return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + available + ", No Borrower ";
    }

    // Getters and Setters as needed
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBorrower(Person borrower){
        this.borrower = borrower;
    }

    public void clearBorrower(){
        borrower = null;
    }
}
