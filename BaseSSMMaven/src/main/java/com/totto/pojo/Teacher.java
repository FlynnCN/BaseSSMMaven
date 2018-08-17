package com.totto.pojo;

import java.io.Serializable;

public class Teacher implements Serializable{
	private Integer id;//老师id，主键
	private String name;//老师姓名
	private String sex;//老师性别
	private Integer age;//老师年龄
	//老师和班级是多对一的关系，即一个老师只属于一个班级
	private Clazz clazz;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	
}
