package ch02;

public class StudentTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student student1 = new Student("lee", 100);
		Student student2 = new Student("lee", 100);
		
		System.out.println(student1.equals(student2)); //override 했기 때문에 true 출력
		
		System.out.println(student1.hashCode()); //100
		System.out.println(student2.hashCode()); //100
		
		/*  본래 hashCode 값
		System.out.println(System.identityHashCode(student1));
		System.out.println(System.identityHashCode(student2)); 
		*/
		
		Student student3 = (Student)student1.clone();
		System.out.println(student3); 
		//clone 은 객체 지향의 정보은닉, 객체 보호의 관점에서 위배될 수 있다. 원본이 바뀌면 같이 동적으로 바뀐다.
		//클래스에 cloneable을 구현 해주고 재정의 해줘야 한다.
	}

}
