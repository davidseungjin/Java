package com.david;


class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.engine = true;
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }

}

class Tesla extends Car {
    public Tesla(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
//         Check this out and see how you can get class name simply!.
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(8, "nice");
        System.out.println(car.startEngine());;
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Tesla myTesla = new Tesla(3,"Davidcar");

        System.out.println(myTesla.startEngine());
        System.out.println(myTesla.accelerate());
        System.out.println(myTesla.brake());

    }
}
