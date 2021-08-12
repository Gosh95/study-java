package ch11;

import java.util.Iterator;
import java.util.TreeSet;

public class UserTreeSet {
	private TreeSet<User> userTreeSet;
	
	public UserTreeSet() {
		userTreeSet = new TreeSet<>();
		//Comparator 를 User에서 implements 해서 ()안에 비교 대상(new User)
		//를 넣어줘도 비교가 가능하다.
		//but Comparable을 주로 많이 쓴다고 한다.
	};
	
	public void add(User user) {
		userTreeSet.add(user);
	}
	
	public boolean remove(int userNumber) {
		Iterator<User> irUser = userTreeSet.iterator();
		
		while(irUser.hasNext()) {
			User user = irUser.next();
			int tempNumber = user.getUserNumber();
			
			if(tempNumber == userNumber) {
				userTreeSet.remove(user);
				
				return true;
			}
		}
		
		System.out.println("no data");
		
		return false;
	}
	
	public void showAllUser() {
		for(User user : userTreeSet) {
			System.out.println(user);
		}
		
		System.out.println();
	}

}
