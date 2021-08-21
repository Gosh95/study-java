package ch09.domain.userinfo.dao.oracle;

import ch09.domain.userinfo.UserInfo;
import ch09.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert Oracle DB user Id : " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update Oracle user Id : " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete Oracle user Id : " + userInfo.getUserId());
    }

}
