package org.example;

import kr.tpc.MemberVO;

public class TPC15 {
    public static void main(String[] args) {

        MemberVO m = new MemberVO();
        m.setName("홍길동");
        m.setAge(50);
        m.setTel("000-0000-0000");
        m.setAddr("서울");

        System.out.print(m.getName()+"\t");
        System.out.print(m.getAge()+"\t");
        System.out.print(m.getTel()+"\t");
        System.out.println(m.getAddr()+"\t");
    }
}
