package com.library.domain.dto;

import com.library.domain.Book;
import com.library.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoanDto {

    private long loanId;
    private Book book;
    private Member member;
    private LocalDate onLoanFrom;
    private LocalDate dueDate;
    private LocalDate actualDateOfReturn;

    public LoanDto(long loanId, Book book, Member member) {
        this.loanId = loanId;
        this.book = book;
        this.member = member;
    }
}


