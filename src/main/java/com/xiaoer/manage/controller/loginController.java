package com.xiaoer.manage.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://47.104.92.41:9999",maxAge=3600)
public class loginController {
//	private static final Logger logger=LoggerFactory.getLogger(loginController.class);
//	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String phone,String pass) {
//		String hashAlgorithName="MD5";
//		int hashInterations=1024;
//		Object obj= new SimpleHash(hashAlgorithName,pass,phone,hashInterations);
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken accountpass =new UsernamePasswordToken(phone, pass);
		try {
			subject.login(accountpass);
		}catch(UnknownAccountException e) {
			e.printStackTrace();
			return "用户不存在";
		}catch(IncorrectCredentialsException e) {
			e.printStackTrace();
			return "用户名或密码错误";
		};
//		logger.info("用户："+account+"登录系统");
		return "success";
	}
	@RequestMapping("/loginout")
	public void loginout() {
		
		Subject subject= SecurityUtils.getSubject();
//		logger.info(subject.getPrincipal()+"登出");
		subject.logout();
	}
}
