package ch14;

public class ForTest {
	
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println(sum); // 55
		
		int resultFor = 0;
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				resultFor = i * j;
				System.out.print(i + " x " + j + " = " + resultFor + "| ");
			}
			System.out.println();
		}
		//이중 for문을 활용한 구구단
		
		int a = 1;
		int b = 1;
		int resultWhile= 0;
		
		while(a <= 9) {
			b = 1;
			while(b <= 9) {
				resultWhile = a * b;
				System.out.print(a + " x " + b + " = " + resultWhile + "| ");
				b++;
			}
			a++;
			System.out.println();
		}
		// while문을 활용한 구구단
	}
}
