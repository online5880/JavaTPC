package org.example;

import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC27 {
    public static void main(String[] args) {

        RemoCon r =new TV();
        r.chUp();
        r.chDown();
        r.Internet();

        r = new Radio();
        r.chUp();
        r.chDown();
        r.Internet();
    }
}
