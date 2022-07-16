package org.example;

public class TPC07 {
    public static void main(String[] args) {
        int a = 20;
        float b=56.7f;

        float v = sum(a,b); // * Call by Value
        System.out.println(sum(a,b)); // * 76.7

        int[] arr = {10,20,30,40,50};
        // * 배열의 총합이 얼마인가?
        int vv = arrSnum(arr); // * Call by Reference
        System.out.println(vv);
    }
    public static float sum(int a, float b){
        return a+b;
    }

    public static int arrSnum(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
