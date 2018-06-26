package com.javayum;

/**
 * Hello world!
 *
 */
public class App {


    public static void main(String[] args) {
        loanBook lb = new loanBook();
        Member member = new Member();
        Book book1 = new Book("1", "11", "book11", true);
        Book book2 = new Book("2", "12", "book12", true);
        Book book3 = new Book("3", "13", "book13", true);
        Book book4 = new Book("4", "14", "book14", true);

        System.out.println(lb.loadBook(member, "ljg", book1));
        System.out.println(lb.loadBook(member, "ljg", book2));
        System.out.println(lb.loadBook(member, "ljg", book3));
        System.out.println(lb.loadBook(member, "ljg", book4));

        System.out.println( lb.loadBook(member,"lyf",book1));

        System.out.println(member.Return(book1));
        System.out.println( lb.loadBook(member,"lyf",book1));



    }
}