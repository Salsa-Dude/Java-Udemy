package com.Joseph;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManuel;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManuel) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManuel = isManuel;
        this.currentGear = 1;
    }

    public void changeGear(int gear) {
        this.currentGear = gear;
        System.out.println("Switching gear to " + this.currentGear);
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity() Velocity " + speed + " direction " + direction);
    }

}
