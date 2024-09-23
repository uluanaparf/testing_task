package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.library.model.AccountingBook;

import java.util.List;

public interface AccountingBookRepository extends JpaRepository<AccountingBook, Long> {
    List<AccountingBook> findByReturnByIsNull();
    List<AccountingBook> findByReturnByIsNotNull();
}
