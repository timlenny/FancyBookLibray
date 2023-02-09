package de.neuefische.book.service;

import de.neuefische.book.model.Book;
import de.neuefische.book.model.BookKind;
import de.neuefische.book.repo.BookRepo;

import java.util.List;

public class BookService {

    BookRepo bookRepo = new BookRepo();

    public List<Book> getAllBooks(){
        List<Book> resultBookList = bookRepo.getAllBooks();
        return resultBookList;
    }

}
