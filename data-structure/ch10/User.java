package ch10;

public class User {
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
    public int hashCode() {
        return userNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;

            if (user.userNumber == this.userNumber) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }


}
