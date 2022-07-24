package org.example;

import kr.tpc.DBConnect;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC29 {
    public static void main(String[] args) {

        // * Oracle, MySQL -> Driver class
        DBConnect dbConnect = new JavaOracle();
        dbConnect.getConnection("url","bit","12345");

        dbConnect = new JavaMySQL();
        dbConnect.getConnection("url","root","ABCDEF");
    }
}
