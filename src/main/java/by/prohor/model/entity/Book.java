package by.prohor.model.entity;

import java.sql.Date;

public class Book {
    private int id;
    private String title;
    private String author;
    private Date date;

    public Book(int id, String title, String author, Date date) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.date = date;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                '}';
    }
}
