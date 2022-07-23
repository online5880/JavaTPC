package kr.poly;

public interface RemoCon { // * 객체생성X;
    // * final static(상수)를 사용가능
    int MAXCH=100;
    int MINCH=1;
    // * 추상메서드
    public void chUp();
    public void chDown();
    public void Internet();
}
