package com.xiaoer.manage.entity;

public class Merchant{
	private int iMerPhone;
	private String sMerAddress;
	private String sPass;
	public int getiMerPhone() {
		return iMerPhone;
	}
	public void setiMerPhone(int iMerPhone) {
		this.iMerPhone = iMerPhone;
	}
	public String getsMerAddress() {
		return sMerAddress;
	}
	public void setsMerAddress(String sMerAddress) {
		this.sMerAddress = sMerAddress;
	}
	public String getsPass() {
		return sPass;
	}
	public void setsPass(String sPass) {
		this.sPass = sPass;
	}
	@Override
	public String toString() {
		return this.getiMerPhone()+"=="+this.getsPass()+"==============";
	}
}
