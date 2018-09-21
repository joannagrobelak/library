package com.library.mapper;

import com.library.domain.Book;
import com.library.domain.Loan;
import com.library.domain.Member;
import com.library.domain.Title;
import com.library.domain.dto.BookDto;
import com.library.domain.dto.LoanDto;
import com.library.domain.dto.MemberDto;
import com.library.domain.dto.TitleDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LibraryMapper {

    public Member mapToMember(final MemberDto memberDto) {
        return new Member(
                memberDto.getMemberId(),
                memberDto.getFirstName(),
                memberDto.getLastName()
        );
    }

    public MemberDto mapToMemberDto(final Member member) {
        return new MemberDto(
                member.getMemberId(),
                member.getFirstName(),
                member.getLastName()
        );
    }

    public List<MemberDto> mapToMemberDtoList(final List<Member> members) {
        return members.stream()
                .map(member -> new MemberDto(member.getMemberId(), member.getFirstName(), member.getLastName()))
                .collect(Collectors.toList());
    }

    public Title mapToTitle(final TitleDto titleDto) {
        return new Title(
                titleDto.getBookTitle(),
                titleDto.getBookAuthor(),
                titleDto.getPublicationYear()
        );
    }

    public TitleDto mapToTitleDto(final Title title) {
        return new TitleDto(
                title.getBookTitle(),
                title.getBookAuthor(),
                title.getPublicationYear()
        );
    }

    public Book mapToBook(final BookDto bookDto) {
        return new Book(
                bookDto.getBookId(),
                bookDto.getTitle(),
                bookDto.getBookStatus()
        );
    }

    public BookDto mapToBookDto(final Book book) {
        return new BookDto(
                book.getBookId(),
                book.getTitle(),
                book.getBookStatus()
        );
    }

    public List<BookDto> mapToBookDtoList(final List<Book> books) {
        return books.stream()
                .map(book -> new BookDto(book.getBookId(), book.getTitle(), book.getBookStatus()))
                .collect(Collectors.toList());
    }

   public Loan mapToLoan(final LoanDto loanDto) {
        return new Loan(
                loanDto.getLoanId(),
                loanDto.getBook(),
                loanDto.getMember()
        );
    }

    public LoanDto mapToLoanDto(final Loan loan) {
        return new LoanDto(
                loan.getLoanId(),
                loan.getBook(),
                loan.getMember()
        );
    }

    public List<LoanDto> mapToLoanDtoList(final List<Loan> loans) {
        return loans.stream()
                .map(loan -> new LoanDto(loan.getLoanId(), loan.getBook(), loan.getMember()))
                .collect(Collectors.toList());
    }


}
