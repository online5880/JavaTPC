package org.example;

import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
    public static void main(String[] args) {
        // 관계를 이해하라 PDT vs UDDT
        // 정수 1개를 저장하기 위한 변수를 선언하시오
        int a;
        a = 10;

        // * 책 1권을 저장하기 위한 변수를 선언하시오.
        // * book -> 인스턴스변수(객체 변수) -> 객체
        Book book;
        book = new Book();
        book.title = "자바";
        book.price =  15000;
        book.company = "한빛미디어";
        book.page = 700;

        System.out.print(book.title+"\t");
        System.out.print(book.price+"\t");
        System.out.print(book.company+"\t");
        System.out.println(book.page);

        PersonVO personVO;
        personVO = new PersonVO();
        personVO.name = "마네";
        personVO.age = 26;
        personVO.weight = 78.5f;
        personVO.height = 173.2f;

        System.out.print(personVO.name+"\t");
        System.out.print(personVO.age+"\t");
        System.out.print(personVO.weight+"\t");
        System.out.print(personVO.height);
    }
}
