package com.library.service;

import com.library.domain.*;
import com.library.repository.BookRepository;
import com.library.repository.LoanRepository;
import com.library.repository.MemberRepository;
import com.library.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DbService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TitleRepository titleRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private LoanRepository loanRepository;

    public Member saveMember(final Member member) {
        return memberRepository.save(member);
    }

    public Title saveTitle(final Title title) {
       return titleRepository.save(title);
    }

    public Book saveBook(final Book book) {
        return bookRepository.save(book);
    }

    public Book changeStatus(final Book chosenBook) {
        chosenBook.setBookStatus(null);
        return bookRepository.save(chosenBook);
    }

    public long countAvailableBooks(final Title title, final BookStatus bookStatus) {
        return bookRepository.countByTitleAndAndBookStatus(title, bookStatus);
    }

    public Loan loanBook(final Loan loan) {
        Loan loanedBook = loanRepository.save(new Loan());
        loanedBook.setOnLoanFrom(LocalDate.now());
        loanedBook.setDueDate(LocalDate.now().plusMonths(1L));
        return loanedBook;
    }

    public Loan returnBook(final Loan bookToBeReturned) {
        bookToBeReturned.setActualDateOfReturn(LocalDate.now());
        return loanRepository.save(bookToBeReturned);
    }

    public List<Member> showWhoReadBook(final Long bookId) {

        return bookRepository.findAllByBookId(bookId);
    }

}
