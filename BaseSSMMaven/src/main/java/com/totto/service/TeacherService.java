package com.totto.service;

import com.totto.pojo.Teacher;

public interface TeacherService {
	public Teacher selectTeacherById(Integer id);
	
	public void insertTeacher(Teacher teacher);
}
