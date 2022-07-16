package org.example;

public class TPC04 {
    public static void main(String[] args) {
        // * 4. 데이터를 이동하라(변수 vs 배열)
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;
        // * a+b+c=? 메서드 처리 -> hap()
        hap(a,b,c);

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        hap1(arr);
    }
    public static void hap(int x, int y, int z){
        System.out.println(x+y+z);
    }

    public static void hap1(int[] x){
        int r = 0;
        for (int i : x) {
            r+=i;
        }
        System.out.println(r);
    }
}
