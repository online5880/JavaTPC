package kr.tpc;

public class JavaMySQL implements DBConnect{
    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("MySQL DB가 연결됩니다.");
    }
}
