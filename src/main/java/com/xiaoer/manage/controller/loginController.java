package com.xiaoer.manage.controller;

import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xiaoer.manage.entity.Users;
import com.xiaoer.manage.server.userServer;

@RestController
public class loginController {
	@Autowired
	private userServer userserver;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@Param("account")String account,@Param("pass")String pass) {
		Users user=userserver.findUser(account);
		String hashAlgorithName="MD5";
		int hashInterations=1024;
		Object obj= new SimpleHash(hashAlgorithName,pass,account,hashInterations);
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken accountpass =new UsernamePasswordToken(account, String.valueOf(obj));
		try {
			subject.login(accountpass);
		}catch(UnknownAccountException e) {
			e.printStackTrace();
			return "用户名不存在";
		}catch(IncorrectCredentialsException e) {
			e.printStackTrace();
			return "用户名或密码错误";
		};
		return String.valueOf(obj);
	}
	@RequestMapping("/loginout")
	public void loginout() {
		Subject subject= SecurityUtils.getSubject();
		subject.logout();
	}
}
