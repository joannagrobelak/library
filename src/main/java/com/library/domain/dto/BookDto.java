package com.library.domain.dto;

import com.library.domain.BookStatus;
import com.library.domain.Title;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private long bookId;
    private Title title;
    private BookStatus bookStatus;
}
