package com.anant;

import com.anant.subclasses.Author;
import com.anant.subclasses.Book;
import com.anant.subclasses.Publication;

public class MainBook {

    public static void searchBookByAuthor(Book[] books, String authorName) {
        System.out.println("\nBooks by Author: " + authorName);
        for (Book b : books) {
            if (b.getAuthorObj().getAuthor_name().equalsIgnoreCase(authorName)) {
                System.out.println(b);
            }
        }
    }

    public static void sortBookByName(Book[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = i + 1; j < books.length; j++) {
                if (books[i].getBook_name().compareToIgnoreCase(books[j].getBook_name()) > 0) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Author a1 = new Author(1, "George Orwell");
        Author a2 = new Author(2, "J.K. Rowling");
        Author a3 = new Author(3, "Dan Brown");
        Author a4 = new Author(4, "George Orwell");

        Publication p1 = new Publication(101, "Penguin");
        Publication p2 = new Publication(102, "Bloomsbury");
        Publication p3 = new Publication(103, "Doubleday");
        Publication p4 = new Publication(104, "HarperCollins");

        Book[] books = new Book[4];
        books[0] = new Book(201, "1984", a1, p1);
        books[1] = new Book(202, "Harry Potter", a2, p2);
        books[2] = new Book(203, "The Da Vinci Code", a3, p3);
        books[3] = new Book(204, "Animal Farm", a4, p4);

        System.out.println("All Books:");
        for (Book b : books) {
            System.out.println(b);
        }

        searchBookByAuthor(books, "George Orwell");

        sortBookByName(books);
        System.out.println("\nBooks after sorting by name:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
