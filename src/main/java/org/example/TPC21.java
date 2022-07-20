package org.example;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
    public static void main(String[] args) {
        // * Animal 부모 클래스를 사용하지 않음
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();

        // * Dog.class, Cat.class
        Animal ani = new Dog(); // * upcasting(업캐스팅: 자동형변환)
        ani.eat();

        ani = new Cat();
        ani.eat();
        ((Cat)ani).night(); // * -> downcasting (다운캐스팅: 강제형변환)
    }
}
