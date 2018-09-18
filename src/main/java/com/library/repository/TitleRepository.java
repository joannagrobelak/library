package com.library.repository;

import com.library.domain.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TitleRepository extends CrudRepository<Title, Long> {

    @Override
    Title save(Title title);
}
