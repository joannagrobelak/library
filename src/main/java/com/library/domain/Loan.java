package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "LOANS")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LOAN_ID")
    private long loanId;

    private Book book;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @Column(name = "ON_LOAN_FROM")
    private LocalDate onLoanFrom;

    @Column(name = "DUE_DATE")
    private LocalDate dueDate;

    @Column(name = "ACTUAL_DATE_OF_RETURN")
    private LocalDate actualDateOfReturn;
}
