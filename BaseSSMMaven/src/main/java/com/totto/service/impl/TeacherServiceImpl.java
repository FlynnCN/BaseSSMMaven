package com.totto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totto.mapper.TeacherMapper;
import com.totto.pojo.Teacher;
import com.totto.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherMapper teacherMapper;
	
	@Override
	public Teacher selectTeacherById(Integer id) {
		return teacherMapper.selectTeacherById(id);
	}

	@Override
	public void insertTeacher(Teacher teacher) {
		teacherMapper.insertTeacher(teacher);
	}

}
