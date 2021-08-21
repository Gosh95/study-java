package ch06;

public class Desktop extends Computer {

    @Override
    public void display() {
        System.out.println("desktop display");

    }

    @Override
    public void typing() {
        System.out.println("desktop typing");
    }

    @Override
    public void turnOff() {
        System.out.println("desktop turn off");
    }

}
