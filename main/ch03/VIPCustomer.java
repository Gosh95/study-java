package ch03;

public class VIPCustomer extends Customer {//inheritance 상속
	double salesRatio;
	
	public VIPCustomer() {
		super(0, "name"); //상위 클래스에 기본 생성자가 주석처리 됨으로 써 상위 클래스에 맞게 파라미터 입력
		
		salesRatio = 0.1;
		bonusRatio = 0.05;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		salesRatio = 0.1;
		bonusRatio = 0.05;
		customerGrade = "VIP";
	}

	@Override
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
	
	
}
