package ch09;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public String takeSubway(Subway subway) {
		if(this.money <	subway.subwayFare) {
			return "잔액이 부족합니다.";
		} 
		
		this.money -= subway.subwayFare;
		
		return this.name + "님은 " + subway.subwayName + "를 타서 " + subway.subwayFare + "원을 사용했습니다. \n남은금액 : " + money + "원 입니다.";
	}
	
	public String takeTaxi(Taxi taxi) {
		if(this.money < taxi.taxiFare) {
			return "잔액이 부족합니다.";
		} 
		
		this.money -= taxi.taxiFare;
		
		return this.name + "님은 " + taxi.taxiName + "를 타서 " + taxi.taxiFare + "원을 사용했습니다. \n남은금액 : " + money + "원 입니다.";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", money=" + money + "]";
	}
	
}
