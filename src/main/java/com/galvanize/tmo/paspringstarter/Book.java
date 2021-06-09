package com.galvanize.tmo.paspringstarter;

//import javax.persistence.*;
import java.util.Objects;

//@Entity
public class Book {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String author;
    private String title;
    private int datePublished;

    public Book() {}

    public Book(int id, String author, String title, int datePublished) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.datePublished = datePublished;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(int datePublished) {
        this.datePublished = datePublished;
    }

    @Override
    public String toString() {
        return "com.galvanize.tmo.paspringstarter.Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", datePublished=" + datePublished +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) &&
                Objects.equals(author, book.author) &&
                Objects.equals(title, book.title) &&
                Objects.equals(datePublished, book.datePublished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, title, datePublished);
    }
}
