package kr.poly;

public class TV implements RemoCon{
    int currCH=70;
    @Override
    public void chUp() {
        if(currCH < RemoCon.MAXCH) {
            currCH++;
            System.out.println("채널이 올라간다.:"+currCH);
        }else{
            currCH=RemoCon.MINCH;
            System.out.println("채널이 올라간다.:"+currCH);
        }
    }

    @Override
    public void chDown() {
        if(currCH > RemoCon.MINCH){
            currCH--;
            System.out.println("채널이 내려간다");
        }else{
            currCH = RemoCon.MAXCH;
            System.out.println("채널이 내려간다");
        }
    }

    @Override
    public void Internet() {
        System.out.println("인터넷이 된다.");
    }
    // * 추가적인 기능을 구현
}
