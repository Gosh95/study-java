package ch12;

public class Car {
	private static int serialNum = 100;
	private int carNum;
	
	public Car() {
		this.carNum = serialNum++;
	}
	
	public int getCarNum() {
		return carNum;
	}
}
