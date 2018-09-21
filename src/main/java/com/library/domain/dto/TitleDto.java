package com.library.domain.dto;

import com.library.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TitleDto {

    private long titleId;
    private String bookTitle;
    private String bookAuthor;
    private int publicationYear;
    private List<Book> books = new ArrayList<>();

    public TitleDto(String bookTitle, String bookAuthor, int publicationYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publicationYear = publicationYear;
    }
}
