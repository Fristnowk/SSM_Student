package com.itheima.po;
/**
 * 用户POJO类
 */
public class User {
	private int id;        //id
	private String name;  //用户名
	private String password;  //密码
	public Integer getId() {
		return id;
	}
	public void setId(final Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return name;
	}
	public void setUsername(final String username) {
		this.name = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(final String password) {
		this.password = password;
	}
}
