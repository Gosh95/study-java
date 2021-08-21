package ch03;

public class Student {
    String studentId;
    String studentName;
    String address;


    public Student(String studentId, String studentName, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    public void showStudentInfo() { //학생 method
        System.out.println("학번 : " + studentId + " | 이름 : " + studentName + " | 주소 : " + address);
    }


}
