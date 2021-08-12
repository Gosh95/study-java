package ch08;

import java.util.ArrayList;

public class UserArrayList {
	private ArrayList<User> userList;
	
	public UserArrayList() {
		this.userList = new ArrayList<User>();
	}
	
	public UserArrayList(int size) {
		this.userList = new ArrayList<User>(size);
	}
	
	public void addUser(User user) {
		userList.add(user);
	}
	
	public boolean removeUser(int userNumber) {
		for(int i = 0; i < userList.size(); i++) {
			User user = userList.get(i);
			int tempNumber = user.getUserNumber();
			if(tempNumber == userNumber) {
				userList.remove(i);
				return true;
			}
		}
		
		System.out.println(userNumber + "의 유저 정보가 존재하지 않습니다.");
		
		return false;
	}
	
	public void showAllUser() {
		for(User user : userList) {
			System.out.println(user);
		}
		
		System.out.println();
	}
}
