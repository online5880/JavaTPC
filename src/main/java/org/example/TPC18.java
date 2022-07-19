package org.example;

import kr.tpc.MovieVO;

public class TPC18 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int[] b = {10, 20, 30, 40, 50};
        int[] c = new int[]{10, 20, 30, 40, 50};

        // * 영화(제목, 가격, 주인공, 등급, 시간)
        MovieVO mv = new MovieVO("비트",12000,"연기자",12,1.3f);
        System.out.println(mv);

        MovieVO[] mvArr = new MovieVO[3];
        mvArr[0] = new MovieVO("비트",12000,"연기자",12,1.3f);
        mvArr[1] = new MovieVO("비트1",124000,"연기자1",125,1.31f);
        mvArr[2] = new MovieVO("비트2",127000,"연기자2",1276,1.3213f);

        for (final MovieVO movieVO : mvArr) {
            System.out.println(movieVO);
        }
    }
}

