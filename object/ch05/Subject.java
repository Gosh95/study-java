package ch05;

public class Subject {
	String subjectName;
	int subjectScore;
	@Override
	public String toString() {
		return "\n과목 : " + subjectName + ", 점수 : " + subjectScore;
	}
	
	
}
