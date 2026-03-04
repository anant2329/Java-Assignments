package com.anant.subclasses;

public class Book {
    private String book_name;
    private int book_id;
    private Author author;
    private Publication publication;

    public Book(int book_id, String book_name, Author author, Publication publication) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.author = author;
        this.publication = publication;
    }

    public int getBook_id() {
        return book_id;
    }

    public String getBook_name() {
        return book_name;
    }
    public Author getAuthorObj() {
        return author;
    }



    @Override
    public String toString() {
        return String.format("Book [book_id=%d, book_name=%s]", book_id, book_name, author.toString(), publication.toString());
    }
}
