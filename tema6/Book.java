package src;

import java.util.LinkedList;

public class Book extends Section {
    LinkedList<Author> authors;

    public Book(String title) {
        super(title);
        this.authors = new LinkedList<>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }
}
