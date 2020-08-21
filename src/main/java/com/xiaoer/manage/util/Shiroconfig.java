package com.xiaoer.manage.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Shiroconfig {
	
	//设置加密方式	
	@Bean("hashedCredentialsMatcher")
	public HashedCredentialsMatcher hashedCredentialsMatcher() {
		HashedCredentialsMatcher credentialsMatcher =new HashedCredentialsMatcher();
		credentialsMatcher.setHashAlgorithmName("MD5");
		credentialsMatcher.setHashIterations(1024);
		credentialsMatcher.setStoredCredentialsHexEncoded(true);
		return credentialsMatcher;
	}
	@Bean("shiroFilterFactoryBean")
	public ShiroFilterFactoryBean shiroFilterFactoryBean(org.apache.shiro.mgt.SecurityManager securitymanager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean =new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securitymanager);
		Map<String,String> filterChainDefinitionMap =new LinkedHashMap<String,String>();
		filterChainDefinitionMap.put("/static/**", "anon");
		filterChainDefinitionMap.put("/logout","logout");
		filterChainDefinitionMap.put("/**", "user");
		filterChainDefinitionMap.put("/**","authc");
		shiroFilterFactoryBean.setLoginUrl("/login");
		shiroFilterFactoryBean.setUnauthorizedUrl("/403");
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
		return shiroFilterFactoryBean;
	};
	
	@Bean(name="defalutWebSecurityManager")
	public DefaultWebSecurityManager getDefaultSecurityManager(@Qualifier("userRealm")MyShiroRealm userRealm,@Qualifier("ehCacheManager") EhCacheManager ehCacheManager) {
		DefaultWebSecurityManager defaultWebSecurityManger =new DefaultWebSecurityManager();
		defaultWebSecurityManger.setRealm(userRealm);
		defaultWebSecurityManger.setCacheManager(ehCacheManager);
		defaultWebSecurityManger.setRememberMeManager(rememberMeManager());
		return defaultWebSecurityManger;
	}
	
	@Bean(name="ehCacheManager")
	public EhCacheManager ehCacheManager() {
	    EhCacheManager ehCacheManager = new EhCacheManager();
	    ehCacheManager.setCacheManagerConfigFile("classpath:config/ehcache-shiro.xml");
	    return ehCacheManager;
	}
	@Bean(name="userRealm")
	public MyShiroRealm getUserRealm() {
		return new MyShiroRealm();
	}
	@Bean
	public CookieRememberMeManager rememberMeManager(){
	    CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
	    cookieRememberMeManager.setCookie(rememberMeCookie());
	    //rememberMe cookie加密的密钥 建议每个项目都不一样 默认AES算法 密钥长度(128 256 512 位)
	    cookieRememberMeManager.setCipherKey(Base64.decode("2AvVhdsgUs0FSA3SDFAdag=="));
	    return cookieRememberMeManager;
	}
	@Bean
	public SimpleCookie rememberMeCookie(){
	    //这个参数是cookie的名称，对应前端的checkbox的name = rememberMe
	    SimpleCookie simpleCookie = new SimpleCookie("rememberMe");
	    //<!-- 记住我cookie生效时间30天 ,单位秒;-->
	    simpleCookie.setMaxAge(259200);
	    return simpleCookie;
	}
}
