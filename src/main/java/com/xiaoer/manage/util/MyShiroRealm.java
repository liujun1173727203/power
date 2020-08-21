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
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xiaoer.manage.entity.Users;
import com.xiaoer.manage.server.userServer;

@Component("authorizer")
public class MyShiroRealm extends AuthorizingRealm{

	@Autowired
	private userServer userserver;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo authorizationInfo =new SimpleAuthorizationInfo();
		Users user=userserver.findUser(String.valueOf(principals.getPrimaryPrincipal()));
		authorizationInfo.addStringPermission(Integer.toString(user.getAuthority()));
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String account=(String)token.getPrincipal();
		Users user=userserver.findUser(account);
		if(user==null) {
			throw new UnknownAccountException();
		};
		ByteSource crendentialsSalt=ByteSource.Util.bytes(user.getAccount());
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				user.getAccount(),
				user.getPass(),
				crendentialsSalt,
				getName()
				);
		return authenticationInfo;
	}

}
