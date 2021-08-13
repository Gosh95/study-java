package ch04;

public class StringConcatTest {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Java";
		
		StringConcat string = new StringConcatClass();
		string.makeString(s1, s2);
		//일반적으로 클래스를 만들고 인터페이스를 implements 했을때
		//Hello, Java
		
		StringConcat concat = (s, v) -> System.out.println(s1 + ", " + s2);
		
		concat.makeString(s1, s2);
		//interface를 functional로 바꿔주고 lambda를 썼을때
		//Hello, Java
		
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s, String v) {
				System.out.println(s + "\t" + v);
			}
			
		}; //lambda는 익명 클래스를 사용해서 이루어 진다.
		
		concat2.makeString(s1, s2); //Hello	Java
		
	}

}
