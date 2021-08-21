package ch10;

import java.util.HashSet;
import java.util.Iterator;

public class UserHashSet {
    private HashSet<User> userList;

    public UserHashSet() {
        this.userList = new HashSet<User>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public boolean removeUser(int userNumber) {
        Iterator<User> irUser = userList.iterator();

        while (irUser.hasNext()) {
            User user = irUser.next();
            int tempNumber = user.getUserNumber();

            if (tempNumber == userNumber) {
                userList.remove(user);

                return true;
            }
        }

        System.out.println(userNumber + "의 유저 정보가 존재하지 않습니다.");

        return false;
    }

    public void showAllUser() {
        for (User user : userList) {
            System.out.println(user);
        }

        System.out.println();
    }
}
