package bbb.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private long id;

    private  String isbn;
    private  String title;
    private  String author;

    //Unidirectional ManyToOne
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "Book_Publisher")
    Publisher publisher;

    //@JoinColumn(name="p_id")
    //@JoinTable(name="book_publisher")

    /*
        @JoinTable(name = "car_cust",
        joinColumns = { @JoinColumn(name = "car_id") },
        inverseJoinColumns = { @JoinColumn(name = "cust_id") })
    */

    public Book() {

    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher=" + publisher +
                '}';
    }
}