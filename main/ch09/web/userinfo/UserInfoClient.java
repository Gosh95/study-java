package ch09.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch09.domain.userinfo.UserInfo;
import ch09.domain.userinfo.dao.UserInfoDao;
import ch09.domain.userinfo.dao.mssql.UserInfoMsSqlDao;
import ch09.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch09.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);
        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("user id");

        UserInfoDao userInfoDao = null;

        if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        } else if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else {
            userInfoDao = new UserInfoMsSqlDao();
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }

}
