package com.lhy.quartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhy.model.User;
import com.lhy.service.UserService;

@Service
public class quartzTest {
	@Autowired
	private UserService userService;
    public void run() {
		User user  = new User();
		user.setId(1);
		User user1 = userService.getUser(user);
		System.out.println("hello ".concat(user1.getUserName()));
    }
}
