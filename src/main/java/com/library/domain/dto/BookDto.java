package com.library.domain.dto;

import com.library.domain.BookStatus;
import com.library.domain.Loan;
import com.library.domain.Member;
import com.library.domain.Title;
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
public class BookDto {

    private long bookId;
    private Title title;
    private BookStatus bookStatus;
    private Loan loan;
    private List<Member> bookReadBy = new ArrayList<>();

    public BookDto(long bookId, Title title, BookStatus bookStatus) {
        this.bookId = bookId;
        this.title = title;
        this.bookStatus = bookStatus;
    }
}
