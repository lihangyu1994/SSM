package com.lhy.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.lhy.model.User;
import com.lhy.utils.GsonUtil;
/**Gson测试类*/
public class GsonTest {
	@Test
	public void gsonTest(){
		User user  = new User();
		user.setUserName("allen");
		user.setId(1);
		user.setPassWord("123qwe");
		//把对象转换成json
		String json = GsonUtil.GsonString(user);
		System.out.println(json);
		//把json转换成对象
		User user1 = GsonUtil.GsonToBean(json,User.class);
		System.out.println(user1.toString());
		User user2 = new User();
		user2.setId(2);
		user2.setPassWord("123qwe");
		user2.setUserName("张三");
		List<User> list = new ArrayList<User>();
		list.add(user1);
		list.add(user2);
		System.out.println(list);
		//把list转换成json字段串
		String jsonList = GsonUtil.GsonString(list);
		System.out.println(jsonList);
		//把list的json字段串转换成List集合
		System.out.println(GsonUtil.GsonToList(jsonList,User.class));
		
	}
}
