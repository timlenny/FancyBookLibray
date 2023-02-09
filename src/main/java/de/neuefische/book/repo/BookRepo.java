package de.neuefische.book.repo;

import de.neuefische.book.model.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class BookRepo {

    private Map<String, Book> books = new HashMap<String, Book>();

    public List<Book> getAllBooks() {
        return books.values().stream().toList();
    }

    public List<String> bonusBooks() {
        List<String> books = List.of("ABC und mehr", "Das kleine ABC", "Tiere&Pflanzen", "LW Buch");

        for (String book : books) {
            if (book.contains("ABC")) {
                //Do something
            }
        }

        List<String> streamResult =
                books.stream()
                        .filter(inputString -> inputString.contains("ABC"))
                        .collect(Collectors.toList()); //Collect sammelt alle Elemente am Ende des Streams und fügt in Liste


        return streamResult;

    }

}
