package org.example;

import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC28 {
    public static void main(String[] args) {
        // * RemoCon으로 TV 클래스를 구동하시오.
        RemoCon remoCon = new TV();
        for (int i = 0; i < 40; i++) {
            remoCon.chUp();
        }
        remoCon.chDown();
        remoCon.Internet();
    }
}
