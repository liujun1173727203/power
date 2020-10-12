package com.xiaoer.manage.serverImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xiaoer.manage.dao.MenuMapper;
import com.xiaoer.manage.entity.Menu;
import com.xiaoer.manage.server.MenuServer;
//
//轮播图
//
public class MenuPicServerlmpl implements MenuServer{

	@Autowired
	private MenuMapper menuMapper;
	
	@Override
	public Menu findMenuPic(String id) {
		
		return null;
	}

	@Override
	public List<Menu> getMenuPics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delMenuPic(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addMenuPic(String address) {
		// TODO Auto-generated method stub
		return null;
	}

}
