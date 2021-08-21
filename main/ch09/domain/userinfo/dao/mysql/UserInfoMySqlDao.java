package ch09.domain.userinfo.dao.mysql;

import ch09.domain.userinfo.UserInfo;
import ch09.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert MySql DB user Id : " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update MySql DB user Id : " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete MySql DB user Id : " + userInfo.getUserId());
    }

}
