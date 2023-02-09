package de.neuefische.book.model;

public record Book(
        String isbn,
        String title,
        String Autor,
        BookKind kind
) {
}
