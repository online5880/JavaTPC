package org.example;
import com.google.gson.Gson;
import kr.tpc.BookVO;
import kr.tpc.MyUtil;

import java.lang.*; // * 디폴트 패키지(생략)

public class TPC19 {
    public static void main(String[] args) {
        // * 1. Java에서 제공해주는 class들.. API
        // * 문자열(String)
        String str = new String("APPLE");
        System.out.println(str.toLowerCase());

        // * 2. 직접 만들어서 상용하는 class들... DTO/VO, DAO, Utility ... API
        MyUtil my = new MyUtil();
        int sum = my.hap();
        System.out.println(sum);

        // * 3. 다른 회사에서 만들어 놓은 class들 ... API
        // * Gson -> json
        Gson g = new Gson();
        BookVO vo = new BookVO("자바",13000,"영진",800);
        String json = g.toJson(vo);
        System.out.println(json);
    }
}

