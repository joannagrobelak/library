package com.library.repository;

import com.library.domain.Loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface LoanRepository extends CrudRepository<Loan, Long> {

    @Override
    Loan save(Loan loan);
}
