package ch01;

public class VIPCustomer extends Customer {//inheritance 상속
	double salesRatio;
	
	public VIPCustomer() {
		this.salesRatio = 0.1;
		this.bonusRatio = 0.05;
		this.customerGrade = "VIP";
	}
}
