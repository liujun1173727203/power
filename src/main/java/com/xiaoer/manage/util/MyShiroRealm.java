package com.xiaoer.manage.util;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.xiaoer.manage.entity.Merchant;

@Component("authorizer")
public class MyShiroRealm extends AuthorizingRealm{

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}
	
//	private static final Logger logger=LoggerFactory.getLogger(MyShiroRealm.class);
//	@Override
//	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//		logger.info("进行授权");
//		SimpleAuthorizationInfo authorizationInfo =new SimpleAuthorizationInfo();
////		SecurityUtils.getSubject().getSession().setAttribute(String.valueOf(user.getId()), SecurityUtils.getSubject().getPrincipals());
//		authorizationInfo.addStringPermission(Integer.toString(user.getAuthority()));
//		return authorizationInfo;
//	}
//
//	@Override
//	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//		logger.info("用户验证");
//		String account=(String)token.getPrincipal();
//		Merchant user=userserver.findUser(account);
//		if(user==null) {
//			throw new UnknownAccountException();
//		};
//		ByteSource crendentialsSalt=ByteSource.Util.bytes(user.getAccount());
//		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
//				user.getAccount(),
//				user.getPass(),
////				crendentialsSalt,
//				getName()
//				);
//		return authenticationInfo;
//	}

}
