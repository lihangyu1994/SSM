package com.lhy.model;

public class User {
	/**用户id*/
	private Integer id;
	/**用户名*/
	private String userName;
	/**密码*/
	private String passWord;
	/**角色id*/
	private int roleId;
	
	
	/**用户id*/
	public Integer getId() {
		return id;
	}
	/**用户名*/
	public String getUserName() {
		return userName;
	}
	/**密码*/
	public String getPassWord() {
		return passWord;
	}
	/**角色id*/
	public int getRoleId() {
		return roleId;
	}
	/**用户id*/
	public void setId(Integer id) {
		this.id = id;
	}
	/**用户名*/
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**密码*/
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	/**角色id*/
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	
	
	
}
