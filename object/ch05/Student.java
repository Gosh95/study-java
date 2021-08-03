package ch05;

public class Student {
	String studentNumber;
	String studentName;
	
	Subject java;
	Subject python;
	
	public Student(String studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		
		java = new Subject();
		python = new Subject();
	}
	
	public void setSubjectJava(String subjectName, int subjectScore) {
		java.subjectName = subjectName;
		java.subjectScore = subjectScore;
	}
	
	public void setSubjectPython(String subjectName, int subjectScore) {
		python.subjectName = subjectName;
		python.subjectScore = subjectScore;
	}
	
	public String showScore() {
		return studentNumber + ")" + studentName + java.toString() + python.toString();
	}
}
