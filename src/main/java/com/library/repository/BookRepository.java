package com.library.repository;

import com.library.domain.Book;
import com.library.domain.BookStatus;
import com.library.domain.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BookRepository extends CrudRepository<Book, Long> {

    @Override
    Book save(Book book);

    long countByTitleAndAndBookStatus(Title title, BookStatus bookStatus);
}
