package org.lessons.java.books;

public class Book {
    // FIELDS
    private String title;
    private int pages;
    private String author;
    private String publisher;

    // CONSTRUCTOR
    public Book(String title, int pages, String author, String publisher) throws IllegalArgumentException {
        if (title != null && !title.isBlank()) this.title = title;
        else {
            throw new IllegalArgumentException("Il titolo è obbligatorio, non può essere vuoto.");
        }
        if (pages > 0) this.pages = pages;
        else {
            throw new IllegalArgumentException("Il numero di pagine deve essere un valore numerico maggiore di 0.");
        }
        if (author != null && !author.isBlank()) this.author = author;
        else {
            throw new IllegalArgumentException("L'autore è obbligatorio, non può essere vuoto.");
        }
        if (publisher != null && !publisher.isBlank()) this.publisher = publisher;
        else {
            throw new IllegalArgumentException("L'editore è obbligatorio, non può essere vuoto.");
        }
    }

    // GETTERS & SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isBlank()) this.title = title;
        else {
            throw new IllegalArgumentException("Il titolo è obbligatorio, non può essere vuoto.");
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0) this.pages = pages;
        else {
            throw new NumberFormatException("Il numero di pagine deve essere maggiore di 0.");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isBlank()) this.author = author;
        else {
            throw new IllegalArgumentException("L'autore è obbligatorio, non può essere vuoto.");
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher != null && !publisher.isBlank()) this.publisher = publisher;
        else {
            throw new IllegalArgumentException("L'editore è obbligatorio, non può essere vuoto.");
        }
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
