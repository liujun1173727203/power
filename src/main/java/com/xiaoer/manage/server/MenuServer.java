package com.xiaoer.manage.server;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xiaoer.manage.entity.Menu;

@Service
public interface MenuServer {
	Menu findMenuPic(String id);
	List<Menu> getMenuPics();
	Boolean delMenuPic(String id);
	Boolean addMenuPic(String address);
}
