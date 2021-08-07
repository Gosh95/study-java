package ch10;

public class CompleteCalc extends Calculator {

	@Override
	public int divide(int a, int b) {
		return a / b;
	}

	@Override
	public int times(int a, int b) {
		if(a == 0 || b == 0) {
			return ERROR_NUM;
		}
		
		return a * b;
	}
	
	public void showInfo() {
		System.out.println("complete all");
	}

	@Override
	public void description() {
		System.out.println("completeCalc default overriding");
	}
	
	

}
