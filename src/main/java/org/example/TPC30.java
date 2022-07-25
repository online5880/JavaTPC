package org.example;

import kr.tpc.A;

public class TPC30 {
    public static void main(String[] args) {

        A a = new A();
        a.display();
        System.out.println(a.toString());
        System.out.println(a);

        Object o = new A(); // * upcasting
        ((A)o).display();
    }
}
