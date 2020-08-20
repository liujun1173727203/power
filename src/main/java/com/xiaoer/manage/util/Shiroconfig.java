package com.xiaoer.manage.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Shiroconfig {
	
	@Bean("shiroFilterFactoryBean")
	public ShiroFilterFactoryBean shiroFilterFactoryBean(org.apache.shiro.mgt.SecurityManager securitymanager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean =new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securitymanager);
		Map<String,String> filterChainDefinitionMap =new LinkedHashMap<String,String>();
		filterChainDefinitionMap.put("/static/**", "anon");
		filterChainDefinitionMap.put("/logout","logout");
		filterChainDefinitionMap.put("/**","authc");
		shiroFilterFactoryBean.setLoginUrl("/login");
		shiroFilterFactoryBean.setUnauthorizedUrl("/403");
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
		return shiroFilterFactoryBean;
	};
	
	@Bean(name="defalutWebSecurityManager")
	public DefaultWebSecurityManager getDefaultSecurityManager(@Qualifier("userRealm")MyShiroRealm userRealm) {
		DefaultWebSecurityManager defaultWebSecurityManger =new DefaultWebSecurityManager();
		defaultWebSecurityManger.setRealm(userRealm);
		return defaultWebSecurityManger;
	}
	
	@Bean(name="userRealm")
	public MyShiroRealm getUserRealm() {
		return new MyShiroRealm();
	}
	
}
