package com.xiaoer.manage.entity;

public class Goods {
	
	private int iGoodsId;
	private String sGoodsName;
	private Float fPrice;
	private int iState;
	private String sGoodsIntroduction;
	private String sPicAddress;
	public int getiGoodsId() {
		return iGoodsId;
	}
	public void setiGoodsId(int iGoodsId) {
		this.iGoodsId = iGoodsId;
	}
	public String getsGoodsName() {
		return sGoodsName;
	}
	public void setsGoodsName(String sGoodsName) {
		this.sGoodsName = sGoodsName;
	}
	public Float getfPrice() {
		return fPrice;
	}
	public void setfPrice(Float fPrice) {
		this.fPrice = fPrice;
	}
	public int getiState() {
		return iState;
	}
	public void setiState(int iState) {
		this.iState = iState;
	}
	public String getsGoodsIntroduction() {
		return sGoodsIntroduction;
	}
	public void setsGoodsIntroduction(String sGoodsIntroduction) {
		this.sGoodsIntroduction = sGoodsIntroduction;
	}
	public String getsPicAddress() {
		return sPicAddress;
	}
	public void setsPicAddress(String sPicAddress) {
		this.sPicAddress = sPicAddress;
	}
}
