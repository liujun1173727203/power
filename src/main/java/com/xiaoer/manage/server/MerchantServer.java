package com.xiaoer.manage.server;

import com.xiaoer.manage.entity.Merchant;

public interface MerchantServer {
	Merchant login(String phone,String pass);
}
