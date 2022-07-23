package org.example;

import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC26 {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
    }
}
