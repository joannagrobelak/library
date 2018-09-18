package com.library.repository;

import com.library.domain.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface MemberRepository extends CrudRepository<Member, Long> {

    @Override
    Member save(Member member);
}
