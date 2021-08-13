package ch03;

@FunctionalInterface
//함수형 인터페이스라는 의미의 어노테이션
interface MyNumber {
	public int getMax(int x, int y);
	//public int getMin(int x, int y);
	//익명 함수와 매개 변수로만 구현되므로 하나의 메서드만 선언해야 한다.
}

public class MyNumberTest {

	public static void main(String[] args) {
		MyNumber myNumber = (x, y) -> x >= y ? x : y;//if문으로 해도 됨
		
		int maxNum = myNumber.getMax(10, 20);
		
		System.out.println(maxNum); //20
	}

}
