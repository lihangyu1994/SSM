package com.lhy.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhy.mapper.UserMapper;
import com.lhy.model.User;
import com.lhy.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User getUser(User user) {
		return userMapper.getUser(user);
	}
	@Override
	public Set<String> findUserRoles(String name) {
		return userMapper.findUserRoles(name);
	}
	@Override
	public Set<String> findPermissions(String name) {
		return userMapper.findPermissions(name);
	}

}
