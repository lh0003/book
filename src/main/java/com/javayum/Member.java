package com.javayum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Member {
    private List member; //借出的所有书的记录

    public Member() {
         this.member=new LinkedList();
    }

    public Member(List memeber) {
        this.member = member;
    }



   //根据借书人的姓名查询
   public List search(String name){
        List matchingloans=new LinkedList();
        for (Iterator i=member.iterator();i.hasNext();){
            Loan loan =(Loan)i.next();
            if(loan.getName().equals(name))
                matchingloans.add(loan);
        }
       return matchingloans;
   }

   //根据书籍得出借出的记录
    public Loan get(Book book){
        for (Iterator i=member.iterator();i.hasNext();){
            Loan loan=(Loan)i.next();
            if(loan.getBook().matches(book))
                return loan;
        }
        return null;
    }

    //借书，往member里面添加记录
    public void addLoan(Book book,String name){
        Loan loan =null;
        if(book.isLoanTo()) {
            loan = LoanFactory.CreateLoan(book,name);
        }
        member.add(loan);
    }

    //还书
    public final String  Return(Book book) {
        if(book.isLoanTo()){
            return "此书尚没有借出，无需归还";
        }else{
            book.setLoanTo(true);
            return "还书成功";
        }



    }





}
