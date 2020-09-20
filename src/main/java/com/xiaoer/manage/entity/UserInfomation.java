package com.xiaoer.manage.entity;

import java.util.List;

public class UserInfomation {
	private int iUserId;
	private String sUserName;
	private	int iUserPhone;
	private String sUserPicAddress;
	private List<UserAddress> UserAddresses;
	public int getiUserId() {
		return iUserId;
	}
	public void setiUserId(int iUserId) {
		this.iUserId = iUserId;
	}
	public String getsUserName() {
		return sUserName;
	}
	public void setsUserName(String sUserName) {
		this.sUserName = sUserName;
	}
	public int getiUserPhone() {
		return iUserPhone;
	}
	public void setiUserPhone(int iUserPhone) {
		this.iUserPhone = iUserPhone;
	}
	public String getsUserPicAddress() {
		return sUserPicAddress;
	}
	public void setsUserPicAddress(String sUserPicAddress) {
		this.sUserPicAddress = sUserPicAddress;
	}
	public List<UserAddress> getUserAddresses() {
		return UserAddresses;
	}
	public void setUserAddresses(List<UserAddress> userAddresses) {
		UserAddresses = userAddresses;
	}
}
