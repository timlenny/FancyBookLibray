package de.neuefische.book.controller;

import de.neuefische.book.model.Book;
import de.neuefische.book.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    private BookService bookService = new BookService();
    /*Keine neue Instanz erstellen , da wir unsere mit Spring teilen wollen / bzw. gemeinsame nutzen wollen. Wenn wir
    * hier keine neue Instanz erzeuegen, übernimmt Spring diesen Schritt für uns via -> Dependencie Injection.
    *
    * Wenn wir hier selbst initialisieren werden haben wir 2 Instanzen -> 1x Spring & 1x eigene Insanz
    *
    * Bei Models macht es Sinn, dass wir manuell mehre initialisieren */

    @RequestMapping("/all")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

}
