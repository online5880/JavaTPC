package kr.poly;

public class Dog extends Animal {
    // * 이름, 나이, 종 : 상태정보

    @Override
    public void eat() {
        System.out.println("개처럼 먹다");
    }
    public Dog(){
        super(); // * new Animal() 호출 하는거랑 비슷하다.
    }
}
