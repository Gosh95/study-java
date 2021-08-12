package ch10;

public class UserHashSetTest {

	public static void main(String[] args) {
		User kim = new User(100, "kim");
		User lee = new User(101, "lee");
		User jun = new User(102, "jun");
		User ko = new User(103, "ko");
		User jin = new User(104, "jin");
		
		User jin2 = new User(104, "jin");
		User jin3 = new User(105, "jin");
		
		UserHashSet userList = new UserHashSet();
		
		userList.addUser(kim);
		userList.addUser(lee);
		userList.addUser(jun);
		userList.addUser(ko);
		userList.addUser(jin);
		userList.addUser(jin2);
		
		userList.showAllUser();
		//not added jin2 
		
		userList.addUser(jin3);
		
		userList.showAllUser();
		//added jin3
	}

}
