package com.javayum;


import java.util.Iterator;

public class Book  {
    private String Id;
    private String ISBN;
    private String Title;
    private boolean LoanTo=true; //如果LoanTo为null则书没有借出

    public Book(String id, String ISBN, String title, boolean loanTo) {
        Id = id;
        this.ISBN = ISBN;
        Title = title;
        LoanTo = loanTo;
    }

    public final String getId() {
        return Id;
    }

    public final void setId(String id) {
        Id = id;
    }

    public final String getISBN() {
        return ISBN;
    }

    public final void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public final String getTitle() {
        return Title;
    }

    public final void setTitle(String title) {
        Title = title;
    }

    public boolean isLoanTo() {
        return LoanTo;
    }

    public void setLoanTo(boolean loanTo) {
        LoanTo = loanTo;
    }

    //判断记录里面是否有一本书
    public boolean matches(Book book){
        if(Id!=book.Id)
            return false;
        if(ISBN!=book.ISBN)
            return false;
        if(Title !=book.Title)
            return false;
        if(LoanTo!=book.LoanTo)
            return false;
        return true;
    }
}
