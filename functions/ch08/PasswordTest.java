package ch08;

public class PasswordTest {
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("패스워드가 null 값 입니다.");
		} else if(password.length() < 6 || password.length() > 20) {
			throw new PasswordException("패스워드를 6 ~ 20자 로 설정해주세요.");
		} else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("패스워드는 숫자나 특수문자를 포함해야 합니다.");
		}
	
		this.password = password;
	}

	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		String password = null;
		try {
			test.setPassword(password);
			System.out.println("complete");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
			//패스워드가 null 값 입니다.
		}
		
		password = "aaaaa"; //length : 5
		try {
			test.setPassword(password);
			System.out.println("complete2");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
			//패스워드를 6 ~ 20자 로 설정해주세요.
		}
		
		password = "aaaaaaaa"; //length : 8
		try {
			test.setPassword(password);
			System.out.println("complete3");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
			//패스워드는 숫자나 특수문자를 포함해야 합니다.
		}
		
		password = "abc123";
		try {
			test.setPassword(password);
			System.out.println("complete4");
			//complete4
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}
