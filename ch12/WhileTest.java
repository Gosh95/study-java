package ch12;

public class WhileTest {

	public static void main(String[] args) {
		int num = 1;
		int total = 0;
		
		while(num <= 10) {
			total += num;
			num++;
		}
		
		System.out.println(num); //11
		System.out.println(total); //55
	}
}
