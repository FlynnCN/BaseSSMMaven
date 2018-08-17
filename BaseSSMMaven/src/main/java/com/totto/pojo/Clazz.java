package com.totto.pojo;

import java.io.Serializable;
import java.util.List;

public class Clazz implements Serializable{
	private Integer id;//班级id，主键
	private String code;//班级编号
	private String name;//班级名称
	//班级和老师是一对多的关系，即一个班可以有多个老师
	private List<Teacher> teachers;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
}
