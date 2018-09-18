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
}


