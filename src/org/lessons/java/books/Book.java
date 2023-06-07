package org.lessons.java.books;

public class Book {
    // FIELDS
    private String title;
    private int pages;
    private String author;
    private String publisher;

    // CONSTRUCTOR
    public Book(String title, int pages, String author, String publisher) throws RuntimeException {
        if (title != null && !title.isBlank()) this.title = title;
        else {
            throw new IllegalArgumentException();
        }
        if (pages > 0) this.pages = pages;
        else {
            throw new NumberFormatException();
        }
        if (author != null && !author.isBlank()) this.author = author;
        else {
            throw new IllegalArgumentException();
        }
        if (publisher != null && !publisher.isBlank()) this.publisher = publisher;
        else {
            throw new IllegalArgumentException();
        }
    }

    // GETTERS & SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
