package com.lhy.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.lhy.model.User;
import com.lhy.service.UserService;

public class Job extends QuartzJobBean{
	@Autowired
	private UserService userService;
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		User user  = new User();
		user.setId(1);
		User user1 = userService.getUser(user);
		System.out.println("hello1".concat(user1.getUserName()));
	}

}
