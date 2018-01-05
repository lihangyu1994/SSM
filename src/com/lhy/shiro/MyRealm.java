package com.lhy.shiro;

import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.lhy.model.User;
import com.lhy.service.UserService;

public class MyRealm extends AuthorizingRealm{
	
	@Autowired
	 private UserService userService;
	/**
	 * 用户权限的验证
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		String userName = principalCollection.getPrimaryPrincipal().toString();
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		Set<String> roles = userService.findUserRoles(userName);
		Set<String> permissions = userService.findPermissions(userName);
		info.setRoles(roles);
		info.setStringPermissions(permissions);
		return info;
	}
	/**
	 * 登录验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		String userName = arg0.getPrincipal().toString();
		User user =new User();
		user.setUserName(userName);
		User userModel = userService.getUser(user);
		if(userModel!=null){
			 //将查询到的用户帐号存放到authenticationInfo用于后面权限判断。第三个参数随便放什么参数
			 AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userModel.getUserName(),userModel.getPassWord(),"a");
			 return authenticationInfo;
		}
		return null;
	}

}
