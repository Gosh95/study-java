package ch09.domain.userinfo.dao.mssql;

import ch09.domain.userinfo.UserInfo;
import ch09.domain.userinfo.dao.UserInfoDao;

public class UserInfoMsSqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert MsSql DB user Id : " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update MsSql DB user Id : " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete MsSql DB user Id : " + userInfo.getUserId());
	}

}
