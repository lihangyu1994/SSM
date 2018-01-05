package com.lhy.mapper;

import java.util.Set;

import com.lhy.model.User;

public interface UserMapper {
	
	public User getUser(User user);
	
	public Set<String> findUserRoles(String userName);
	
	public Set<String> findPermissions(String userName);
	
}
