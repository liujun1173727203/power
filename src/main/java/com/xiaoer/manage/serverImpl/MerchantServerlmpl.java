package com.xiaoer.manage.serverImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.xiaoer.manage.dao.MerchantMapper;
import com.xiaoer.manage.entity.Merchant;
import com.xiaoer.manage.server.MerchantServer;

public class MerchantServerlmpl implements MerchantServer{

	@Autowired
	private MerchantMapper merchantMapper;

	@Override
	public Merchant login(String phone, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

}
