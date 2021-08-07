package ch08;

public class CalcTest {

	public static void main(String[] args) {
		int numA = 10;
		int numB = 5;
		
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(numA, numB)); //15
		System.out.println(calc.substract(numA, numB)); //5
		System.out.println(calc.times(numA, numB)); //50
		System.out.println(calc.divide(numA, numB)); //2 
	}

}
