package ch09;

import java.util.ArrayList;
import java.util.Iterator;

import ch08.User;

class UserList {
	private ArrayList<User> userList;
	
	public UserList() {
		this.userList = new ArrayList<User>();
	}
	
	public UserList(int size) {
		this.userList = new ArrayList<User>(size);
	}
	
	public void addUser(User user) {
		userList.add(user);
	}
	
	public void showAllUser() {
		for(User user : userList) {
			System.out.println(user);
		}
		
		System.out.println();
	}
	
	//Iterator
	public boolean removeUser(int userNumber) {
		Iterator<User> irUser = userList.iterator();
		
		while(irUser.hasNext()) {
			User user = irUser.next();
			int tempNumber = user.getUserNumber();
			
			if(tempNumber == userNumber) {
				userList.remove(user);
				
				return true;
			}
		}
		
		System.out.println("no data");
		
		return false;
	}
}

public class UserListIteratorTest {
	

	public static void main(String[] args) {
		User kim = new User(100, "kim");
		User lee = new User(101, "lee");
		User jun = new User(102, "jun");
		User ko = new User(103, "ko");
		User jin = new User(104, "jin");
		
		UserList userList = new UserList();
		userList.addUser(kim);
		userList.addUser(lee);
		userList.addUser(jun);
		userList.addUser(ko);
		userList.addUser(jin);
		
		userList.removeUser(100);
		
		userList.showAllUser();
	}

}
