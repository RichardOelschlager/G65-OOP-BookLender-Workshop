package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book
        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Jane", "Smith");

        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Clean Code", "Robert Martin");

        System.out.println(p1.getPersonInformation());
        System.out.println(p2.getPersonInformation());

        System.out.println(b1.getBookInformation());
        System.out.println(b2.getBookInformation());

        p1.loanBook(b1);  // should loan successfully
        p1.loanBook(b2);
        p2.loanBook(b1);  // should indicate already loaned
        System.out.println(b1.getBookInformation());
        p1.returnBook(b1); // should return
        p2.loanBook(b1);
        System.out.println(b1.getBookInformation());
    }

}
