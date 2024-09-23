package com.example.library.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table (name = "accounting_books")
public class AccountingBook {
    @Id
    private Long bookId;

    private LocalDateTime borrowedAt;
    private LocalDateTime returnBy;

    public AccountingBook(){}

    public AccountingBook(Long bookId, LocalDateTime borrowedAt, LocalDateTime returnBy){
        this.bookId = bookId;
        this.borrowedAt = borrowedAt;
        this.returnBy = returnBy;
    }

    public Long getBookId(){
        return bookId;
    }

    public void setBookId(Long bookId){
        this.bookId = bookId;
    }

    public LocalDateTime getBorrowedAt(){
        return borrowedAt;
    }

    public void setBorrowedAt(LocalDateTime borrowedAt){
        this.borrowedAt = borrowedAt;
    }

    public LocalDateTime getReturnBy(){
        return returnBy;
    }

    public void setReturnBy(LocalDateTime returnBy){
        this.returnBy = returnBy;
    }

}
