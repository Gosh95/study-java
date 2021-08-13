package ch06;

public class Employee {
	private String name;
	private int career;
	private int annualSalary;
	
	public Employee() {}
	
	public Employee(String name, int career, int annualSalary) {
		this.name = name;
		this.career = career;
		this.annualSalary = annualSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	@Override
	public String toString() {
		return "이름 : " + this.name + " 경력 : " + this.career + "년 연봉 : " + this.annualSalary + "만원";
	}
	
}
