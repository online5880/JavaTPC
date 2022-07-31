package org.example;

import kr.tpc.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class TPC38 {
    public static void main(String[] args) {

        List<BookDTO> list = new ArrayList<BookDTO>();
        list.add(new BookDTO("자바",12000,"이지스",600));
        list.add(new BookDTO("C언어",17000,"에이콘",700));
        list.add(new BookDTO("Python",12000,"제이펍",690));

        for (BookDTO o : list) {
            System.out.println(o.title+"\t"+ o.price+"\t"+ o.company+"\t"+ o.page);
        }
    }
}
