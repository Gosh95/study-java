package ch07;

public class AiCar extends Car{
	@Override
	public void drive() {
		System.out.println("AiCar drive");
	}

	@Override
	public void stop() {
		System.out.println("AiCar stop");
	}
	
	@Override
	public void turnOnCar() {
		System.out.println("turn on AiCar");
	}
	
	@Override
	public void turnOffCar() {
		System.out.println("turn off AiCar");
	}
}
