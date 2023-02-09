package de.neuefische.book.repo;

import de.neuefische.book.model.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepo {

    private Map<String, Book> books = new HashMap<String, Book>();

    public List<Book> getAllBooks(){
        return books.values().stream().toList();
    }

}
