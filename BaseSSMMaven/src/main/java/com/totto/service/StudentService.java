package com.totto.service;

import java.util.List;

import com.totto.pojo.Student;
import com.totto.utils.TottoResult;

public interface StudentService {
	
	public TottoResult insert(Student student);
	
	public Student selectById(int id);
	
	public List<Student> selectAll();
	
	public TottoResult update(Student student);
	
	public TottoResult deleteById(int id);
}
