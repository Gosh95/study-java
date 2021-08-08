package ch02;

public class Student implements Cloneable {
	private String studentName;
	private int studentNumber;
	
	public Student(String studentName, int studentNumber) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentNumber=" + studentNumber + "]";
	}

	@Override
	public int hashCode() {//hashCode 도 재정의
		return studentNumber;
	}

	@Override
	public boolean equals(Object obj) {//학번이 같으면 같은 학생으로 취급해야하기 때문에 간단하게 equals를 재정의 한다.
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(this.studentNumber == student.studentNumber) {
				return true;
			} 
		}
		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
