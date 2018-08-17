package com.totto.mapper;

import java.util.List;

import com.totto.pojo.Student;

public interface StudentMapper {
	public int insert(Student student);
	
	public Student selectById(int id);
	
	public List<Student> selectAll();
	
	public int update(Student student);
	
	public int deleteById(int id);
}
