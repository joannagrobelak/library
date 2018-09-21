package com.library.domain.dto;

import com.library.domain.Book;
import com.library.domain.Loan;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

    private long memberId;
    private String firstName;
    private String lastName;
    private Date accountCreationDate;
    private List<Loan> loans = new ArrayList<>();
    private Book book;

    public MemberDto(long memberId, String firstName, String lastName) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountCreationDate = new Date();
    }
}
