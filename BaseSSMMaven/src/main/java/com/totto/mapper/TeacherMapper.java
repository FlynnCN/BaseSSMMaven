package com.totto.mapper;

import com.totto.pojo.Teacher;

public interface TeacherMapper {
	public Teacher selectTeacherById(Integer id);
	
	public void insertTeacher(Teacher teacher);
}
