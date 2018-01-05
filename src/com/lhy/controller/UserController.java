package com.lhy.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lhy.model.User;
import com.lhy.service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserService userService;
	
/*	@RequestMapping("/login")
	public String checkUser(User user,Model model){
		User u = userService.getUser(user);
		if(u==null){
			model.addAttribute("error", "用户不存在");
			return "login";
		}else if(user.getPassWord().equals(u.getPassWord())){
			model.addAttribute("error", "密码不正确");
			return "login";
		}else{
			model.addAttribute("name", u.getUserName());
			return "succeed";   
		}
	}*/
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User user,Model model,HttpSession session){
		 Subject subject = SecurityUtils.getSubject();
		 UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPassWord());
		 try{
			 subject.login(token);
			 session.setAttribute("userId", user.getId());
		     session.setAttribute("userName", user.getUserName());
		     return "succeed";
		 }catch(Exception e){
			 model.addAttribute("error","登录账户或密码错误");
			 return "login";
		 }
		
	}
}
