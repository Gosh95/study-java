package ch07;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("ManualCar drive");
    }

    @Override
    public void stop() {
        System.out.println("ManualCar stop");
    }

    @Override
    public void turnOnCar() {
        System.out.println("turn on ManualCar");
    }

    @Override
    public void turnOffCar() {
        System.out.println("turn off ManualCar");
    }
}
