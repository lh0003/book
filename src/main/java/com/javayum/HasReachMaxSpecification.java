package com.javayum;

import java.util.List;

public class HasReachMaxSpecification implements IsSpecification {


    @Override
    public boolean IsSatisfiedBy(Member member,String name,Book book) {
        List results=member.search(name);
        if(results.size()<3){
            return true;
        }else{
            return false;
        }
    }
}
