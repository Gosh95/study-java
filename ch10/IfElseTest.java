package ch10;

public class IfElseTest {

	public static void main(String[] args) {
		int age = 10;
		int cost;
		
		if(age >= 20) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("학생입니다.");
		}
		// 학생입니다.
		
		if(age < 8) {
			cost = 0;
			System.out.println("미취학 아동은 " + cost + "원 입니다.");
		} else if(age >= 8 && age < 20) {
			cost = 3000;
			System.out.println("학생은 " + cost + "원 입니다.");
		} else {
			cost = 6000;
			System.out.println("성인은 " + cost + "원 입니다.");
		}
		// 학생은 3000원 입니다.
	}

}
