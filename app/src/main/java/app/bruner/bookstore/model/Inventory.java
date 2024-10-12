package app.bruner.bookstore.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import app.bruner.bookstore.R;

public class Inventory {

    //My Inventory
    private List<Book> books;

    //The context is required to access the strings
    public Inventory(Context context) {
        //initializing the book list
        books = new ArrayList<>();

        //add book1
        Book book1 = new Book(context.getString(R.string.book1_title),
                R.drawable.book1,
                context.getString(R.string.book1_description));
        books.add(book1);

        //add book2
        Book book2 = new Book(context.getString(R.string.book2_title),
                R.drawable.book2,
                context.getString(R.string.book2_description));
        books.add(book2);

        //add book3
        Book book3 = new Book(context.getString(R.string.book3_title),
                R.drawable.book3,
                context.getString(R.string.book3_description));
        books.add(book3);
    }

    //return list
    public List<Book> getBooks() {
        return books;
    }
}