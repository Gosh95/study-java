package ch11;

public class Company {//singleton pattern
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
