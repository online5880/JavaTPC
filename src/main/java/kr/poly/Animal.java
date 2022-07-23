package kr.poly;

public abstract class Animal {  // * 추상클래스(불완전한객체) Animal ani = new Animal(); X
    // * Dog, Cat -> eat()
    public abstract void eat(); // * 추상메서드(불완전한메서드)
    public void move(){
        System.out.println("무리를 지어서 이동한다.");
    }
}
