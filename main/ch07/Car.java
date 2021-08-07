package ch07;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void turnOnCar() {
		System.out.println("turn on car");
	}
	
	public void turnOffCar() {
		System.out.println("turn off car");
	}
	
	final public void run() { //바뀌면 안되는 메소드 == final
		turnOnCar();
		drive();
		stop();
		turnOffCar();
	}
}
