package com.javayum;

public class loanBook {
    public boolean  validate(Member member,String name,Book book){
        HasReachMaxSpecification hs =new HasReachMaxSpecification();
        LoanOnlyOneSpecification ls=new LoanOnlyOneSpecification();
        return (hs.IsSatisfiedBy(member,name,book)&&ls.IsSatisfiedBy(member,name,book));
    }

    public String loadBook(Member member,String name,Book book){
        if(validate(member,name,book)){
            member.addLoan(book, name);
            return "借书成功";
        }else{
            return "借书失败";
        }

    }

}
