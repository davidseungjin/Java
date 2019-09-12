package com.david;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
//
//        dog.eat();
//
//        dog.walk();
//
        dog.run();

        dog.move(7);

        Fish fish = new Fish("Nimo", 2, 2, 3, 4, 1);

        fish.move(15);

        fish.swim(16);

    }
}
