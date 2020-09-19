package com.xiaoer.manage.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://47.104.92.41:9999",maxAge=3600)
public class loginController {
//	@Autowired
//	private userServer userserver;
//	private static final Logger logger=LoggerFactory.getLogger(loginController.class);
//	
//	@RequestMapping(value="/login",method=RequestMethod.POST)
//	public JsonType<Map> login(String account,String pass) {
//		JsonType<Map> json =new JsonType<Map>();
//		Users user=userserver.findUser(account);
//		String hashAlgorithName="MD5";
//		int hashInterations=1024;
//		Object obj= new SimpleHash(hashAlgorithName,pass,account,hashInterations);
//		Subject subject=SecurityUtils.getSubject();
//		UsernamePasswordToken accountpass =new UsernamePasswordToken(account, String.valueOf(obj));
//		try {
//			subject.login(accountpass);
//		}catch(UnknownAccountException e) {
//			e.printStackTrace();
//			json.setCode(202);
//			json.setMsg("用户名不存在");
//			return json;
//		}catch(IncorrectCredentialsException e) {
//			e.printStackTrace();
//			json.setCode(202);
//			json.setMsg("用户名或密码错误");
//			return json;
//		};
//		logger.info("用户："+account+"登录系统");
//		List<Map> list =new ArrayList();
//		Map<String,String> map =new HashMap<String,String>();
//		map.put("token", String.valueOf(obj));
//		list.add(map);
//		json.setData(list);
//		return json;
//	}
//	@RequestMapping("/loginout")
//	public void loginout() {
//		
//		Subject subject= SecurityUtils.getSubject();
//		logger.info(subject.getPrincipal()+"登出");
//		subject.logout();
//	}
}
