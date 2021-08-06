package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10, "lee");
		customerLee.bonusPoint = 10000;
		int price = customerLee.calPrice(10000);
		System.out.println(customerLee.showCustomerInfo() + ", " + price);
		
		VIPCustomer customerKim = new VIPCustomer(10, "kim");
		customerKim.bonusPoint = 10000;
		price = customerKim.calPrice(10000);
		System.out.println(customerKim.showCustomerInfo() + ", " + price);
		
		Customer vc = new VIPCustomer(3, "name");
		System.out.println(vc.calPrice(10000)); 
		//9000 가상 메서드 
		//타입은 Customer 이나 재정의 된 경우는 VIPCustomer의 calc로 나오고 재정의가 안됬을 경우는 그대로 Customer의 calc로 나온다
	}

}
