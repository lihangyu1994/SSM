package com.lhy.service;

import java.util.Set;

import com.lhy.model.User;
/**
 * 客户数据查询接口
 * @author Administrator
 *
 */
public interface UserService {
	/**
	 * 查询客户信息
	 * @param user
	 * @return
	 */
	public User getUser(User user);
	/**
	 * 根据客户姓名查询客户角色
	 * @param name
	 * @return
	 */
	public Set<String> findUserRoles(String name);
	/**
	 * 根据客户角色查询权限
	 * @param name
	 * @return
	 */
	public Set<String> findPermissions(String name);

}
