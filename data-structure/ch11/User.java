package ch11;

public class User implements Comparable<User> {
    private int userNumber;
    private String userName;

    public User() {
    }

    public User(int userNumber, String userName) {
        this.userNumber = userNumber;
        this.userName = userName;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return userName + "님의 유저넘버는 " + userNumber + "입니다.";
    }

    @Override
    public int compareTo(User o) {
        return this.userNumber - o.userNumber;

    }

}
