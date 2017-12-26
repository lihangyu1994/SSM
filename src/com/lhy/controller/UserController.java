package com.lhy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhy.model.User;
import com.lhy.service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String checkUser(User user,HttpServletRequest request){
		
		User u = userService.getUser(user);
		if(u==null){
			request.setAttribute("error", "用户不存在");
			return "login";
		}else if(user.getPassWord().equals(u.getPassWord())){
			request.setAttribute("error", "密码不正确");
			return "login";
		}else{
			request.setAttribute("name", u.getUserName());
			return "succeed";   
		}
		  
		
	}
}
