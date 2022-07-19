package org.example;

import kr.tpc.MemberVO;

public class TPC16 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO("홍길동",50,"000-0000-0000","서울");

        System.out.println(m);

        MemberVO m1 = new MemberVO();
        m1.setName("나길동");
        m1.setAge(50);
        m1.setTel("000-0000-0000");
        m1.setAddr("대전");

        System.out.println(m1);
    }
}
