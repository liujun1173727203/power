package com.xiaoer.manage.serverImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoer.manage.dao.userMapper;
import com.xiaoer.manage.entity.Users;
import com.xiaoer.manage.server.userServer;

@Service
public class userServerImpl implements userServer{

	@Autowired
	private userMapper usermapper;
	@Override
	public List<Users> getUsers() {
		List<Users> users=usermapper.selectUsers();
		for(Users user:users) {
			user.setPass(null);
		};
		return users;	
	}

	@Override
	public Users findUser(String account) {
		// TODO Auto-generated method stub
		return usermapper.findUser(account);
	}

	@Override
	public Boolean addUser(Users user) {
		return usermapper.addUser(user);
	}

	@Override
	public Boolean delUser(String account) {
		// TODO Auto-generated method stub
		return usermapper.delUser(account);
	}

	@Override
	public Boolean updateUser(Users user) {
		// TODO Auto-generated method stub
		return usermapper.updateUser(user);
	}

}
