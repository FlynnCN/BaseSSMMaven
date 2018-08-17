package com.totto.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totto.pojo.Student;
import com.totto.service.StudentService;
import com.totto.utils.TottoResult;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/selectById")
	@ResponseBody
	public Student selectById(Integer id){
		Student student = studentService.selectById(id);
		return student;
	}
	
	@RequestMapping("/selectAll")
	@ResponseBody
	public List<Student> selectAll(){
		List<Student> list = studentService.selectAll();
		return list;
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public TottoResult insert(String name,Integer age){
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		student.setCreatetime(new Date());
		studentService.insert(student);
		System.out.println(student.getId());
		return TottoResult.ok(student);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public TottoResult update(){
		Student student = new Student();
		student.setId(1);
		student.setName("哈哈");
		student.setAge(100);
		student.setCreatetime(new Date());
		studentService.update(student);
		return TottoResult.ok(student);
	}
	
	@RequestMapping("/deleteById")
	@ResponseBody
	public TottoResult deleteById(Integer id){
		studentService.deleteById(id);
		return TottoResult.ok();
	}
}
