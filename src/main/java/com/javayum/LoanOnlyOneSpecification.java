package com.javayum;

public class LoanOnlyOneSpecification implements IsSpecification {

    @Override
    public boolean IsSatisfiedBy(Member memberm,String name,Book book) {
        if(book.isLoanTo()){
            return true;
        }else{
            return false;
        }
        }
    }

