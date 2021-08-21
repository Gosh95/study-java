package report;

import java.util.List;

import grade.GradeEvaluation;
import grade.MajorEvaluation;
import grade.NormalEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import util.Define;

public class MakeReport {
    School school = School.getInstance();
    private static final String TITLE = " 수강생 학점 \t\t\n";
    private static final String HEADER = " 이름  |  학번  |중점과목| 점수   \n";
    private static final String LINE = "---------------------------------\n";
    private StringBuffer sb = new StringBuffer();

    public String readReport() {
        List<Subject> subjectList = school.getSubjectList();

        for (Subject sub : subjectList) {
            makeHeader(sub);
            makeBody(sub);
            makeFooter();
        }

        return sb.toString();
    }

    public void makeHeader(Subject subject) {
        sb.append(MakeReport.LINE);
        sb.append("\t" + subject.getSubjectName());
        sb.append(MakeReport.TITLE);
        sb.append(MakeReport.HEADER);
        sb.append(MakeReport.LINE);
    }

    public void makeBody(Subject subject) {
        List<Student> studentList = subject.getStudentList();

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);

            sb.append(student.getStudentName());
            sb.append(" | ");
            sb.append(student.getStudentId());
            sb.append(" | ");
            sb.append(student.getMajorSubject().getSubjectName() + "\t");
            sb.append(" | ");

            getStudentGrade(student, subject.getSubjectId());
            sb.append("\n");
            sb.append(MakeReport.LINE);
        }
    }

    public void getStudentGrade(Student student, int subjectId) {
        List<Score> scoreList = student.getScoreList();
        int majorId = student.getMajorSubject().getSubjectId();

        GradeEvaluation[] gradeEvaluation = {new NormalEvaluation(), new MajorEvaluation()};

        for (int i = 0; i < scoreList.size(); i++) {
            Score score = scoreList.get(i);
            String grade;

            if (score.getSubject().getSubjectId() == subjectId) {
                if (score.getSubject().getSubjectId() == majorId) {
                    grade = gradeEvaluation[Define.S_TYPE].evaluateGrade(score.getPoint());
                } else {
                    grade = gradeEvaluation[Define.A_TYPE].evaluateGrade(score.getPoint());
                }

                sb.append(score.getPoint());
                sb.append(":");
                sb.append(grade);
                sb.append(" | ");
            }
        }
    }

    public void makeFooter() {
        sb.append("\n");
    }
}
