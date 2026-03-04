package com.anant.subclasses;

public class Author {
    private String author_name;
    private int author_id;

    public Author(int author_id, String author_name) {
        this.author_name = author_name;
        this.author_id = author_id;
    }


    public int getAuthor_id() {
        return author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }
    @Override
    public String toString() {
        return String.format("Author name=%s, Author ID=%d]", author_name, author_id);
    }
}
