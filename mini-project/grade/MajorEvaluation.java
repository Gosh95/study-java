package grade;

public class MajorEvaluation implements GradeEvaluation {
	

	@Override
	public String evaluateGrade(int score) {
		String grade;
		
		if(score >= 95 && score <= 100) {
			grade = "S";
		} else if(score >= 90 && score < 95) {
			grade = "A";
		} else if(score >= 80 && score < 90) {
			grade = "B";
		} else if(score >= 70 && score < 80) {
			grade = "C";
		} else if(score >= 60 && score < 70){
			grade = "D";
		} else if(score < 60) {
			grade = "F";
		} else {
			System.out.println("check your score again");
			
			return null;
		}
		
		return grade;
	}

}
