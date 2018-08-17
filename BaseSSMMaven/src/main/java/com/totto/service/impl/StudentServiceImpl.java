package com.totto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totto.mapper.StudentMapper;
import com.totto.pojo.Student;
import com.totto.service.StudentService;
import com.totto.utils.TottoResult;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;

	public TottoResult insert(Student student) {
		studentMapper.insert(student);
		return TottoResult.ok();
	}

	public Student selectById(int id) {
		return studentMapper.selectById(id);
	}

	public List<Student> selectAll() {
		return studentMapper.selectAll();
	}

	public TottoResult update(Student student) {
		studentMapper.update(student);
		return TottoResult.ok();
	}

	public TottoResult deleteById(int id) {
		studentMapper.deleteById(id);
		return TottoResult.ok();
	}
	

}
