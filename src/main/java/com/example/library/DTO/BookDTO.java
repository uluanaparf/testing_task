package com.example.library.DTO;

import jakarta.validation.constraints.*;

public class BookDTO {
    @NotNull(message = "ISBN cannot be null")
    @Size(min = 10, max = 13, message = "ISBN should be between 10 and 13 characters")
    private String isbn;

    @NotNull(message = "Title cannot be null")
    private String title;

    @NotNull(message = "Genre cannot be null")
    private String genre;

    private String description;

    @NotNull(message = "Author cannot be null")
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
