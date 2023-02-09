package de.neuefische.book.model;

public enum BookKind {
    //Kinds: Soft-Cover, E-Book, Hard-Cover, Hörbuch

    SOFTCOVER("Softcover"),
    EBOOK("e-Book"),
    HARDCOVER("Hardcover"),
    AUDIOBOOK("Audio Book");

    private String desc;

    BookKind(String desc){
        this.desc = desc;
    }

}
