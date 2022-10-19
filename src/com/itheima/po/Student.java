package com.itheima.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable{

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String id;

	private String name;

	private String profession;//专业
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	private String age;//年龄
	private String gender;//性别


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		
		return "Student  [id=" + id + ", name=" + name + ", profession=" + profession
				+ ", age=" + age + ", gender=" + gender + "]";
	}

}
