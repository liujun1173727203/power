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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xiaoer.manage.dao.MerchantMapper;
import com.xiaoer.manage.entity.Merchant;

@Component("authorizer")
public class MyShiroRealm extends AuthorizingRealm{

	@Autowired
	private MerchantMapper merchantServer;
	
	private static final Logger logger=LoggerFactory.getLogger(MyShiroRealm.class);
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		logger.info("进行授权");
		SimpleAuthorizationInfo authorizationInfo =new SimpleAuthorizationInfo();
//		SecurityUtils.getSubject().getSession().setAttribute(String.valueOf(user.getId()), SecurityUtils.getSubject().getPrincipals());
//		authorizationInfo.addStringPermission(Integer.toString(user.getAuthority()));
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		logger.info("用户验证");
		String phone=(String)token.getPrincipal();
		Merchant user=merchantServer.getMerhcant(phone);
		if(user==null) {
			throw new UnknownAccountException();
		};
		ByteSource crendentialsSalt=ByteSource.Util.bytes(String.valueOf(user.getiMerPhone()));
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				String.valueOf(user.getiMerPhone()),
				user.getsPass(),
				crendentialsSalt,
				getName()
				);
		return authenticationInfo;
	}

}
