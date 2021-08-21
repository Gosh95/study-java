package test;

import report.MakeReport;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import util.Define;

public class MainTest {
    School school = School.getInstance();

    Subject java;
    Subject python;

    MakeReport mr = new MakeReport();

    public static void main(String[] args) {
        MainTest test = new MainTest();

        test.createSubject();
        test.createStudent();

        String report = test.mr.readReport();
        System.out.println(report);
    }

    public void createSubject() {
        java = new Subject(Define.JAVA, "Java");
        python = new Subject(Define.PYTHON, "Python");

        school.addSubject(java);
        school.addSubject(python);
    }

    public void createStudent() {
        Student kim = new Student(211213, "Kim", java);
        Student lee = new Student(212330, "Lee", python);
        Student ahn = new Student(201518, "Ahn", java);
        Student koo = new Student(202360, "Koo", java);
        Student han = new Student(201290, "Han", python);

        school.addStudent(kim);
        school.addStudent(lee);
        school.addStudent(ahn);
        school.addStudent(koo);
        school.addStudent(han);

        java.register(kim);
        java.register(lee);
        java.register(ahn);
        java.register(koo);
        java.register(han);

        python.register(kim);
        python.register(lee);
        python.register(ahn);
        python.register(koo);
        python.register(han);

        addScoreForStudent(kim, java, 95);
        addScoreForStudent(kim, python, 95);

        addScoreForStudent(lee, java, 100);
        addScoreForStudent(lee, python, 80);

        addScoreForStudent(ahn, java, 75);
        addScoreForStudent(ahn, python, 30);

        addScoreForStudent(koo, java, 90);
        addScoreForStudent(koo, python, 100);

        addScoreForStudent(han, java, 60);
        addScoreForStudent(han, python, 95);

    }

    public void addScoreForStudent(Student student, Subject subject, int point) {
        Score score = new Score(student.getStudentId(), subject, point);
        student.addScore(score);
    }

}
