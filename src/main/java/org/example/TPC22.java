package org.example;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
    public static void main(String[] args) {

        Dog d= new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();

        // * Dog.class, Cat.class
        Animal ani = new Dog(); // * upcasting
        ani.eat();

        ani = new Cat();
        //ani.eat();
        //Cat cc = (Cat) ani;
        //cc.night();
        ((Cat)ani).night(); // * downcasting
    }
}
