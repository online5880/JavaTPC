package org.example;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC25 {
    public static void main(String[] args) {
        // * 2. 다형성 배열
        // * Dog, Cat 저장할 배열을 생성하시오.

        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals) {
            animal.eat();
            if(animal instanceof Cat){
                ((Cat)animal).night();
            }
        }

        display(animals);
    }

    private static void display(Animal[] animals) {
        for (Animal animal : animals) {
            animal.eat();
            if(animal instanceof Cat){
                ((Cat)animal).night();
            }
        }
    }
}
