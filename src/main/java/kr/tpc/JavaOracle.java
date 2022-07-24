package kr.tpc;

public class JavaOracle implements DBConnect{
    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("오라클 DB를 연결합니다.");
    }
}
