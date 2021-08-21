package ch09;

class User {
    private String name;
    MyLogger myLogger = MyLogger.getLogger();

    public User(String name) {
        if (name == null) {
            throw new UserNameException("name must not be null");
        } else if (name.length() > 10) {
            throw new UserNameException("name is too long");
        }

        this.name = name;
    }

}

public class UserLoggerTest {

    public static void main(String[] args) {
        MyLogger myLogger = MyLogger.getLogger();

        String name = null;

        try {
            User user = new User(name);
        } catch (UserNameException e) {
            myLogger.warning(e.getMessage());
            //8월 15, 2021 2:55:56 오전 ch09.MyLogger warning
            //WARNING: name must not be null
        }

        try {
            User user = new User("blablablablablablablablalbalbal");
        } catch (UserNameException e) {
            myLogger.warning(e.getMessage());
            //8월 15, 2021 2:55:56 오전 ch09.MyLogger warning
            //WARNING: name is too long
        }

        User user = new User("kim"); //no error
    }

}
