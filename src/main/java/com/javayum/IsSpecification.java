package com.javayum;

public interface IsSpecification<T>{
    public boolean IsSatisfiedBy(Member member,String name,Book book);
}
