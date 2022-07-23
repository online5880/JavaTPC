package kr.poly;

public class TV implements RemoCon{
    @Override
    public void chUp() {
        System.out.println("채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("채널이 내려간다");
    }

    @Override
    public void Internet() {
        System.out.println("인터넷이 된다.");
    }
    // * 추가적인 기능을 구현
}
