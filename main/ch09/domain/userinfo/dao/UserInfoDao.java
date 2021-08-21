package ch09.domain.userinfo.dao;

import ch09.domain.userinfo.UserInfo;

public interface UserInfoDao {
    public void insertUserInfo(UserInfo userInfo);

    public void updateUserInfo(UserInfo userInfo);

    public void deleteUserInfo(UserInfo userInfo);
}
