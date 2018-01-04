package com.lhy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lhy.model.User;
import com.lhy.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class) //指定测试用例的运行器 这里是指定了Junit4    
@ContextConfiguration(locations = {"classpath*:config/*.xml"})//加载配置文件
public class UserInfoTest {
	@Autowired
	private UserService userService;
	@Test
	public void test(){
		User user = new User();
		user.setId(1);
		User userModel = userService.getUser(user);
		System.out.println(userModel);
	}
}
