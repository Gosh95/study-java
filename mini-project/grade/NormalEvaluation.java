package grade;

public class NormalEvaluation implements GradeEvaluation{
	
	@Override
	public String evaluateGrade(int score) {
		String grade;
		
		if(score >= 90 && score <= 100) {
			grade = "A";
		} else if(score >= 80 && score < 90) {
			grade = "B";
		} else if(score >= 70 && score < 80) {
			grade = "C";
		} else if(score >= 55 && score < 70) {
			grade = "D";
		} else if(score < 55){
			grade = "F";
		} else {
			System.out.println("check your score again");
			
			return null;
		}
		
		return grade;
	}

}
