package com.library.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TitleDto {

    private long titleId;
    private String bookTitle;
    private String bookAuthor;
    private int publicationYear;
}
