package com.javayum;

import java.util.Date;

public class Loan {
    private String Id;
    private Date LoanDate;
    private Date DateForReturn;
    private Date ReturnDate;
    private String name;
    private Book book;
    public boolean HashNotBeenReturned(){
        return ReturnDate==null;
    }

    public void MarkAsReturned(){
        ReturnDate=new Date();
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Date getLoanDate() {
        return LoanDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoanDate(Date loanDate) {
        LoanDate = loanDate;
    }

    public Date getDateForReturn() {
        return DateForReturn;
    }

    public void setDateForReturn(Date dateForReturn) {
        DateForReturn = dateForReturn;
    }

    public Date getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(Date returnDate) {
        ReturnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
