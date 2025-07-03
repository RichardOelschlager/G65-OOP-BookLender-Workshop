package se.lexicon.model;
/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    // todo: needs completion
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        id = getNextId();
    }

    private static int getNextId(){
        sequencer++;
        return sequencer;
    }

    public void loanBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            book.setBorrower(this);
            System.out.println(firstName + " " + lastName + " loaned the book: " + book.getTitle());
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (!book.isAvailable()) {
            book.setAvailable(true);
            book.clearBorrower();
            System.out.println(firstName + " " + lastName + " returned the book: " + book.getTitle());
        } else {
            System.out.println("Book was not loaned.");
        }
    }

    public String getPersonInformation() {
        return "ID: " + id + ", Name: " + firstName + " " + lastName;
    }

    // Getters and Setters as needed
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}