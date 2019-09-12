package com.david;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() is called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() is called");
        super.move(5);
//        you can use super.move() but it's more concise to just move only because
//        it already inherited parent class
    }

    public void run(){
        System.out.println("Dog.run() is called");
        super.move(10);
        move(11);
//        You can figure out what is difference between using move and super.move
//        Only one different effect is which one will be called when override happens.
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
