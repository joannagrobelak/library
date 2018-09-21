package com.library.controller;

import com.library.domain.BookStatus;
import com.library.domain.Title;
import com.library.domain.dto.BookDto;
import com.library.domain.dto.LoanDto;
import com.library.domain.dto.MemberDto;
import com.library.domain.dto.TitleDto;
import com.library.mapper.LibraryMapper;
import com.library.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/library")
public class LibraryController {

    @Autowired
    private DbService dbService;

    @Autowired
    private LibraryMapper libraryMapper;

    @RequestMapping(method = RequestMethod.POST, value = "/createAccount", consumes = APPLICATION_JSON_VALUE)
    public void createAccount(@RequestBody MemberDto memberDto) {
        dbService.saveMember(libraryMapper.mapToMember(memberDto));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addNewTitle", consumes = APPLICATION_JSON_VALUE)
    public void addNewTitle(@RequestBody TitleDto titleDto) {
        dbService.saveTitle(libraryMapper.mapToTitle(titleDto));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addNewBook", consumes = APPLICATION_JSON_VALUE)
    public void addNewBook(@RequestBody BookDto bookDto) {
        dbService.saveBook(libraryMapper.mapToBook(bookDto));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/changeStatus")
    public BookDto changeStatus(@RequestBody BookDto bookDto) {
        return libraryMapper.mapToBookDto(dbService.changeStatus(libraryMapper.mapToBook(bookDto)));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/checkAvailability")
    public Long checkAvailability(@RequestParam Title title, BookStatus bookStatus) {
        return dbService.countAvailableBooks(title, bookStatus);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/loanBook", consumes = APPLICATION_JSON_VALUE)
    public void createNewLoan(@RequestBody LoanDto loanDto) {
        dbService.loanBook(libraryMapper.mapToLoan(loanDto));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/returnBook")
    public LoanDto returnBook(@RequestBody LoanDto loanDto) {
        return libraryMapper.mapToLoanDto(dbService.returnBook(libraryMapper.mapToLoan(loanDto)));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/showWhoReadBook")
    public List<MemberDto> showWhoReadBook(@RequestParam long bookId) {
        return libraryMapper.mapToMemberDtoList(dbService.showWhoReadBook(bookId));
    }

}
