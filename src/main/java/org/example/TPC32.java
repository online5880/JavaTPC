package org.example;

import kr.tpc.A;
import kr.tpc.B;

public class TPC32 {
    public static void main(String[] args) {
        // * A, B 클래스를 저장할 배열
        Object[] o = new Object[2];
        o[0]=new A();
        o[1]=new B();

        printGo(o);
    }
    private static void printGo(Object[] o) {
        for (Object o1 : o) {
            if(o1 instanceof A){
                ((A) o1).go();
            }else{
                ((B)o1).go();
            }
        }
    }
}
