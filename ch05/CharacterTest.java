package ch05;

public class CharacterTest {
	public static void main(String[] args) {
		char char1 = 'A';
		
		System.out.println(char1);
		System.out.println((int)char1); // 65
		
		char char2 = 65;
		
		System.out.println(char2); // char 로 인식되서 A 출력
	
		int char3 = 67;
		
		System.out.println(char3);
		System.out.println((char)char3); // C
		
		char han = '한';
		char uHan = '\uD55C'; // unicode == '한'
		
		System.out.println(han);
		System.out.println(uHan);
	}

}
