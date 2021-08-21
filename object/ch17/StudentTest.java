package ch17;

public class StudentTest {

    public static void main(String[] args) {
        Student studentLee = new Student("lee");
        studentLee.addSubejct("수학", 100);
        studentLee.addSubejct("영어", 100);
        studentLee.showStudentScore();

        System.out.println("=====================");

        Student studentKim = new Student("kim");
        studentKim.addSubejct("수학", 100);
        studentKim.addSubejct("영어", 90);
        studentKim.addSubejct("국어", 80);

        studentKim.showStudentScore();
    }

}
