package ch03;

public class StringTest {

	public static void main(String[] args) {
		String java = new String("java");
		String springBoot= new String("spring-boot");
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(System.identityHashCode(sb)); 
		sb.append(java);
		sb.append(springBoot);
		System.out.println(System.identityHashCode(sb)); //append 전 후 메모리 값은 동일하다.
		
		String sbResult = sb.toString();
		
		System.out.println(sbResult); //javaspring-boot
		
		String textBlocks = """ 
				Hello,
				Hi,
				Bye
				""";
		//textBlock """ 후 이어쓰면 됨 so easy
		
		System.out.println(textBlocks);
	}

}
