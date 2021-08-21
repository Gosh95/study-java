package ch12;

import java.util.HashMap;
import java.util.Iterator;

public class UserHashMap {
    private HashMap<Integer, User> userHashMap;

    public UserHashMap() {
        userHashMap = new HashMap<>();
    }

    public void put(User user) {
        userHashMap.put(user.getUserNumber(), user);
    }

    public boolean remove(int userNumber) {
        if (userHashMap.containsKey(userNumber)) {
            userHashMap.remove(userNumber);

            return true;
        }

        System.out.println("no data");

        return false;
    }

    public void showAllUser() {
        Iterator<Integer> irKey = userHashMap.keySet().iterator();
        //HashMap은 keySet()을 한다음 iterator를 해줘야 한다.

        while (irKey.hasNext()) {
            int tempKey = irKey.next();
            User user = userHashMap.get(tempKey);

            System.out.println(user.toString());
        }

        System.out.println();
    }
}
