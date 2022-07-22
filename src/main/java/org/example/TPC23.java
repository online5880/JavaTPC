package org.example;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {
    public static void main(String[] args) {

        // * upcasting
        //Animal ani = new Cat();
        //Object ani = new Cat();
        Animal ani = new Cat(); // * upcasting
        ani.eat(); // * 컴파일시점 -> Animal, 실행시점 -> Cat

        //Cat c = (Cat)ani; // * downcasting
        ((Cat)ani).night();

        ani = new Dog();
        ani.eat();
        // * 다형성
        // * 상위클래스가 하위클래스에게 동일한 메시지로 서로 다르게 동작시키는 원리

        Object o = new Dog();
        ((Dog)o).eat();
    }
}
