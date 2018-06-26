package com.javayum;

import java.util.Calendar;
import java.util.Date;

public  class LoanFactory {

    //创建借书的记录
    public static Loan CreateLoan(Book book,String name){
        book.setLoanTo(false);
        Loan loan=new Loan();
        loan.setName(name);
        loan.setBook(book);
        loan.setLoanDate(new Date());
        loan.setDateForReturn(new Date());

        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, +10);
        date = calendar.getTime();
        //date十天后的时间
        loan.setDateForReturn(date);

        return loan;

    }
}
