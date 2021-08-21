package ch08;

public class UserArrayListTest {

    public static void main(String[] args) {
        User kim = new User(100, "kim");
        User lee = new User(101, "lee");
        User jun = new User(102, "jun");
        User ko = new User(103, "ko");
        User jin = new User(104, "jin");

        UserArrayList userList = new UserArrayList();
        userList.addUser(kim);
        userList.addUser(lee);
        userList.addUser(jun);
        userList.addUser(ko);
        userList.addUser(jin);
		/*
		 	kim님의 유저넘버는 100입니다.
		 	lee님의 유저넘버는 101입니다.
			jun님의 유저넘버는 102입니다.
			ko님의 유저넘버는 103입니다.
			jin님의 유저넘버는 104입니다.
		 */

        userList.showAllUser();

        userList.removeUser(999);
        //999의 유저 정보가 존재하지 않습니다.

        userList.removeUser(100);
        userList.showAllUser();
		/*
		 	lee님의 유저넘버는 101입니다.
			jun님의 유저넘버는 102입니다.
			ko님의 유저넘버는 103입니다.
			jin님의 유저넘버는 104입니다.
		 */
    }

}
