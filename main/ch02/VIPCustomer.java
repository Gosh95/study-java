package ch02;

public class VIPCustomer extends Customer {//inheritance 상속
	double salesRatio;
	
	public VIPCustomer() {
		super(0, "name"); //상위 클래스에 기본 생성자가 주석처리 됨으로 써 상위 클래스에 맞게 파라미터 입력
		
		this.salesRatio = 0.1;
		this.bonusRatio = 0.05;
		this.customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		this.salesRatio = 0.1;
		this.bonusRatio = 0.05;
		this.customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}

}
