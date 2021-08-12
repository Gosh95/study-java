package ch12;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		//HashMap은 key 와 value 값 쌍으로 자료를 관리한다.
		
		hashMap.put(100, "kim");
		hashMap.put(101, "park");
		hashMap.put(102, "hong");
		
		System.out.println(hashMap.toString());
		//{100=kim, 101=park, 102=hong}
		
		System.out.println();
		
		UserHashMap userHashMap = new UserHashMap();
		
		User kim = new User(100, "kim");
		User lee = new User(101, "lee");
		User jun = new User(102, "jun");
		
		userHashMap.put(kim);
		userHashMap.put(lee);
		userHashMap.put(jun);
		
		userHashMap.showAllUser();
//		kim님의 유저넘버는 100입니다.
//		lee님의 유저넘버는 101입니다.
//		jun님의 유저넘버는 102입니다.
		
		userHashMap.remove(100);
		
		userHashMap.showAllUser();
//		lee님의 유저넘버는 101입니다.
//		jun님의 유저넘버는 102입니다.
		
	}

}
