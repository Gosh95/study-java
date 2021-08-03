package ch02;

public class FunctionTest {
	public static int add(int aNum, int bNum) {
		int result = aNum + bNum; // 지역 변수(스택 메모리) 함수가 종료되면 사라진다
		
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int oneToX(int x) {
		int result = 0;
		
		for(int i = 1; i <= x; i++) {
			result += i;
		}
		
		return result;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		int total = add(a, b);
		System.out.println(total); //20
		
		sayHello("Hello World"); //Hello World
		
		total = oneToX(a);
		
		System.out.println(total); //55
	}

}
