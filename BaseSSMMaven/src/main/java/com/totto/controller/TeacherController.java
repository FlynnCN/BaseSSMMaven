package com.totto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totto.pojo.Clazz;
import com.totto.pojo.Teacher;
import com.totto.service.ClazzService;
import com.totto.service.TeacherService;
import com.totto.utils.TottoResult;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private ClazzService clazzService;
	
	@RequestMapping("/selectTeacherById")
	@ResponseBody
	public Teacher selectTeacherById(Integer id){
		Teacher teacher = teacherService.selectTeacherById(id);
		return teacher;
	}
	
	@RequestMapping("/insertTeacher")
	@ResponseBody
	public TottoResult insertTeacher() {
		Clazz clazz = new Clazz();
		clazz.setCode("123g");
		clazz.setName("PHP基础班");
		clazzService.insertClazz(clazz);
		Teacher teacher = new Teacher();
		teacher.setAge(67);
		teacher.setClazz(clazz);
		teacher.setName("hhh");
		teacher.setSex("男");
		teacherService.insertTeacher(teacher);
		return TottoResult.ok(teacher);
	}
}
