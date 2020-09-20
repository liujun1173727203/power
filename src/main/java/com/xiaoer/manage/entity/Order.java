package com.xiaoer.manage.entity;

import java.util.List;

public class Order {
	
	private int iOrderId;
	private int iOrderuId;
	private float fOrderPrice;
	private int iOrderStatus;
	private int iOrderGoodsId;
	private List<Goods> goods;
	public int getiOrderId() {
		return iOrderId;
	}
	public void setiOrderId(int iOrderId) {
		this.iOrderId = iOrderId;
	}
	public int getiOrderuId() {
		return iOrderuId;
	}
	public void setiOrderuId(int iOrderuId) {
		this.iOrderuId = iOrderuId;
	}
	public float getfOrderPrice() {
		return fOrderPrice;
	}
	public void setfOrderPrice(float fOrderPrice) {
		this.fOrderPrice = fOrderPrice;
	}
	public int getiOrderStatus() {
		return iOrderStatus;
	}
	public void setiOrderStatus(int iOrderStatus) {
		this.iOrderStatus = iOrderStatus;
	}
	public int getiOrderGoodsId() {
		return iOrderGoodsId;
	}
	public void setiOrderGoodsId(int iOrderGoodsId) {
		this.iOrderGoodsId = iOrderGoodsId;
	}
	public List<Goods> getGoods() {
		return goods;
	}
	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
}
