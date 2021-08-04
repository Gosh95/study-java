package ch17;

import java.util.ArrayList;

public class Student {
	private static int serialNum = 1000;
	String studentName;
	int studentNumber;
	ArrayList<Subject> subjectList;
	
	public Student(String studentName) {
		this.studentName = studentName;
		this.studentNumber = serialNum++;
		subjectList = new ArrayList<>();
	}
	
	public void addSubejct(String subjectName, int subjectScore) {
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setSubjectScore(subjectScore);
		
		subjectList.add(subject);
	}
	
	public void showStudentScore() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getSubjectScore();
			
			System.out.println("학생 " + studentName + "의 " + subject.getSubjectName() + " 과목 성적은 " + 
			        subject.getSubjectScore() + "입니다.");
		}
		
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}
 }
