package ch01;
class OutClass {
	private int oNum = 10;
	private static int sNum = 30;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass {
		int inNum = 50;
		
		void inTest() {
			System.out.println("OutClass instance : " + oNum);
			System.out.println("OutClass static : " + sNum);
			System.out.println("InClass instance : " + inNum);
		}
	}
	
	public void usingInClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int inNum = 50;
		static int sInNum = 100;
		void inTest() {
			System.out.println("OutClass static : " + sNum);
			System.out.println("InStaticClass instance : " + inNum);
			System.out.println("InStaticlass static : " + sInNum);
		}
		
		static void inStaticTest() {
			System.out.println("OutClass static : " + sNum);
			//System.out.println("InStaticClass instance : " + inNum); 
			//inNum이 만들어지기 전에 static이 먼저 만들어지므로 사용 불가
			System.out.println("InStaticlass static : " + sInNum);
		}
	}
}

public class InnerClassTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		
		outClass.usingInClass();
		
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		
		sInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass.inStaticTest();
	}

}
