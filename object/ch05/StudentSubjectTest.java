package ch05;

public class StudentSubjectTest {

	public static void main(String[] args) {
		Student studentLee = new Student("A123", "Lee");
		studentLee.setSubjectJava("java", 100);
		studentLee.setSubjectPython("python", 100);
		
		Student studentKim = new Student("B123", "Kim");
		studentKim.setSubjectJava("java", 50);
		studentKim.setSubjectPython("python", 50);
		
		System.out.println(studentLee.showScore());
		System.out.println(studentKim.showScore());
		
		/*
		A123)Lee
		과목 : java, 점수 : 100
		과목 : python, 점수 : 100
		B123)Kim
		과목 : java, 점수 : 50
		과목 : python, 점수 : 50
		 */
	}

}
